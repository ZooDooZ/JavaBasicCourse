package exercise17Singleton;

public class DBConnection {

    private static DBConnection instance;

    private DBConnection(){

    }

    public static DBConnection getInstance(){
        if(instance == null){
            instance = new DBConnection();
        }
        return instance;
    }
}
