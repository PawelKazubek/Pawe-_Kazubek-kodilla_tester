public class RandomNumbersApp {
    public static void main(String[] args) {
    RandomNumbers numbers = new RandomNumbers();
    int numberOfDraws = numbers.getRandomNumber(5000);
    System.out.println(numberOfDraws);

    int maxNumberOfDraws = numbers.getMaxRandomNumber();
    System.out.println(maxNumberOfDraws);

    int minNumberOfDraws = numbers.getMinRandomNumber();
    System.out.println(minNumberOfDraws);
    }
}
