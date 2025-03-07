package Ex_026_ENUM;

public enum Traffic_Light
{
    RED(60),YELLOW(5),GREEN(30);

    int Duration;
    Traffic_Light(int duration)
    {
        this.Duration = duration;
    }
    //method


    public int getDuration() {
        return Duration;
    }
}
class traffic_main
{
    public static void main(String[] args) {

        Traffic_Light TL = Traffic_Light.YELLOW;

        System.out.println("Duration of light :"+TL.getDuration());
    }
}
