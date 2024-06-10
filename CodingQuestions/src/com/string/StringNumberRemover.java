package com.string;

public class StringNumberRemover {
public static void main(String[] args) {
	String str="A8b6h7i9s5h2e1k";
	String num="";
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch=='0'||ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9') {
			num=num+ch;
		}
	}
	System.out.println(num);
}
}
