import java.util.Scanner;
public class Practice_One_Array_1D {
    public static void main(String[] args) {
        System.out.print("Please input 5 integers : ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = sc.nextInt();
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum value is: " + max);
        System.out.println("Minimum value is: " + min);
        sc.close();
    }
}

