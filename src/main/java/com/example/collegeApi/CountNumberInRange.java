package com.example.collegeApi;

public class CountNumberInRange {
	public static void main(String[] args) {
		int n=81;
		int c=0;
		for(int i=n;i<=1000;i++) {
			int a=i;
			while(a>0) {
				int r=a%10;
				if(r==n) {
					c++;
				}
				a=a/10;
			}
		}
		System.out.println(c);
	}
}
