package Class9PT2Hw;

import java.util.Scanner;

public class PrintingPyramidNumber {
    public static void main(String[] args) {
        int rows;
        Scanner s=new Scanner(System.in);
        System.out.println("please enter the number of rows");
        rows=s.nextInt();
        System.out.println("the number of rows are");

        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
