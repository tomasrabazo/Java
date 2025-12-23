package javaloopsII;

import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int q = in.nextInt();
        for (int t = 0; t < q; t++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int term = a;
            int pow = 1; // 2^0

            for (int i = 0; i < n; i++) {
                term += pow * b;
                System.out.print(term);

                if (i < n - 1) System.out.print(" ");
                pow *= 2;
            }
            System.out.println();
        }

        in.close();
    }
}