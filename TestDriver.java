package FacadePattern;

public class TestDriver {
    public static void main(String[] args){
        Remote remote = new Remote("-Remote");
        Speaker speaker = new Speaker("-Speaker", remote);
        DvdPlayer dvd = new DvdPlayer("-Dvd Player", remote);
        TVScreen tv = new TVScreen("-Screen", dvd);

        HomeTheaterFacade hometheater= new HomeTheaterFacade(remote, tv, speaker, dvd);

        hometheater.startmovie("Star war");

        hometheater.endmoive();
    }
}
