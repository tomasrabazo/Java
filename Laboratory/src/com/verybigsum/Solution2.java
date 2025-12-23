package com.verybigsum;

import java.util.*;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
        long t;
        long sum = 0;
        //long a,b;
        t = in.nextInt();
        if ((1<=t)&&(t<=10))
        for (int i=0;i<t;i++) {
            sum += in.nextInt();
        }

        System.out.println(sum);
	}

}
