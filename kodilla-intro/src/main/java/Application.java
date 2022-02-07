public class Application {
    public static void main(String[] args) {

        Player player = new Player("Adam", 40.5, 178);

        if (player.verifyName()) {
            if (player.verifyAgeAndHeight()) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}
