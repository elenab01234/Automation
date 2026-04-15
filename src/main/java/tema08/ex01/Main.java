package tema08.ex01;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();

        book.setTitle("Attached");
        book.setAuthor("Amir Levine, Rachel Heller");

        System.out.println("Titlu: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
    }
}
