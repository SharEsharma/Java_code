package Homework2;

public class CapitalWorld {
	public static void main(String[] args) {
		String s="AbcDeF";
		 String answer="";
		System.out.println(s);
		
		char [] ch=s.toCharArray();
		
		System.out.println(ch.length);
		
		for(int i=0;i<ch.length;i++){
			if(ch[i]>=65&&ch[i]<=91)
				 answer+=ch[i];
			
		}
		System.out.println(answer);
		
	}

}
