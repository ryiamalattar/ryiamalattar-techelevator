package com.techelevator;
import org.junit.*;

public class CigarPartyTest {
	
	 private CigarParty cigar;
	 
	 @Before
	 public void runBeforeTest() {
		 cigar = new CigarParty();
	 }
	 
	 @Test
	 public void havePartyTest() {
		
		 Assert.assertEquals("test for 30,false", false, cigar.haveParty(30, false));
		 Assert.assertEquals("test for 50,false", true, cigar.haveParty(50, false));
		 Assert.assertEquals("test for 20,true", false, cigar.haveParty(20, true));
		 Assert.assertEquals("test for 80,false", false, cigar.haveParty(80, false));
		 Assert.assertEquals("test for -4,true", false, cigar.haveParty(-4, true));
		 Assert.assertEquals("test for 90,true", true, cigar.haveParty(80, true));
	 }
	 
	 
	

}
