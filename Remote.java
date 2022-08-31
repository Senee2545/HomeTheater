package FacadePattern;

public class Remote {
    String wordshow;
    String movie;

    public Remote(String wordshow){
        this.wordshow = wordshow;
    }

    public void DvdMode(){
        System.out.println(wordshow + " change to DvdMode ");
    }

    public void TVMode(){
        System.out.println(wordshow + " change to TVMode ");
    }

    public void pause(String movie){
        this.movie = movie;
        System.out.println(wordshow + " pause " + movie);
    }

    public void play(String movie){
        this.movie = movie;
        System.out.println(wordshow + " play " + movie);
    }

    public void increaseVolume(int volume){
        System.out.println(wordshow + " increase the volume to " + volume);
    }

    public void decreaseVolume(int volume){
        System.out.println(wordshow + " decrease the volume to " + volume);
    }

    public String toString(){
        return wordshow;
    }
}

