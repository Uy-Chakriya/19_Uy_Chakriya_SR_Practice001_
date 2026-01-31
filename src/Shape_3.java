public class Shape_3 {
    static void main() {
        int r, c, numOfC= 10;

        //==============>> Shape 1
        for (r = 0; r < numOfC -1 ; r++) {
            //==>> space
            for (c = numOfC - r; c > 1; c--) {
                System.out.print(" ");
            }
            for (c = 0; c < (2 * r + 1); c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //==============>> Shape 2
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

