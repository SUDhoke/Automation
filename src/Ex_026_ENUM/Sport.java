package Ex_026_ENUM;

public enum Sport implements Game
{
    cricket{
        @Override
        public void play() {
            System.out.println("Cricket game :" + cricket);
        }
        },

    football {
        @Override
        public void play()
        {
            System.out.println("Football game :"+football);
    }
    };



}

interface Game
{
    //method
   public void play();
}
//main class
class Sport_main
{
    public static void main(String[] args) {
        Sport sp = Sport.cricket;

    }
}