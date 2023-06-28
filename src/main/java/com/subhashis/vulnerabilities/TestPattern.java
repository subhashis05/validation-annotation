package com.subhashis.vulnerabilities;

import java.util.regex.Pattern;

public class TestPattern {
	private static final String SQL_INJECTION_PATTERN = ".*([';\\\\]+|(--)|(\\b(ALTER|CREATE|DELETE|DROP|EXEC(UTE){0,1}|INSERT( +INTO){0,1}|MERGE|SELECT|UPDATE)\\b)).*";
    private static final Pattern pattern = Pattern.compile(SQL_INJECTION_PATTERN);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "admin'; DROP TABLE users;--";
		//String pattern = "(?i).\\b(ALTER|CREATE|DELETE|DROP|EXEC(UTE){0,1}|INSERT(\\s+INTO){0,1}|MERGE|SELECT|TRUNCATE|UPDATE)\\b.";
		
		
		
		System.out.println(pattern.matcher(str).matches());

	}

}
