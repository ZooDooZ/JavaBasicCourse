package exercise26Files.SerializableObject;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Student student1 = new Student("John", "Rambo",5,"Philosophy");

//        ObjectOutputStream oos = null;
//
//        try{
//            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("files\\student1.dat")));
//            oos.writeObject(student1);
//
//        } catch (IOException e){
//            System.out.println(e.getMessage());
//        } finally {
//            if(oos != null) {
//                oos.close();
//            }
//        }

        ObjectInputStream ois = null;

        ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("files\\student1.dat")));

        try{
            while(true){
               Student studentOne = (Student) ois.readObject();
                System.out.println(studentOne);
            }
        } catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        } catch(EOFException e) {

        } finally {
            if(ois != null){
                ois.close();
            }
        }


    }
}
