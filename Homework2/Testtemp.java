package Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

public class Testtemp {
public static void main(String[] args) throws IOException {
	/* int r,sum=0,temp;    
	  int n=454;
	  
	  temp=n;    
	  while(n>0){ 
	  r=n%10;  
	  System.out.println("r:="+r);
	  sum=(sum*10)+r; 
	  System.out.println("sum:="+sum);
	  n=n/10;  
	  System.out.println("n:="+n);
	  }
	  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");*/
	
	//Reverse mathod
	/*String s= new String("sir");
	int s1=s.length();
	System.out.println(s1);
	String len1 = "";
	for(int len=s1-1;len>=0;len--){
		len1=len1+s.charAt(len);
	}
	System.out.println(len1);
	System.out.println(s.equals(len1));*/
	
	//capital letter
	/* String data,answer="";
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter any String : ");
     data=br.readLine();
     char[] findupper=data.toCharArray();
     for(int i=0;i<findupper.length;i++)
     {
         if(findupper[i]>=65&&findupper[i]<=91) //ascii value in between 65 and 91 is A to Z
         {
             answer+=findupper[i]; //adding only uppercase
         }
     }
     System.out.println("Answer : "+answer);
	*/
	char c='U';
	int i=c;
	System.out.println(i);
	/*String s="SSSd";
	String s1=new String("SSSd");
	String s2="SSSd";
	String s3= new String("SSSd");
	System.out.println(s.hashCode());
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s3.hashCode());
	System.out.println(s==s1);//add
	System.out.println(s.equals(s1));//data(SSSd) 
	System.out.println(s==s2);//addd
	System.out.println(s.equals(s2));// */
	
	

	
	
	
	
	}  
}

