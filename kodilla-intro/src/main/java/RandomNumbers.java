public class RandomNumbers {
    int maxNumber = 5000;
    int minNumber = 0;
    int randomNumber;

    public RandomNumbers(int maxNumber, int minNumber, int randomNumber) {
        this.maxNumber = maxNumber;
        this.minNumber = minNumber;
        this.randomNumber = randomNumber;
    }
        public int checkNumbers() {
            if (this.randomNumber <= this.maxNumber) {
                return maxNumber;

                if (this.randomNumber >= this.minNumber) {
                    return minNumber;
                }
            }
        }
}

