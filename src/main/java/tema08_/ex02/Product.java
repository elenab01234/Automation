package tema08_.ex02;

//Exercițiul 2 – Encapsulare cu validare
//Creează clasa Product:
//- private name, price
//- în setter pentru price: nu permite valori <= 0
//- testează valori valide și invalide

public class Product {
    private String name;
    private int price;

    public void setName(String name){
        this.name=name;
    }

    public void setPrice(int price){
        if (price<=0) {
            this.price = price;
        }
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
