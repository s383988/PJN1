package application.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import application.model.Connection;
import application.model.Lastname;
import application.model.PatternVariety;

public class NameKleszcz {

	@Test
	public void test() {
		
		PatternVariety patternVariety = new PatternVariety();
        String[] suffixes = patternVariety.findPattern("Kleszcz", "M");
        Connection connection = new Connection();
        Lastname lastname = connection.connect("Kleszcz", suffixes, "M");

        assertEquals("Mianownik", "Kleszcz", lastname.getMianownik().trim());
        assertEquals("Dopełniacz", "Kleszcza", lastname.getDopelniacz().trim());
        assertEquals("Celownik", "Kleszczowi", lastname.getCelownik().trim());
        assertEquals("Biernik" , "Kleszcza", lastname.getBiernik().trim());
        assertEquals("Narzędnik" , "z Kleszczem", lastname.getNarzednik().trim());
        assertEquals("Miejscownik" , "o Kleszczu", lastname.getMiejscownik().trim());
        assertEquals("Wołacz" , "Kleszczu", lastname.getWolacz().trim());
        
        
	}

	@Test
	public void test2() {
		
		PatternVariety patternVariety = new PatternVariety();
        String[] suffixes = patternVariety.findPattern("Kleszcz", "K");
        Connection connection = new Connection();
        Lastname lastname = connection.connect("Kleszcz", suffixes, "K");
        

        
        assertEquals("Mianownik", "Kleszcz", lastname.getMianownik().trim());
        assertEquals("Dopełniacz", "Kleszcz", lastname.getDopelniacz().trim());
        assertEquals("Celownik", "Kleszcz", lastname.getCelownik().trim());
        assertEquals("Biernik" , "Kleszcz", lastname.getBiernik().trim());
        assertEquals("Narzędnik" , "z Kleszcz", lastname.getNarzednik().trim());
        assertEquals("Miejscownik" , "o Kleszcz", lastname.getMiejscownik().trim());
        assertEquals("Wołacz" , "Kleszcz", lastname.getWolacz().trim());
        
        
	}
	
	@Test
	public void test3() {
		
		PatternVariety patternVariety = new PatternVariety();
        String[] suffixes = patternVariety.findPattern("Kleszcz", "P");
        Connection connection = new Connection();
        Lastname lastname = connection.connect("Kleszcz", suffixes, "P");
        

        
        assertEquals("Mianownik", "Kleszczowie", lastname.getMianownik().trim());
        assertEquals("Dopełniacz", "Kleszczów", lastname.getDopelniacz().trim());
        assertEquals("Celownik", "Kleszczom", lastname.getCelownik().trim());
        assertEquals("Biernik" , "Kleszczów", lastname.getBiernik().trim());
        assertEquals("Narzędnik" , "z Kleszczami", lastname.getNarzednik().trim());
        assertEquals("Miejscownik" , "o Kleszczach", lastname.getMiejscownik().trim());
        assertEquals("Wołacz" , "Kleszczowie", lastname.getWolacz().trim());
        
        
	}


}
