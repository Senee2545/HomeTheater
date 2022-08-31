package FacadePattern;

public class DvdPlayer {
    String wordshow;
    String movie;
    Remote remote;

    public DvdPlayer(String wordshow, Remote remote){
        this.wordshow = wordshow;
        this.remote = remote;
    }

    public void on(){
        System.out.println(this.wordshow + " on");
    }

    public void off(){
        System.out.println(this.wordshow + " off");
    }

    public void play(String movie){
        this.movie = movie;
        System.out.println(wordshow + " playing " + movie);
    }

    public String toString(){
        return wordshow;
    }
}
