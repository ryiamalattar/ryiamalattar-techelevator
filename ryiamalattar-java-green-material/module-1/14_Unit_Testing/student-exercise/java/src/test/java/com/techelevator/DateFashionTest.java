package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class DateFashionTest {

	private DateFashion date;
	
	@Before
	public void setUp() {
		date = new DateFashion();
	}
	
	@Test
	public void getATableTestBelow2() {
		Assert.assertEquals("test if you 1 and date 0" ,0, date.getATable(1, 0));
		Assert.assertEquals("test if you -1 and date 2" ,0, date.getATable(-1, 2));
		Assert.assertEquals("test if you 10 and date 2" ,0, date.getATable(10, 2));
	}
	
	@Test
	public void getATableTestabove8() {
		Assert.assertEquals("test if you 8 and date 14" ,2, date.getATable(8, 14));
		Assert.assertEquals("test if you 10 and date 2" ,2, date.getATable(10, 12));
	}
	
	@Test
	public void getATableTestOne() {
		Assert.assertEquals("test if you 5 and date 6" ,1, date.getATable(5, 6));
		Assert.assertEquals("test if you 3 and date 3" ,1, date.getATable(3, 3));
	}
	
	
}
