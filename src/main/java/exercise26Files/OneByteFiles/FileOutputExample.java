package exercise26Files.OneByteFiles;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample {
    public static void main(String[] args) throws IOException {

        FileOutputStream foe = null;
        char[] chars = {'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'};

        try{
            foe = new FileOutputStream("test.txt");
            for(char c : chars){
                foe.write(c);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            if(foe != null) {
                foe.close();
            }
        }
    }
}
