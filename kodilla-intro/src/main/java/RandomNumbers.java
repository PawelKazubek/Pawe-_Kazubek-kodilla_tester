import java.util.Random;

public class RandomNumbers {
    int minNumber = 29;
    int maxNumber = 0;

    public int getRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(30);
            sum = sum + temp;
            result++;
            if (temp > maxNumber) {
                maxNumber = temp;
            }
            if (temp < minNumber) {
                minNumber = temp;
            }
        }
        return result;
    }

    public int getMaxRandomNumber() {
        return maxNumber;
    }

    public int getMinRandomNumber() {
        return minNumber;
    }
}


