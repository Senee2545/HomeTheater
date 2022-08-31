package FacadePattern;

public class TVScreen {
    String wordshow;
    DvdPlayer dvd;

    public TVScreen(String wordshow, DvdPlayer dvd){
        this.wordshow = wordshow;
        this.dvd = dvd;
    }

    public void on(){
        System.out.println(this.wordshow + " on");
    }

    public void off(){
        System.out.println(this.wordshow + " off");
    }

    public String toString(){
        return wordshow;
    }
}
