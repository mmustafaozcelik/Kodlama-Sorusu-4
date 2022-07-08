package com.mmustafa.cevap;

import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) {
		/**************** Test ********************/
		// int[] sayilar = { 1, 5, 6, 7, -8, 3, 2, 34, 6 };
		// int ulasilacakToplam =10 //true
		/**************/
		// int[] sayilar = { 1, 5, 6, -7, 8, 123, 2, 34, 46 };
		// int ulasilacakToplam =36; //true
		/**************/
		// int[] sayilar = { 1, 53, 62, 75, -8, 3, 21, 34, 6 };
		// int ulasilacakToplam =5 //true
		/**************/
		// int[] sayilar = { 1, 5, 6, 7, -8, 3, 2, 34, 6 };
		// int ulasilacakToplam =40 //true
		/**************/
		// int[] sayilar = { 18, 54, 9, 66, 74, -84, 34, 52, 343, 6 };
		// int ulasilacakToplam = 40; //false
		/**************/
		// int[] sayilar = { 132423, 5534645, 6, 65756, 7, 328, 3534, 2, 348, 6 };
		// int ulasilacakToplam = 4523123; // false
		/**************/
		// int[] sayilar = { 1234, 52342, 6909, 1237, -8896, 3, 234, 3242, 23423 };
		// int ulasilacakToplam = 89732; // false
		/**************/
		// int[] sayilar = { 1, -5, 23423, 34534, -253345, 3234, 67756, 324, 23423 };
		// int ulasilacakToplam = 45243; //false
		/**************/
		int[] sayilar = { 1, 5, 6, 7, -8, 3, 2, 34, 6 };
		int ulasilacakToplam = 40; // true
		System.out.println(siraliAltKumeVarMi(sayilar, ulasilacakToplam));
		
	}
	
	static boolean siraliAltKumeVarMi(int[] sayilar, int ulasilacakToplam) {
		BigInteger maxSum = BigInteger.valueOf(ulasilacakToplam);
		for (int i = 0; i < sayilar.length; i++) {
			BigInteger sum = BigInteger.valueOf(0);
			for (int j = i; j < sayilar.length; j++) {
				sum = sum.add(BigInteger.valueOf(sayilar[j]));
				if (sum.equals(maxSum)) {
					return true;
				}
			}
		}
		return false;
	}
}
