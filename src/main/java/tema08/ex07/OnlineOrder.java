package tema08.ex07;

public class OnlineOrder extends Order{
    public OnlineOrder(int orderId){
        super(orderId);
    }
    public void trackOrder(){
        System.out.println("The order ID is "+ orderId);
    }
}
