public class tema01 {
    public static void afisareInvatJava(){
        System.out.println("Invat Java!");
    }

    public static int produs2Numere(int a, int b) {
        return a*b;
    }
    public static int sumaNrPare1la50(){
        int s = 0;
        for (int i=1; i<=50;i++)
            if (i%2==0){s+=i;}
        return s;
    }

    public static double medie3param(double a, double b, double c){
        return (a+b+c)/3;
    }
    public static void afiseazaInterval(int start, int end){
        for(int i=start; i<=end;i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String []args) {
        System.out.println("1 ----------------------------------------");
        // 1.	Creează variabile pentru: varsta unui student, inaltimea acestuia,
        // daca este prezent la curs. Afiseaza datele prin mesaje/propozitii.
        int varsta = 20;
        double inaltime = 1.8;
        boolean prezenta = true;
        System.out.println("Informatiile despre student sunt: varsta = " + varsta + ", inaltime = " + inaltime + ", prezenta = " + prezenta);
        System.out.println("2 ----------------------------------------");
        //  2.	Crează doua variabile int si una double. Calculeaza suma celor doua valori int.
        //  Calculeaza media dintre toate 3.
        int a = 2;
        double b = 4.7;
        int b_intreg = 5;
        int suma = a + b_intreg;
        double medie = (a + b + suma)/3;

        System.out.println("Suma este: " + suma);
        System.out.println("Media este: " + medie);

        System.out.println("3 ----------------------------------------");
        // 3.	Creaza o variabila pentru varsta. Dacă persoana are 18 sau
        // mai mult, afișează: “Acces permis”, altfel “Acces interzis”.
        int varsta2 = 19;
        if (varsta >= 18){
            System.out.println("Acces permis");
        }
        else {
            System.out.println("Acces interzis");
        }
        System.out.println("4 ----------------------------------------");
        // 4.	Calculeaza suma numerelor de la 20 la 50.
        int x = 20, s = 0;
        while (x<=50){
            s += x;
            x += 1;
        }
        System.out.println("Suma este " + s);
        System.out.println("5 ----------------------------------------");
        // 5.	Afișează numerele de la 10 la 1 folosind while.
        x = 10;
        while (x>=1){
            System.out.println(x);
            x -= 1;
        }
        System.out.println("6 ----------------------------------------");
        // 6.	Creează o metodă care afișează: “Invat Java!”
        afisareInvatJava();
        System.out.println("7 ----------------------------------------");
        // 7.	Creaza o metoda cu 2 parametrii int,
        // care returneaza produsul celor doi parametrii.
        System.out.println(produs2Numere(2,3));
        System.out.println("8 ----------------------------------------");
        // 8.	Calculează suma numerelor pare de la 1 la 50.
        // Crează o metoda care returneaza rezultatul.
        System.out.println(sumaNrPare1la50());
        System.out.println("9 ----------------------------------------");
        // 9.	Creaza o metoda cu 3 parametrii. Returneaza media celor trei parametrii.
        System.out.println(medie3param(1,2,3));
        System.out.println("10 ----------------------------------------");
        // 10.	Creeaza o metoda care primeste 2 parametrii: start si end.
        // Afiseaza toate numerele cuprinse intre aceste doua numere
        afiseazaInterval(3,7);
    }
}
