package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {
	
	private int sentinelVal = 10000;
	private int fib1 = 0;
	private int fib2 = 1;
	private int fib3 = 0;
	
	public void run() {
		println("This program lists the Fibonacci sequence.\n" + fib1 + "\n" + fib2);
		while (true) {
			fib3 = fib1 + fib2;
			if(fib3 < sentinelVal) {
				println(fib3);
				fib1 = fib2;
				fib2 = fib3;
			} else {
				break;
			}
		}
	}
}

