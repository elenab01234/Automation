public class ExercitiiString{
    public static void main(String []args){
        String text = "Ana are 7 mere";
        System.out.println("Lungimea este " + text.length());

        String cuvant = "catel";
        System.out.println("Prima litera este "+ cuvant.charAt(0));
        System.out.println("Ultima litera este "+ cuvant.charAt(cuvant.length()-1));

        String text1 = "Java";
        String text2 = "Python";
        boolean eq = text2.equals(text1);
        System.out.println("Testele sunt egale " + eq);

        System.out.println("Contine cuvant " + text1.contains(cuvant));

        String newText = text.replace(" ", "");
        System.out.println(newText);

        String caise = text.replace("mere", "caise");
        System.out.println(caise);
    }
}