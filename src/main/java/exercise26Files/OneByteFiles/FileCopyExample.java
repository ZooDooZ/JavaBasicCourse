package exercise26Files.OneByteFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyExample {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream("test.txt");
            out = new FileOutputStream("copyTest.txt");

            int num = 0;
            while((num = in.read()) != -1){
                out.write(num);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            if(out != null){
                in.close();
            }
            if(out != null){
                in.close();
            }
        }
    }
}
