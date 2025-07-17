import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    sc.nextLine();
	    for(int i=0;i<n;i++){
	        String s1=sc.nextLine();
	        String s2=sc.nextLine();
	        char[] ch1=s1.toCharArray();
	        char[] ch2=s2.toCharArray();
	        for(int j=0;j<ch1.length;j++){
	            for(int k=0;k<ch2.length;k++){
	                if(ch1[j]==ch2[k]){
	                    System.out.print(ch1[j]);
	                }
	            }
	        }
	        System.out.println();
	    }

	}
}
