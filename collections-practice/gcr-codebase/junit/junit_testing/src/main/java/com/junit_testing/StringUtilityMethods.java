package com.junit_testing;

public class StringUtilityMethods {

	public String reverseString(String str) {
		String newStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			newStr += str.charAt(i);
		}
		return newStr;
	}

	public boolean isPalindrome(String str) {
		int start = 0;
		int end = str.length() - 1;
		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public String toUpperCase(String str) {
		String upperStr = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				upperStr += (char) (ch - 32);
			} else {
				upperStr += ch;
			}
		}
		return upperStr;
	}
}
