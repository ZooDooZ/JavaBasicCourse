package exercise26Files.TwoByteFiles;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException{


        FileReader fr = null;


        try {
            fr = new FileReader("files\\newFile.txt");
            int num;
            while((num = fr.read()) != -1){
                System.out.print((char)num);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if(fr != null){
                fr.close();
            }
        }
    }
}
