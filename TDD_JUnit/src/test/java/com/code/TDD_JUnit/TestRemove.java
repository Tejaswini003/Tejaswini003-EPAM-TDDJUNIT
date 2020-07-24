package com.code.TDD_JUnit;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestRemove 
{
	Remove removeA;
	@BeforeEach
	void setup()
	{
		Remove removeA=new Remove();
	}
	@Test
	void remove1A() {
		
		String actual=Remove.manipulate("ABCD");
		assertEquals("BCD",actual);
	}
	
	@Test
	void remove2A() {
		
		String actual=Remove.manipulate("AACD");
		assertEquals("CD",actual);
	}
	@Test
	void removesecondA() {
	
		String actual=Remove.manipulate("BACD");
		assertEquals("BCD",actual);
	}
	@Test
	void removeA() {
		
		String actual=Remove.manipulate("BBAA");
		assertEquals("BBAA",actual);
	}
	@Test
	void removeA2() {
	
		String actual=Remove.manipulate("AABAA");
		assertEquals("BAA",actual);
	}
	@Test
	void removeSingleA() {
		
		String actual=Remove.manipulate("A");
		assertEquals("",actual);
	}
	@Test
	void removeDoubleA() {
		
		String actual=Remove.manipulate("AA");
		assertEquals("",actual);
	}
	@Test
	void removeEmptyA() {
	
		String actual=Remove.manipulate("");
		assertEquals("",actual);
	}
}
