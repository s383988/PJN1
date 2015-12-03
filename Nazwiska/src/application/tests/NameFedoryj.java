package application.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import application.model.Connection;
import application.model.Lastname;
import application.model.PatternVariety;

public class NameFedoryj {
	// odmiana nazwiska Fedoryj

		@Test
		public void test() {
			
			PatternVariety patternVariety = new PatternVariety();
	        String[] suffixes = patternVariety.findPattern("Fedoryj", "M");
	        Connection connection = new Connection();
	        Lastname lastname = connection.connect("Fedoryj", suffixes, "M");

	        assertEquals("Mianownik", "Fedoryj", lastname.getMianownik().trim());
	        assertEquals("Dopełniacz", "Fedoryja", lastname.getDopelniacz().trim());
	        assertEquals("Celownik", "Fedoryjowi", lastname.getCelownik().trim());
	        assertEquals("Biernik" , "Fedoryja", lastname.getBiernik().trim());
	        assertEquals("Narzędnik" , "z Fedoryjem", lastname.getNarzednik().trim());
	        assertEquals("Miejscownik" , "o Fedoryju", lastname.getMiejscownik().trim());
	        assertEquals("Wołacz" , "Fedoryju", lastname.getWolacz().trim());
	        
	        
		}

		@Test
		public void test2() {
			
			PatternVariety patternVariety = new PatternVariety();
	        String[] suffixes = patternVariety.findPattern("Fedoryj", "K");
	        Connection connection = new Connection();
	        Lastname lastname = connection.connect("Fedoryj", suffixes, "K");
	        

	        
	        assertEquals("Mianownik", "Fedoryj", lastname.getMianownik().trim());
	        assertEquals("Dopełniacz", "Fedoryj", lastname.getDopelniacz().trim());
	        assertEquals("Celownik", "Fedoryj", lastname.getCelownik().trim());
	        assertEquals("Biernik" , "Fedoryj", lastname.getBiernik().trim());
	        assertEquals("Narzędnik" , "z Fedoryj", lastname.getNarzednik().trim());
	        assertEquals("Miejscownik" , "o Fedoryj", lastname.getMiejscownik().trim());
	        assertEquals("Wołacz" , "Fedoryj", lastname.getWolacz().trim());
	        
	        
		}
		
		@Test
		public void test3() {
			
			PatternVariety patternVariety = new PatternVariety();
	        String[] suffixes = patternVariety.findPattern("Fedoryj", "P");
	        Connection connection = new Connection();
	        Lastname lastname = connection.connect("Fedoryj", suffixes, "P");
	        

	        
	        assertEquals("Mianownik", "Fedoryjowie", lastname.getMianownik().trim());
	        assertEquals("Dopełniacz", "Fedoryjów", lastname.getDopelniacz().trim());
	        assertEquals("Celownik", "Fedoryjom", lastname.getCelownik().trim());
	        assertEquals("Biernik" , "Fedoryjów", lastname.getBiernik().trim());
	        assertEquals("Narzędnik" , "z Fedoryjami", lastname.getNarzednik().trim());
	        assertEquals("Miejscownik" , "o Fedoryjach", lastname.getMiejscownik().trim());
	        assertEquals("Wołacz" , "Fedoryjowie", lastname.getWolacz().trim());
	        
	        
		}


}
