package application.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import application.model.Connection;
import application.model.Lastname;
import application.model.PatternVariety;

public class BaseNameKobiela {
	
	@Test
	public void test() {
		 String[] suffixes = {"","","","","","","","",""};
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
		
		 String[] suffixes = {"","","","","","","","",""};
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
		
		 String[] suffixes = {"","","","","","","","",""};
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
