package exercise17Singleton;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {


        DBConnection connection1 = DBConnection.getInstance();
        DBConnection connection2 = DBConnection.getInstance();

        System.out.println(connection1 == connection2);
    }
}
