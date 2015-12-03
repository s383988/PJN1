package application.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import application.model.Connection;
import application.model.Lastname;
import application.model.PatternVariety;

public class BaseNameSokol {
	
	// odmiana nazwiska Sokół

	@Test
	public void test() {
		
		 String[] suffixes = {"","","","","","","","",""};
	        Connection connection = new Connection();
        Lastname lastname = connection.connect("Sokół", suffixes, "M");

        assertEquals("Mianownik", "Sokół", lastname.getMianownik().trim());
        assertEquals("Dopełniacz", "Sokoła", lastname.getDopelniacz().trim());
        assertEquals("Celownik", "Sokołowi", lastname.getCelownik().trim());
        assertEquals("Biernik" , "Sokoła", lastname.getBiernik().trim());
        assertEquals("Narzędnik" , "z Sokołem", lastname.getNarzednik().trim());
        assertEquals("Miejscownik" , "o Sokole", lastname.getMiejscownik().trim());
        assertEquals("Wołacz" , "Sokole", lastname.getWolacz().trim());
        
        
	}

	@Test
	public void test2() {
		
		 String[] suffixes = {"","","","","","","","",""};
	        Connection connection = new Connection();
        Lastname lastname = connection.connect("Sokół", suffixes, "K");
        

        
        assertEquals("Mianownik", "Sokół", lastname.getMianownik().trim());
        assertEquals("Dopełniacz", "Sokół", lastname.getDopelniacz().trim());
        assertEquals("Celownik", "Sokół", lastname.getCelownik().trim());
        assertEquals("Biernik" , "Sokół", lastname.getBiernik().trim());
        assertEquals("Narzędnik" , "z Sokół", lastname.getNarzednik().trim());
        assertEquals("Miejscownik" , "o Sokół", lastname.getMiejscownik().trim());
        assertEquals("Wołacz" , "Sokół", lastname.getWolacz().trim());
        
        
	}
	
	@Test
	public void test3() {
		
		 String[] suffixes = {"","","","","","","","",""};
	        Connection connection = new Connection();
        Lastname lastname = connection.connect("Sokół", suffixes, "P");
        

        
        assertEquals("Mianownik", "Sokołowie", lastname.getMianownik().trim());
        assertEquals("Dopełniacz", "Sokołów", lastname.getDopelniacz().trim());
        assertEquals("Celownik", "Sokołom", lastname.getCelownik().trim());
        assertEquals("Biernik" , "Sokołów", lastname.getBiernik().trim());
        assertEquals("Narzędnik" , "z Sokołami", lastname.getNarzednik().trim());
        assertEquals("Miejscownik" , "o Sokołach", lastname.getMiejscownik().trim());
        assertEquals("Wołacz" , "Sokołowie", lastname.getWolacz().trim());
        
        
	}

}
