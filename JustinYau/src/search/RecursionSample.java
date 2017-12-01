package search;

import java.util.Arrays;

public class RecursionSample {

	 /*
	 public static void main(String[] args) {
		 
		 String[] list = new String[100];
		 repeat(list.length, new Action() {
		 
			 int index = 0;
			 
			 @Override
			 public void act() {
				 list[index] = "Trial";
				 index++;
			 }
			 
		 });
		 
			 System.out.println(Arrays.toString(list));
	 }

	 
	 public static void repeat(int times, Action a){
		 if (times >0){
		 a.act();
		 repeat(times - 1,a);
		 }
	 }
	 */

	 public static void main(String[] args){	 
		 int value = 12;
		 System.out.println(value+"! is equal to "+factorial(value));
		 System.out.println(value+ " has "+countPrimeFactors(value, 2)+" prime factors.");
	 }

	 public static int countPrimeFactors(int value, int testPrime) {
		 if(value == 1) {
			 return 0;
		 }
		 else {
			 if(value%testPrime == 0) {
				 return 1 + countPrimeFactors(value/testPrime, testPrime);
			 }
			 else {
				 return countPrimeFactors(value, testPrime + 1);
			 }
		 }
	 }

	 public static int factorial(int value) {
		 if(value <= 1) {
			 return 1;
		 }
		 else {
			 return value * factorial(value - 1);
		 }
	 }
		 
}
