package com.junit_testing;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringUtilityMethodTest {
	
	StringUtilityMethods ob=new StringUtilityMethods();
	@Test
	void testReverseString()
	{
		assertEquals("olleh", ob.reverseString("hello"));
	}
	@Test
	void testIsPalindromeTrue()
	{
		assertTrue(ob.isPalindrome("madam"));
	}
	void testIsPalindromeFalse()
	{
		assertFalse(ob.isPalindrome("hello"));
	}
	@Test
	void testToUpperCase()
	{
		assertEquals("HELLO", ob.toUpperCase("hello"));
	}
	

}
