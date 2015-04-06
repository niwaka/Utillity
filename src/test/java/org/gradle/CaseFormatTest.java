package org.gradle;

import org.junit.Test;

public class CaseFormatTest {

	@Test
	public void testCamelToSnake() {
		System.out.println(CaseFormat.camelToSnake("longDate"));
	}
	
	@Test
	public void testSnakeToCamel() {
		System.out.println(CaseFormat.snakeToCamel("long_date"));
	}
}
