package exercise23InterfaceChallenge;

public class Main {
    public static void main(String[] args) {

        Browser chrome = new Chrome();
        Browser firefox = new Firefox();

        chrome.goToPage("https://github.com/");
        firefox.goToPage("https://github.com/");



    }
}
