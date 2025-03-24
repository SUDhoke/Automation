package Ex_026_ENUM;

public enum planetory_Data
{
    mercury("Swift"),
    Venus("Fiercy"),
    Earth("Life"),
    Mars("Red"),
    jupiter("Giant"),
    saturn("Ringed"),
    Uranus("icy"),
    Neptune("Windy");



    private  String solar;
    planetory_Data(String solar)
    {
        this.solar = solar;
    }
    public String getSolar() {
        return solar;
    }

}
class planet_main
{
    public static void main(String[] args) {
//        planetory_Data pd = planetory_Data.Venus;
        System.out.println(planetory_Data.Earth);
        //System.out.println(pd.getSolar()); //description
    }
}