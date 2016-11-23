package Homework2;

public class Testdemo {
	public static void main(String[] args) {
		String s1="AbcDef";
		System.out.println(s1);
		char [] ch=s1.toCharArray();
		
		String s2=s1.toLowerCase();
		System.out.println(s2);
		char [] ch1=s2.toCharArray();
		System.out.println(ch[1]==ch1[1]);
		System.out.println(ch[1]);
	}

}
