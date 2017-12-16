package practice;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int gcdB(int a,int b){
        if(a==0){
            return b;
        }
        return gcdB(b%a,a);
    }
    static int cgcdB(int a[]){
        int res=a[0];
        for(int i=0;i<a.length;i++){
            res=gcdB(a[i],res);
        }
        return res;
    }
  static int lcm(int a , int b){
		int res=(a>b)?a:b;
		while(true){
			if(res%a==0 && res%b==0){
				break;
			}
			res++;
		}
		//System.out.println("the lcm is "+res);
		return res;

	}
	
	static int findAllLCM( int a[]){
		int lc=1;
		
		for (int i = 0; i < a.length; i++) {
			lc=lcm(lc,a[i]);
		}
		//System.out.println(lc);
		return lc;
	}
static int getTotalX(int a[],int b[]){
    int lcm= findAllLCM(a);
    int gcd=cgcdB(b);
    System.out.println("the lcm is "+lcm);
    System.out.println("the gcd is "+gcd);
    int count=0;
    for(int i=gcd;i<=lcm;i++){
        if(lcm%i==0){
            count++;
        }
        
    }
     System.out.println("the count is "+count);
    return count;
    
}
    public static void main(String[] args) {
    	
    	
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
