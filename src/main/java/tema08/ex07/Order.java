package tema08.ex07;

//Exercițiul 7 – protected vs private
//Creează:
//- Order → protected orderId + metodă printOrder()
//- OnlineOrder extinde Order → metodă trackOrder()
//- testează accesul la orderId

public class Order {
    protected int orderId;

    public Order(int orderId){
        this.orderId=orderId;
    }

    public void printOrder(){
        System.out.println("Printing order "+orderId);
    }
}
