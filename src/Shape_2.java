public class Shape_2 {
    static void main() {
        int r, c, numOfC= 10;
        for (r = 0; r < numOfC ; r++) {
            //==>> space
            for (c = 0 ; c < r ; c++) {
                System.out.print(" ");
            }
            for (c = 0; c < 2 * (numOfC - r) - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
