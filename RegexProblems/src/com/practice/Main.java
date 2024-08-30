package com.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		String regex = "(?i)\\\\b(\\\\w+)(\\\\s+\\\\1)+\\\\b";
        Pattern p = Pattern.compile(regex);
        String s= "Goodbye bye bye world world world Sam went went to to to his business Reya is is the the best player in eye eye game in inthe Hello hello Ab aB";
        Matcher m = p.matcher(s);
        while(m.find()) {
        	s = s.replaceAll(regex,"$1");
        }
        System.out.println(s);

	}

}
