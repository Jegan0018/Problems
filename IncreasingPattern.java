package zohobooks;

import java.util.Arrays;
import java.util.Scanner;

public class IncreasingPattern {

	public static void main(String[] args) {
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
