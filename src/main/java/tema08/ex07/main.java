package tema08.ex07;

public class main {
    public static void main(String[] args){
        Order order=new Order(10);
        OnlineOrder onlineOrder=new OnlineOrder(15);

        order.printOrder();
        onlineOrder.trackOrder();
    }
}
