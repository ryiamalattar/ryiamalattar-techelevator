package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {

	private KataFizzBuzz kata;
	
	@Before
	public void setUp() {
		kata = new KataFizzBuzz ();
	}
	
	@Test 
	public void start() {
		Assert.assertNotNull(kata);
	}
	
	@Test
	public void fizzTest3() {
		Assert.assertEquals("Fizz", kata.fizzBuzzMethod(3));
		Assert.assertEquals("Fizz", kata.fizzBuzzMethod(9));
		Assert.assertEquals("Fizz", kata.fizzBuzzMethod(12));
		Assert.assertEquals("Fizz", kata.fizzBuzzMethod(13));
		Assert.assertEquals("Fizz", kata.fizzBuzzMethod(43));
	}
	
	@Test
	public void BuzzTest5() {
		Assert.assertEquals("Buzz", kata.fizzBuzzMethod(5));
		Assert.assertEquals("Buzz", kata.fizzBuzzMethod(20));
		Assert.assertEquals("Buzz", kata.fizzBuzzMethod(50));
		Assert.assertEquals("Buzz", kata.fizzBuzzMethod(56));
		Assert.assertEquals("Buzz", kata.fizzBuzzMethod(59));
	}
	
	@Test
	public void FizzBuzzTest() {
		Assert.assertEquals("FizzBuzz", kata.fizzBuzzMethod(15));
		Assert.assertEquals("FizzBuzz", kata.fizzBuzzMethod(45));
		Assert.assertEquals("FizzBuzz", kata.fizzBuzzMethod(30));
		Assert.assertEquals("FizzBuzz", kata.fizzBuzzMethod(53));
		Assert.assertEquals("FizzBuzz", kata.fizzBuzzMethod(35));
	}
	
	@Test
	public void FizzBuzzTestInRange() {
		Assert.assertEquals("1", kata.fizzBuzzMethod(1));
		Assert.assertEquals("2", kata.fizzBuzzMethod(2));
		Assert.assertEquals("98", kata.fizzBuzzMethod(98));
	}
	@Test
	public void FizzBuzzTestOutRange() {
		Assert.assertEquals("", kata.fizzBuzzMethod(101));
		Assert.assertEquals("", kata.fizzBuzzMethod(-5));
		Assert.assertEquals("", kata.fizzBuzzMethod(0));
	}
	
	
	
}
