package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	static int smallestNum = 50;
	static int biggestNum = 0;
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] fruits = new String[5];
		//2. print the third element in the array
		System.out.println(fruits[3]);
		//3. set the third element to a different value
		fruits[3] = "apple";
		//4. print the third element again
		System.out.println(fruits[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
			
			}	
		
		
		//6. make an array of 50 integers
		int[] cats = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for(int b = 0; b < cats.length; b++) {
			Random ran = new Random();
			cats[b] = ran.nextInt(50);
		
			if(cats[b]<smallestNum) {
				smallestNum=cats[b];
				
				
			}
			if(cats[b]>biggestNum) {
				biggestNum=cats[b];
				
				
			}
			
		}
		System.out.println(smallestNum);
		System.out.println(biggestNum);
		}
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}

