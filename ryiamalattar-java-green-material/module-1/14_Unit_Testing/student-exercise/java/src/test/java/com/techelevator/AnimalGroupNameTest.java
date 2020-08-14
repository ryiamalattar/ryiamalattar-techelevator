package com.techelevator;

import org.junit.*;


public class AnimalGroupNameTest {
	
	private AnimalGroupName animal;
	
	
	@Before
	public void before() {
		animal = new AnimalGroupName();
	}
	
	
	@Test
	public void testAnimalGroupNameTest() {
		Assert.assertNotNull(animal);
	}
	
	@Test
	public void getHerd() {
		Assert.assertEquals("test for Crash", "Crash", animal.getHerd("Rhino"));
		Assert.assertEquals("test for Tower","Tower", animal.getHerd("girAfFe"));
		Assert.assertEquals("test for unknown","unknown", animal.getHerd(""));
		Assert.assertEquals("test for unknown","unknown", animal.getHerd("Bee"));
		Assert.assertEquals("test for unknown","Float", animal.getHerd("Crocodile"));
	}
	
	


}
