package application.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import application.model.Connection;
import application.model.Lastname;
import application.model.PatternVariety;

public class BaseNameIskra {

	@Test
	public void test() {
		
		 String[] suffixes = {"","","","","","","","",""};
	        Connection connection = new Connection();
        Lastname lastname = connection.connect("Iskra", suffixes, "M");

        assertEquals("Mianownik", "Iskra", lastname.getMianownik().trim());
        assertEquals("Dopełniacz", "Iskry", lastname.getDopelniacz().trim());
        assertEquals("Celownik", "Iskrze", lastname.getCelownik().trim());
        assertEquals("Biernik" , "Iskrę", lastname.getBiernik().trim());
        assertEquals("Narzędnik" , "z Iskrą", lastname.getNarzednik().trim());
        assertEquals("Miejscownik" , "o Iskrze", lastname.getMiejscownik().trim());
        assertEquals("Wołacz" , "Iskro", lastname.getWolacz().trim());
        
        
	}

	@Test
	public void test2() {
		
		 String[] suffixes = {"","","","","","","","",""};
	        Connection connection = new Connection();
        Lastname lastname = connection.connect("Iskra", suffixes, "K");
        

        
        assertEquals("Mianownik", "Iskra", lastname.getMianownik().trim());
        assertEquals("Dopełniacz", "Iskry", lastname.getDopelniacz().trim());
        assertEquals("Celownik", "Iskrze", lastname.getCelownik().trim());
        assertEquals("Biernik" , "Iskrę", lastname.getBiernik().trim());
        assertEquals("Narzędnik" , "z Iskrą", lastname.getNarzednik().trim());
        assertEquals("Miejscownik" , "o Iskrze", lastname.getMiejscownik().trim());
        assertEquals("Wołacz" , "Iskro", lastname.getWolacz().trim());
        
        
	}
	
	@Test
	public void test3() {
		
		 String[] suffixes = {"","","","","","","","",""};
	        Connection connection = new Connection();
        Lastname lastname = connection.connect("Iskra", suffixes, "P");
        

        
        assertEquals("Mianownik", "Iskrowie", lastname.getMianownik().trim());
        assertEquals("Dopełniacz", "Iskrów", lastname.getDopelniacz().trim());
        assertEquals("Celownik", "Iskrom", lastname.getCelownik().trim());
        assertEquals("Biernik" , "Iskrów", lastname.getBiernik().trim());
        assertEquals("Narzędnik" , "z Iskrami", lastname.getNarzednik().trim());
        assertEquals("Miejscownik" , "o Iskrach", lastname.getMiejscownik().trim());
        assertEquals("Wołacz" , "Iskrowie", lastname.getWolacz().trim());
        
        
	}


}
