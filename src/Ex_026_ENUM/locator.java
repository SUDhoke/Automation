package Ex_026_ENUM;

public enum locator
{
    page_log_in("login"),
    page_log_out("log out");

    private String locator;

    //constructor
    locator(String locator)
    {
        this.locator = locator;
    }

    public String getLocator() {
        return locator;
    }
}

class check
{
    public static void main(String[] args) {

        locator lc = locator.page_log_in;
        System.out.println(lc.getLocator());

//        System.out.println(locator.page_log_in);
//        System.out.println(locator.page_log_in);

    }
}
