package Ex_026_ENUM;

public enum Season
{
    winter("cold"),
    Spring("snowy"),
    summer("Hot");

    private String sea;

    Season(String sea)
    {
        this.sea = sea;
    }

    public String getSea() {
        return sea;
    }
}
class Season_main{
    public static void main(String[] args) {
        Season s =Season.Spring;
        System.out.println("Season :"+s.getSea());
    }
}