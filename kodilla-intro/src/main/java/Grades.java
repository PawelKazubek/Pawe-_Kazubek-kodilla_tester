public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }
    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    public int getLastAddedGrade() {
        int lastAddedGrade = grades[size-1];
        return grades[size-1];

    }
    public int getAverage() {
        int quantity = this.size;
        int sum = 0;
        for (int i = 0; i < this.size; i++) {
            sum += grades[i];
        }
            int average = sum/this.size;
            return average;
        }

}
