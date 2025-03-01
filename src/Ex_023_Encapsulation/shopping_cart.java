package Ex_023_Encapsulation;

public class shopping_cart
{
    public static void main(String[] args) {
        //passing value while creating object - due to constructor
        System.out.println("passing value first time");
        product prd = new product(1,"lipstick",200);
        prd.display();

        System.out.println("-------------------------");
        prd.getProductId();
        prd.getProduct_name();
        prd.getPrice();

        System.out.println("--------set price using set method--------");
        prd.setPrice(250,true);
        System.out.println("value after changed ");
        System.out.println(prd.getPrice());
    }

}
class product
{
    private int productId;
    private String product_name;
    private double price;

    //constructor
    product(int id,String name,double price)
    {
        this.productId = id;
        this.product_name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId,boolean isAdmin)
    {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price,boolean isowner)
    {
       if(isowner)
       {
           this.price = price;
       } else if (price < 0)
       {
           System.out.println("price can not be less than 0");
           this.price = 0;
       }else {
           System.out.println("ypu can noy change the price");
       }
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    void display()
    {
        System.out.println("product details : ");
        System.out.println("product Id : "+this.productId);
        System.out.println("product Name : "+this.product_name);
        System.out.println("price :"+this.price);
    }
}
