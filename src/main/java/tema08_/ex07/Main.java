package tema08_.ex07;

public class Main {
    public static void main(String[] args){
        Order order=new Order(10);
        OnlineOrder onlineOrder=new OnlineOrder(15);

        order.printOrder();
        onlineOrder.trackOrder();
    }
}
