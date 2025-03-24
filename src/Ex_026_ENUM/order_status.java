package Ex_026_ENUM;

import static Ex_026_ENUM.order_status.placed;

public enum order_status
{
    placed("order_placed"),
    shipped("order_shipped"),
    delivered("order_delivered"),
    cancelled("order_cancelled");

    private String show_order_status;
    //constructor
    order_status(String order)
    {
        this.show_order_status = order;
    }

}
class show_order_status_main
{
    public static void main(String[] args) {

      order_status status = order_status.delivered;

      switch(status)
      {
          case placed:
              System.out.println("Order is placed");
              break;
          case shipped:
              System.out.println("order is shipped");
              break;
          case delivered:
              System.out.println("order is delivered successfully");
              break;
          case cancelled:
              System.out.println("Order is cancelled");
              break;
          default:
              System.out.println("Invalid order status");
      }
    }
}
