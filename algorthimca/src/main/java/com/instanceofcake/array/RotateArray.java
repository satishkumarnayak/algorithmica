package com.instanceofcake.array;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] ip = { 2, 5, 8, 4, 1, 3, 6 };
		System.out.println(Arrays.toString(ip));
		// int[] rotate = rotate(ip, 3);
//		System.out.println(Arrays.toString(rotate));
		// int[] rotateV2 = rotateV2(ip, 3);
		// System.out.println(Arrays.toString(rotateV2));
		int[] rotateV3 = rotateV3(ip, 3);
		System.out.println(Arrays.toString(rotateV3));
 
	}

	// Time - O(n)
	// Space- O(1)
	public static int[] rotateV3(int[] ip, int noOfPos) {

		reverse(ip, 0, ip.length - 1);

		reverse(ip, 0, noOfPos - 1);

		reverse(ip, noOfPos, ip.length - 1);

		return ip;

	}

	private static void reverse(int[] ip, int left, int right) {
		for (int i = left, j = right; i < j; i++, j--) {
			int tmp = ip[i];
			ip[i] = ip[j];
			ip[j] = tmp;

		}
	}

	// Time - O(n)
	// Space- O(n)
	public static int[] rotateV2(int[] ip, int noOfPos) {
		// int[] copyOf = Arrays.copyOf(ip, ip.length);
		int[] auxA = new int[ip.length];
		for (int i = 0; i <= ip.length - 1; i++) {
			int j = i + noOfPos;
			if (j < ip.length) {
				auxA[j] = ip[i];
			} else {
				int k = (i + noOfPos) % ip.length;
				auxA[k] = ip[i];
			}
		}
		return auxA;

	}

	// Time - O(n*n)
	// Space- O(n)
	public static int[] rotate(int[] ip, int noOfPos) {
		for (int i = 1; i <= noOfPos; i++) {
			int last = ip[ip.length - 1];
			for (int j = ip.length - 2; j >= 0; j--) {
				ip[j + 1] = ip[j];
			}
			ip[0] = last;

		}
		return ip;
	}

}
