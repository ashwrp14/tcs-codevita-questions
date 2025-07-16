import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int col=sc.nextInt();
	sc.nextLine();
	String str[]=new String[3];
	
	for(int row=0;row<3;row++){
	    str[row]=sc.nextLine();
	}
	
	for(int i=0;i<col+col;i+=6){
	    if(str[0].charAt(i)=='#'){
	        System.out.print("#");
	        i=i-4;
	    }
	    else if(str[0].charAt(i)=='.'&&str[1].charAt(i)=='.'&&str[2].charAt(i)=='.'){
	         i=i-4;
	    }
	    
	   
	    else if(str[1].charAt(i+2)=='.'){
	        if(str[0].charAt(i+2)=='.'){
	            System.out.print("U");
	        }
	        else {
	            System.out.print("O");
	        }
	    }
	    else{
	        if(str[1].charAt(i)=='.'){
	            System.out.print("I");
	        }
	        else if(str[0].charAt(i)=='.'){
	            System.out.print("A");
	        }
	        else{
	            System.out.print("E");
	        }
	    }
	}

	}
}
