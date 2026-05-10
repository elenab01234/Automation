package tema07;

//    5. Creează clasa ShoppingCart:
public class ShoppingCart {

    //    Atribute: totalPrice
    double totalPrice;

    //    Metode:   addProduct(double price)
    void addProduct(double price){
        totalPrice += price;
        System.out.println("Produs adaugat");
    }

    //    Metode:  removeProduct(double price)
    //    totalPrice nu poate deveni negativ
    void removeProduct(double price){
        if (totalPrice>= price) {
            totalPrice -= price;
            System.out.println("Produs eliminat");
        }
        else {System.out.println("Total insuficient");}
    }

    //    Metode:  getTotal()
    void getTotal() {
        System.out.println("Totalul este " + totalPrice);
    }


    public static void main(String[] args) {
        //    adaugă 3 produse
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(120);
        cart.addProduct(80);
        cart.addProduct(50);
        //    șterge unul
        cart.removeProduct(5);

        //    afișează totalul
        cart.getTotal();
    }

}