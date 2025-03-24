package Ex_024_Abstraction_Interface;

//abstraction means - hiding the complex implementation and showing only essential fetures
public class Media_player_abstraction
{
    public static void main(String[] args) {
        Media_player mp = new AudiePlayer();
        mp.play();mp.pause();mp.stop();
    }
}
//abstract class
abstract class Media_player
{
    abstract void play();
    abstract void pause();
    abstract void stop();
}

//abstract class must have sub class for implementation inheritance is must
//child class
class AudiePlayer extends Media_player
{
    @Override
    void play() {
        System.out.println("click play button to play music");
    }

    @Override
    void pause() {
        System.out.println("click on pause button to stop music");
    }

    @Override
    void stop() {
        System.out.println("click on stop button to stop the music");
    }
}