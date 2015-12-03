package application.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import application.model.Connection;
import application.model.Lastname;
import application.model.PatternVariety;

public class NameGrobelny {

	@Test
	public void test() {
		
		PatternVariety patternVariety = new PatternVariety();
        String[] suffixes = patternVariety.findPattern("Grobelny", "M");
        Connection connection = new Connection();
        Lastname lastname = connection.connect("Grobelny", suffixes, "M");

        assertEquals("Mianownik", "Grobelny", lastname.getMianownik().trim());
        assertEquals("Dopełniacz", "Grobelnego", lastname.getDopelniacz().trim());
        assertEquals("Celownik", "Grobelnemu", lastname.getCelownik().trim());
        assertEquals("Biernik" , "Grobelnego", lastname.getBiernik().trim());
        assertEquals("Narzędnik" , "z Grobelnym", lastname.getNarzednik().trim());
        assertEquals("Miejscownik" , "o Grobelnym", lastname.getMiejscownik().trim());
        assertEquals("Wołacz" , "Grobelny", lastname.getWolacz().trim());
        
        
	}

	@Test
	public void test2() {
		
		PatternVariety patternVariety = new PatternVariety();
        String[] suffixes = patternVariety.findPattern("Grobelny", "K");
        Connection connection = new Connection();
        Lastname lastname = connection.connect("Grobelny", suffixes, "K");
        

        
        assertEquals("Mianownik", "Grobelna", lastname.getMianownik().trim());
        assertEquals("Dopełniacz", "Grobelnej", lastname.getDopelniacz().trim());
        assertEquals("Celownik", "Grobelnej", lastname.getCelownik().trim());
        assertEquals("Biernik" , "Grobelną", lastname.getBiernik().trim());
        assertEquals("Narzędnik" , "z Grobelną", lastname.getNarzednik().trim());
        assertEquals("Miejscownik" , "o Grobelnej", lastname.getMiejscownik().trim());
        assertEquals("Wołacz" , "Grobelna", lastname.getWolacz().trim());
        
        
	}
	
	@Test
	public void test3() {
		
		PatternVariety patternVariety = new PatternVariety();
        String[] suffixes = patternVariety.findPattern("Grobelny", "P");
        Connection connection = new Connection();
        Lastname lastname = connection.connect("Grobelny", suffixes, "P");
        

        
        assertEquals("Mianownik", "Grobelni", lastname.getMianownik().trim());
        assertEquals("Dopełniacz", "Grobelnych", lastname.getDopelniacz().trim());
        assertEquals("Celownik", "Grobelnym", lastname.getCelownik().trim());
        assertEquals("Biernik" , "Grobelnych", lastname.getBiernik().trim());
        assertEquals("Narzędnik" , "z Grobelnymi", lastname.getNarzednik().trim());
        assertEquals("Miejscownik" , "o Grobelnych", lastname.getMiejscownik().trim());
        assertEquals("Wołacz" , "Grobelni", lastname.getWolacz().trim());
        
        
	}



}
