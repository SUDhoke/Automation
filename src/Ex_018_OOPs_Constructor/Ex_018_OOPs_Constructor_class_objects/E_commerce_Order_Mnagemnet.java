package Ex_018_OOPs_Constructor.Ex_018_OOPs_Constructor_class_objects;

public class E_commerce_Order_Mnagemnet {
    public static void main(String[] args) {
        Order or = new Order(1, "Sonali", 562);
        or.print_order_order();

        System.out.println("...................");
        or.place_order();
        or.print_order_order();

        System.out.println("....................");
        or.cancel_order();
        or.print_order_order();

    }

    static class Order {
        //Attribute
        int Order_id;
        String Customer_name;
        float total_amount;
        String status;

        //Constructor
        Order(int o, String c, float amt) {
            this.Customer_name = c;
            this.Order_id = o;
            this.total_amount = amt;
            this.status = "pending";
        }

        void place_order() {
            if (!status.equals("pending")) {
                System.out.println("order can not get placed as of now");
            } else {
                status = "placed";
                System.out.println("Order is placed " + Order_id);
            }
        }

        void cancel_order() {
            if (status.equals("placed")) {
                status = "cancelled";
                System.out.println("order is canceled : " + Order_id);
            } else if (status.equals("pending")) {
                status = "Cancelled";
                System.out.println("Order was pending : now got cancelled : "+Order_id);

            } else {
                System.out.println("Order can not be cancelled at this moment: " + Order_id);
            }
        }

        void print_order_order() {
            System.out.println("Order details :");
            System.out.println("name : " + Customer_name);
            System.out.println("Order_id : " + Order_id);
            System.out.println("Total_amount : " + total_amount);
            System.out.println("Status : " + status);
        }
    }
}
