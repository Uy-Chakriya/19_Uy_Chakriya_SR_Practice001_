public class Shape_1 {
    public static void main(String args[]) {
        int r, c, numOfC= 10;
        for (r = 0; r < numOfC ; r++) {
             //==>> space
            for (c = numOfC - r; c > 1; c--) {
                System.out.print(" ");
            }
            for (c = 0; c < (2 * r + 1); c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


