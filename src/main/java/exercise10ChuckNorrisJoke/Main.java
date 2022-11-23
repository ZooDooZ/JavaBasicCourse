package exercise10ChuckNorrisJoke;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {
    public static void main(String[] args) {

        try{
            URL url = new URL("https://api.chucknorris.io/jokes/random");
            InputStream is = url.openStream();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(is)
            );

            String line = null;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
