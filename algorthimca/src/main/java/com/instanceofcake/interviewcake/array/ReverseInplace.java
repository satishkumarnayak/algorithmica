package com.instanceofcake.interviewcake.array;

/*
 * Write a method that takes an array of characters and reverses the letters in place. ↴
 * Time - O(1) , Space - O(1)
 */
public class ReverseInplace {

	public void solution(char[] ip) {

		if (ip == null || ip.length < 1) {
			return;
		}

		for (int i = 0, j = ip.length - 1; i < j; i++, j--) {
			char tmp = ip[i];
			ip[i] = ip[j];
			ip[j] = tmp;
		}

	}
}
