package com.example.collegeApi;

import java.util.Arrays;

class Try {
	public static void main(String[] args) {
		int[] a = { 50, 362, 1, 9,90,98 };
//		Arrays.sort(a);
		sort(a);
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}	
	}
	public static int getNum(int i) {
		int r = i;
		if (i > 9)
			while (i > 0) {
				r = i % 10;
				i = i / 10;
			}
		return r;
	}
	public static void sort(int a[]) {
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				int n1 = getNum(a[i]);
				int n2 = getNum(a[j]);
				if (n1 < n2) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
	}
}