package com.riya;

public class SumDigits {
	  public static int Sum(int n) {
		  int sum = 0;
		  while (n != 0) {
	           sum = sum + n % 10;
	           n = n / 10;
	       }
		  return sum;
	    }
	  public static void main (String[] args) {
		    int n = 3456789;
		    System.out.println(Sum(n));
		  }
		}
