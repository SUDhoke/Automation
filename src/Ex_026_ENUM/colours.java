package Ex_026_ENUM;

enum colours
{
    RED("#FF0000"),
    GREEN("#55555"),
    BLUE("#333777");

   //this is the rpivate string type variable using encapsulation
    private String hexcode;

    //constructor
    colours(String hexcode)
    {
        this.hexcode = hexcode;
    }

    public String getHexcode() {
        return hexcode;
    }

}

class main
{
    public static void main(String[] args) {

        System.out.println(colours.RED);

    }
}
