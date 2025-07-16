import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		int count=0,sum=2;
		for(int i=3;i<n;i++){
		    int f=0;
		    for(int j=2;j<i;j++){
		        if(i%j==0){
		            f=1;
		            break;
		        }
		    }
		    if(f==0){
		        sum=sum+i;
		        if(sum>n){
		            break;
		        }
		        for(int k=2;k<sum;k++){
		            if(sum%k==0){
		                f=1;
		                break;
		            }
		        }
		        if(f==0){
		            count++;
		        }
		    }
		    	
		}
	System.out.print(count);

	}
}
