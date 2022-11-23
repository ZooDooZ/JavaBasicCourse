package exercise26Files.OneByteFiles;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputExample {
    public static void main(String[] args) throws IOException {

        FileInputStream foe = null;

        try{
            foe = new FileInputStream("test.txt");
            int num = 0;
            while((num = foe.read()) != -1 ){
                System.out.print((char)num);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            if(foe != null){
                foe.close();
            }
        }
    }
}
