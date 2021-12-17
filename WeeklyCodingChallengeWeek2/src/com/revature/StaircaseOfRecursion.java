package com.revature;

public class StaircaseOfRecursion {

	public static void main(String[] args) {
		
		int n = 4;
        System.out.println(climbStairs(n));
	}
	
	public static int climbStairs(int n){
		if (n<=1) return 1;
	    return climbStairs(n - 1) + climbStairs(n - 2);
    }

}
