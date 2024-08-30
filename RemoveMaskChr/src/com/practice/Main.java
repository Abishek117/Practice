package com.practice;

public class Main {

	public static void main(String[] args) {
		String resu = "We belong to Russia";
		String s1 = resu; 
		StringBuilder sb = new StringBuilder(s1);
		String s2 = "Wbos";             ///abishek   glash
		String res = "";
		int k = s1.length();
		
			for(int i =0;i<s1.length();i++) {
				label:for(int j=0 ;j<s2.length();j++) {
					if(s1.charAt(i)!=s2.charAt(j)) {
						resu = resu.replace(resu.charAt(i), "a");
						break label;
					}
				}
			}
		System.out.println(sb);
	}

}
