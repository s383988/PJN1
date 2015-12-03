package application.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import application.model.Connection;
import application.model.Lastname;
import application.model.PatternVariety;

public class BaseNameKlis {

	@Test
	public void test() {
		 String[] suffixes = {"","","","","","","","",""};
	        Connection connection = new Connection();
        Lastname lastname = connection.connect("Kliś", suffixes, "M");

        assertEquals("Mianownik", "Kliś", lastname.getMianownik().trim());
        assertEquals("Dopełniacz", "Klisia", lastname.getDopelniacz().trim());
        assertEquals("Celownik", "Klisiowi", lastname.getCelownik().trim());
        assertEquals("Biernik" , "Klisia", lastname.getBiernik().trim());
        assertEquals("Narzędnik" , "z Klisiem", lastname.getNarzednik().trim());
        assertEquals("Miejscownik" , "o Klisiu", lastname.getMiejscownik().trim());
        assertEquals("Wołacz" , "Klisiu", lastname.getWolacz().trim());
        
        
	}

	@Test
	public void test2() {
		
		 String[] suffixes = {"","","","","","","","",""};
	        Connection connection = new Connection();
        Lastname lastname = connection.connect("Kliś", suffixes, "K");
        

        
        assertEquals("Mianownik", "Kliś", lastname.getMianownik().trim());
        assertEquals("Dopełniacz", "Kliś", lastname.getDopelniacz().trim());
        assertEquals("Celownik", "Kliś", lastname.getCelownik().trim());
        assertEquals("Biernik" , "Kliś", lastname.getBiernik().trim());
        assertEquals("Narzędnik" , "z Kliś", lastname.getNarzednik().trim());
        assertEquals("Miejscownik" , "o Kliś", lastname.getMiejscownik().trim());
        assertEquals("Wołacz" , "Kliś", lastname.getWolacz().trim());
        
        
	}
	
	@Test
	public void test3() {
		
		 String[] suffixes = {"","","","","","","","",""};
	        Connection connection = new Connection();
        Lastname lastname = connection.connect("Kliś", suffixes, "P");
        

        
        assertEquals("Mianownik", "Klisiowie", lastname.getMianownik().trim());
        assertEquals("Dopełniacz", "Klisiów", lastname.getDopelniacz().trim());
        assertEquals("Celownik", "Klisiom", lastname.getCelownik().trim());
        assertEquals("Biernik" , "Klisiów", lastname.getBiernik().trim());
        assertEquals("Narzędnik" , "z Klisiami", lastname.getNarzednik().trim());
        assertEquals("Miejscownik" , "o Klisiach", lastname.getMiejscownik().trim());
        assertEquals("Wołacz" , "Klisiowie", lastname.getWolacz().trim());
        
        
	}

}
