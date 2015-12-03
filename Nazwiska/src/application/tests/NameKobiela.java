package application.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import application.model.Connection;
import application.model.Lastname;
import application.model.PatternVariety;

public class NameKobiela {
	
	@Test
	public void test() {
		
		PatternVariety patternVariety = new PatternVariety();
        String[] suffixes = patternVariety.findPattern("Kobiela", "M");
        Connection connection = new Connection();
        Lastname lastname = connection.connect("Kobiela", suffixes, "M");

        assertEquals("Mianownik", "Kobiela", lastname.getMianownik().trim());
        assertEquals("Dopełniacz", "Kobieli", lastname.getDopelniacz().trim());
        assertEquals("Celownik", "Kobieli", lastname.getCelownik().trim());
        assertEquals("Biernik" , "Kobielę", lastname.getBiernik().trim());
        assertEquals("Narzędnik" , "z Kobielą", lastname.getNarzednik().trim());
        assertEquals("Miejscownik" , "o Kobieli", lastname.getMiejscownik().trim());
        assertEquals("Wołacz" , "Kobielo", lastname.getWolacz().trim());
        
        
	}

	@Test
	public void test2() {
		
		PatternVariety patternVariety = new PatternVariety();
        String[] suffixes = patternVariety.findPattern("Kobiela", "K");
        Connection connection = new Connection();
        Lastname lastname = connection.connect("Kobiela", suffixes, "K");
        

        
        assertEquals("Mianownik", "Kobiela", lastname.getMianownik().trim());
        assertEquals("Dopełniacz", "Kobieli", lastname.getDopelniacz().trim());
        assertEquals("Celownik", "Kobieli", lastname.getCelownik().trim());
        assertEquals("Biernik" , "Kobielę", lastname.getBiernik().trim());
        assertEquals("Narzędnik" , "z Kobielą", lastname.getNarzednik().trim());
        assertEquals("Miejscownik" , "o Kobieli", lastname.getMiejscownik().trim());
        assertEquals("Wołacz" , "Kobielo", lastname.getWolacz().trim());
        
        
	}
	
	@Test
	public void test3() {
		
		PatternVariety patternVariety = new PatternVariety();
        String[] suffixes = patternVariety.findPattern("Kobiela", "P");
        Connection connection = new Connection();
        Lastname lastname = connection.connect("Kobiela", suffixes, "P");
        

        
        assertEquals("Mianownik", "Kobielowie", lastname.getMianownik().trim());
        assertEquals("Dopełniacz", "Kobielów", lastname.getDopelniacz().trim());
        assertEquals("Celownik", "Kobielom", lastname.getCelownik().trim());
        assertEquals("Biernik" , "Kobielów", lastname.getBiernik().trim());
        assertEquals("Narzędnik" , "z Kobielami", lastname.getNarzednik().trim());
        assertEquals("Miejscownik" , "o Kobielach", lastname.getMiejscownik().trim());
        assertEquals("Wołacz" , "Kobielowie", lastname.getWolacz().trim());
        
        
	}


}
