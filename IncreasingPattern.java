package zohobooks;

import java.util.Arrays;
import java.util.Scanner;

public class IncreasingPattern {

	public static void main(String[] args) {

//		Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter Number");
//        int n=scanner.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=i;j<n;j++) {
//				System.out.print("  ");
//			}
//			for(int j=1;j<=i;j++) {
//				if(i>9) {
//					System.out.print(p--+" ");
//				} else {
//					System.out.print(" "+p--);
//				}
//				
//			}
//		p=i+1;
//		System.out.println();
//        }
        //int n=5;
//        for(int i=1;i<=n;i++) {
//        	for(int j=n+i;j>i;j--) {
//        		if(j<=i+i) {
//        			System.out.print((j-i)+"\t");
//        		} else {
//        			System.out.print("\t");
//        		}
//        	}
//        	System.out.println();
//        }
		
	int n=6;
        
        char a[][]=new char[n][n];
        for(int i=1;i<=n;i++) {
        	for(int j=n-1;j>=0;j--) {
        		if(n-i<=j) {
        			a[i-1][j]=(char)(n-j+48);
        		} else {
        			a[i-1][j]=(char)32;
        		}
        	}
        }
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		System.out.print(a[i][j]);
        	}
        	System.out.println();
        }
	}
}
