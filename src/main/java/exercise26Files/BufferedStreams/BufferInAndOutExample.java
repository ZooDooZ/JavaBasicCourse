package exercise26Files.BufferedStreams;

import java.io.*;

public class BufferInAndOutExample {
    public static void main(String[] args) throws IOException {


        BufferedInputStream bis = null;

        try{
            bis = new BufferedInputStream(new FileInputStream("files\\newFile.txt"));
            int num;
            while((num = bis.read()) != -1 ){
                System.out.println((char)num);
            }
        } catch(IOException e){
            System.out.println(e.getMessage());
        } finally {
            if(bis != null){
                bis.close();
            }
        }


        BufferedOutputStream bos = null;

        try{
            bos = new BufferedOutputStream(new FileOutputStream("files\\newFile.txt"));
            String str = "Siemanko!";
            char[] chars = str.toCharArray();
            for(char c : chars){
                bos.write(c);
            }
        } catch(IOException e){
            System.out.println(e.getMessage());
        } finally {
            if(bos != null){
                bos.close();
            }
        }
    }
}
