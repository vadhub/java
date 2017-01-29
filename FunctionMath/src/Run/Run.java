package Run;

import java.util.Scanner;

import Test.Sin;
import numbrsFunction.Numbrs;

public class Run {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
//		 Numbrs n1 = new Numbrs();		
//		 n1.arr();
		 
		 Sin s = new Sin();
		 s.consider(scn.nextInt());
	}

}
