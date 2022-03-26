package com.instanceofcake.analysis;

public class LogarithimicProcess {

	public static void main(String args[]) {

		// repeated doubling
		int n = Integer.parseInt(args[0]);
		int ndays = 0;
		for (int nrabbits = 1; nrabbits < n; nrabbits *= 2)
			++ndays;
		System.out.println(ndays);
 
		// repeated halving
		ndays = 0;
		for (int ncovid = n; ncovid >= 1; ncovid /= 2)
			++ndays;
		System.out.println(ndays);

		// total spread
		ndays = 0;
		int total = 0;
		for (int ncovid = 1; total <= n; ncovid *= 2) {
			total += ncovid;
			++ndays;
		}
		System.out.println(ndays);
	}
}
