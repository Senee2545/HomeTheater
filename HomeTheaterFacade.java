package FacadePattern;

public class HomeTheaterFacade {
    Remote remote;
    TVScreen tv;
    Speaker speaker;
    DvdPlayer dvd;

    public HomeTheaterFacade(Remote remote, TVScreen tv, Speaker speaker, DvdPlayer dvd) {

        this.remote = remote;
        this.tv = tv;
        this.speaker = speaker;
        this.dvd = dvd;

    }

    public void startmovie(String movie) {
        System.out.println("Movie time");
        tv.on();
        remote.DvdMode();
        dvd.on();
        speaker.on();
        remote.increaseVolume(50);
        dvd.play(movie);
        remote.pause(movie);
        remote.play(movie);
        System.out.println("\n");
    }

    public void endmoive(){
        System.out.println("Movie is end");
        dvd.off();
        remote.TVMode();
        remote.decreaseVolume(0);
        speaker.off();
        tv.off();
    }
}

