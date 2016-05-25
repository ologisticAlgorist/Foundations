package riddlermn;

import java.util.Scanner;

public class RiddlerMN {
	private static int n;
	private static Scanner scanner;
	private static int lower;
	private static int upper;
	private static int sum;
	
	public static void main(String[] args){
		scanner = new Scanner(System.in);
		int count;

		while(true){
			System.out.println("Enter N:");
			n = scanner.nextInt();
			if(n==0)
				break;
			lower=(n+((2*n)%3))/3;
			upper=(n+((1*n)%2))/2;
			sum=0;
//			System.out.println(upper+"   "+lower+"\n\n");
			count=0;
			for(int k = lower;k<=upper;k++){
				count++;
				//System.out.println("Iteration:" + count);
				
				sum += factorial(k)*choose(k+1,n-2*k+1);
				
			}
			
			System.out.println(sum);
		}
		scanner.close();
		System.out.println("Done.");
	}
	
	private static int factorial(int x){
		int fact=1;
		if(x!=0){
			x-=1;
			fact=(x+1)*factorial(x);
		}
		return fact;
	}
	
	private static int choose(int n, int k){
		if(0<=k && k<=n){
			return factorial(n)/(factorial(k)*factorial(n-k));
		} else{
			return 0;
		}
	}
	
	private static int max(int x,int y){
		if(x>y){
			return x;
		} else{
			return y;
		}
	}
}