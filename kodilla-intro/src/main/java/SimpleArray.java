public class SimpleArray {
    public static void main(String[] args) {
        String[] books = new String[5];
        books[0] = "Quo vadis";
        books[1] = "Ogniem i mieczem";
        books[2] = "Krzyżacy";
        books[3] = "Wojna polsko-ruska";
        books[4] = "Wołyń 43";

        String book = books[2];
        System.out.println(book);

        int numberOfElements = books.length;
        System.out.println("Moja tablica zawiera 5 elementów");
    }
}
