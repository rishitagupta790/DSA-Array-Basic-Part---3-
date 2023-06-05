package com.in.P07;


public class Array_07 {
	public static int maxCount(int m, int n, int[][] ops) {
        int minA = m;
        int minB = n;

        for (int[] op : ops) {
            minA = Math.min(minA, op[0]);
            minB = Math.min(minB, op[1]);
        }

        return minA * minB;
    }
	public static void main(String[] args) {
		int m = 3;
        int n = 3;
        int[][] ops = {{2, 2}, {3, 3}};
        int result = maxCount(m, n, ops);
        System.out.println(result);
	}

}
