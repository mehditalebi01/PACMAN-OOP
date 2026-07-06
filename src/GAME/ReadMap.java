package GAME;

import java.io.BufferedReader;
import java.io.FileReader;

public final class ReadMap {

    public static String loadFile(String path) throws InvalidFileException { 
        StringBuilder builder = new StringBuilder(); 
        try {
            BufferedReader b = new BufferedReader(new FileReader(path));
            String line;
            while ((line = b.readLine()) != null) { 
                builder.append(line).append("\n");
            }
            b.close();

        } catch (Exception e) {
            throw new InvalidFileException("The file was not found!");
        }
        return builder.toString();
    }
    public static int ToInt(String number) { 
        try {
            return Integer.parseInt(number);
        } catch(NumberFormatException e)
        {
            e.printStackTrace();
            return 0;
        }
    }

}
