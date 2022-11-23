package exercise23InterfaceChallenge;

public interface Browser {

    String ENGINE = "WebKit";

    default String getEngine(){
        return ENGINE;
    }

    void goToPage(String url);
    void refreshPage();
    void bookmarkPage();
}
