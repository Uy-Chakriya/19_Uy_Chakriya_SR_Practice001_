import java.util.Scanner;
public class Practice_Two_Array_2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] scores = new int[2][4];
        String[] students = {"Student A", "Student B"};
        String[] subjects = {"Web", "Java", "Korea", "Database"};

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Enter scores for " + students[i]);
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(subjects[j] + ": ");
                scores[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }
            double average = total / (double) scores[i].length;
            System.out.println(students[i]);
            System.out.println("Total = " + total);
            System.out.println("Average = " + average);
            System.out.println();
        }
        sc.close();
    }
}
