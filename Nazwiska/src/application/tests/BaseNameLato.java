package application.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import application.model.Connection;
import application.model.Lastname;
import application.model.PatternVariety;

public class BaseNameLato {
	@Test
	public void test() {
		
		 String[] suffixes = {"","","","","","","","",""};
	        Connection connection = new Connection();
        Lastname lastname = connection.connect("Lato", suffixes, "M");

        assertEquals("Mianownik", "Lato", lastname.getMianownik().trim());
        assertEquals("Dopełniacz", "Laty", lastname.getDopelniacz().trim());
        assertEquals("Celownik", "Lacie", lastname.getCelownik().trim());
        assertEquals("Biernik" , "Latę", lastname.getBiernik().trim());
        assertEquals("Narzędnik" , "z Latą", lastname.getNarzednik().trim());
        assertEquals("Miejscownik" , "o Lacie", lastname.getMiejscownik().trim());
        assertEquals("Wołacz" , "Lato", lastname.getWolacz().trim());
        
        
	}

	@Test
	public void test2() {
		
		 String[] suffixes = {"","","","","","","","",""};
	        Connection connection = new Connection();
        Lastname lastname = connection.connect("Lato", suffixes, "K");
        

        
        assertEquals("Mianownik", "Lato", lastname.getMianownik().trim());
        assertEquals("Dopełniacz", "Lato", lastname.getDopelniacz().trim());
        assertEquals("Celownik", "Lato", lastname.getCelownik().trim());
        assertEquals("Biernik" , "Lato", lastname.getBiernik().trim());
        assertEquals("Narzędnik" , "z Lato", lastname.getNarzednik().trim());
        assertEquals("Miejscownik" , "o Lato", lastname.getMiejscownik().trim());
        assertEquals("Wołacz" , "Lato", lastname.getWolacz().trim());
        
        
	}
	
	@Test
	public void test3() {
		
		 String[] suffixes = {"","","","","","","","",""};
	        Connection connection = new Connection();
        Lastname lastname = connection.connect("Lato", suffixes, "P");
        

        
        assertEquals("Mianownik", "Latowie", lastname.getMianownik().trim());
        assertEquals("Dopełniacz", "Latów", lastname.getDopelniacz().trim());
        assertEquals("Celownik", "Latom", lastname.getCelownik().trim());
        assertEquals("Biernik" , "Latów", lastname.getBiernik().trim());
        assertEquals("Narzędnik" , "z Latami", lastname.getNarzednik().trim());
        assertEquals("Miejscownik" , "o Latach", lastname.getMiejscownik().trim());
        assertEquals("Wołacz" , "Latowie", lastname.getWolacz().trim());
        
        
	}

}
