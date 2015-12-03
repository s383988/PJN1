package application.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import application.model.Connection;
import application.model.Lastname;
import application.model.PatternVariety;

public class BaseNameGackowski {

	// odmiana nazwiska Gackowski

		@Test
		public void test() {
			 String[] suffixes = {"","","","","","","","",""};
		        Connection connection = new Connection();
	        Lastname lastname = connection.connect("Gackowski", suffixes, "M");

	        assertEquals("Mianownik", "Gackowski", lastname.getMianownik().trim());
	        assertEquals("Dopełniacz", "Gackowskiego", lastname.getDopelniacz().trim());
	        assertEquals("Celownik", "Gackowskiemu", lastname.getCelownik().trim());
	        assertEquals("Biernik" , "Gackowskiego", lastname.getBiernik().trim());
	        assertEquals("Narzędnik" , "z Gackowskim", lastname.getNarzednik().trim());
	        assertEquals("Miejscownik" , "o Gackowskim", lastname.getMiejscownik().trim());
	        assertEquals("Wołacz" , "Gackowski", lastname.getWolacz().trim());
	        
	        
		}

		@Test
		public void test2() {
			
			 String[] suffixes = {"","","","","","","","",""};
		        Connection connection = new Connection();
	        Lastname lastname = connection.connect("Gackowski", suffixes, "K");
	        

	        
	        assertEquals("Mianownik", "Gackowska", lastname.getMianownik().trim());
	        assertEquals("Dopełniacz", "Gackowskiej", lastname.getDopelniacz().trim());
	        assertEquals("Celownik", "Gackowskiej", lastname.getCelownik().trim());
	        assertEquals("Biernik" , "Gackowską", lastname.getBiernik().trim());
	        assertEquals("Narzędnik" , "z Gackowską", lastname.getNarzednik().trim());
	        assertEquals("Miejscownik" , "o Gackowskiej", lastname.getMiejscownik().trim());
	        assertEquals("Wołacz" , "Gackowska", lastname.getWolacz().trim());
	        
	        
		}
		
		@Test
		public void test3() {
			 String[] suffixes = {"","","","","","","","",""};
		        Connection connection = new Connection();
	        Lastname lastname = connection.connect("Gackowski", suffixes, "P");
	        

	        
	        assertEquals("Mianownik", "Gackowscy", lastname.getMianownik().trim());
	        assertEquals("Dopełniacz", "Gackowskich", lastname.getDopelniacz().trim());
	        assertEquals("Celownik", "Gackowskim", lastname.getCelownik().trim());
	        assertEquals("Biernik" , "Gackowskich", lastname.getBiernik().trim());
	        assertEquals("Narzędnik" , "z Gackowskimi", lastname.getNarzednik().trim());
	        assertEquals("Miejscownik" , "o Gackowskich", lastname.getMiejscownik().trim());
	        assertEquals("Wołacz" , "Gackowscy", lastname.getWolacz().trim());
	        
	        
		}


}
