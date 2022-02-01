import javax.print.attribute.Size2DSyntax;

public class GradesApp {
    public static void main(String[] args) {
        Grades grades = new Grades();
        System.out.println(grades);

        int last = grades.getLastAddedGrade();
        System.out.println(last);

        int average = grades.getAverage();
        System.out.println(average);

    }
}
