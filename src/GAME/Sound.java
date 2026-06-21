package GAME;

import javax.sound.sampled.*;
import java.util.Objects;

public class Sound {

    private int Sound_off = 0;
    private Clip clip;

    private static final Sound sound1 = new Sound("/sounds/pacman_beginning.wav");
    private static final Sound sound2 = new Sound("/sounds/pacman_chomp.wav");
    private static final Sound sound3 = new Sound("/sounds/pacman_death.wav");

    public Sound(String fileName) {
        try {
            java.net.URL resourceUrl = Sound.class.getResource(fileName);
            AudioInputStream ais = AudioSystem.getAudioInputStream(
                Objects.requireNonNull(resourceUrl, "Sound resource not found at: " + fileName)
            );
            clip = AudioSystem.getClip();
            clip.open(ais);
        } catch (Exception e) {
            System.err.println("Error initializing sound for " + fileName + ": " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void play() {
        if(Sound_off == 0) { 
            try {
                if (clip != null) {
                    new Thread(() -> {
                        synchronized (clip) {
                            clip.stop();
                            clip.setFramePosition(0);
                            clip.start();
                        }
                    }).start();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void stop() {
        if (clip == null) return;
        clip.stop();
    }

    public void loop() {
        if(Sound_off == 0) { 
            try {
                if (clip != null) {
                    new Thread(() -> {
                        synchronized (clip) {
                            clip.stop();
                            clip.setFramePosition(0);
                            clip.loop(Clip.LOOP_CONTINUOUSLY);
                        }
                    }).start();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isActive() {
        return clip.isActive();
    }


    public void setSoundOff(int sound_off) {
        Sound_off = sound_off;
    }

    public static Sound getBeginningSound() {
        return sound1;
    }

    public static Sound getChompSound() {
        return sound2;
    }

    public static Sound getDeathSound() {
        return sound3;
    }
}