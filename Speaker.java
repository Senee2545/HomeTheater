package FacadePattern;

public class Speaker {
    String wordshow;
    Remote remote;

    public Speaker(String wordshow, Remote remote){
        this.wordshow = wordshow;
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
