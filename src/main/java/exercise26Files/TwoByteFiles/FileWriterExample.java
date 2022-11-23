package exercise26Files.TwoByteFiles;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {

        String str = "Bezpłatna usługa Google";
        FileWriter fw = null;
        char[] chars = str.toCharArray();

        try{
            fw = new FileWriter("files\\newFile.txt");
            for(char c : chars){
                fw.write(c);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            if(fw != null){
                fw.close();
            }
        }
    }
}
