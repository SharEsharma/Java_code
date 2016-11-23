package Homework2;

public class FindConsented {
public static void main(String[] args) {
	String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	 String answer="";
	System.out.println(s);
	
	char [] ch=s.toCharArray();
	
	System.out.println(ch.length);
	
	for(int i=0;i<ch.length;i++){
		if(ch[i]==65&&ch[i]==69&&ch[i]==73&&ch[i]==79&&ch[i]==69&&ch[i]==85)
			 answer+=ch[i];
		
	}
	System.out.println(answer);
}
}
