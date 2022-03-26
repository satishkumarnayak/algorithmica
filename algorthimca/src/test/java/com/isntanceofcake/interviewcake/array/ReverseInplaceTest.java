package com.isntanceofcake.interviewcake.array;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.instanceofcake.interviewcake.array.ReverseInplace;

public class ReverseInplaceTest {

	ReverseInplace app;

	@Before
	public void setup() {
		app = new ReverseInplace();
	}

	@Test
	public void testReverseInplace() {
		char[] ip = { 'f', 'e', 'd', 'c', 'b', 'a' };
		System.out.println(Arrays.toString(ip));
		app.solution(ip);
		System.out.println(Arrays.toString(ip));
		
	}

}
