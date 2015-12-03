package application.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import application.model.Connection;
import application.model.Lastname;
import application.model.PatternVariety;

public class BaseNameKaczorek {


	@Test
	public void test() {
		 String[] suffixes = {"","","","","","","","",""};
	        Connection connection = new Connection();
        Lastname lastname = connection.connect("Kaczorek", suffixes, "M");

        assertEquals("Mianownik", "Kaczorek", lastname.getMianownik().trim());
        assertEquals("Dopełniacz", "Kaczorka", lastname.getDopelniacz().trim());
        assertEquals("Celownik", "Kaczorkowi", lastname.getCelownik().trim());
        assertEquals("Biernik" , "Kaczorka", lastname.getBiernik().trim());
        assertEquals("Narzędnik" , "z Kaczorkiem", lastname.getNarzednik().trim());
        assertEquals("Miejscownik" , "o Kaczorku", lastname.getMiejscownik().trim());
        assertEquals("Wołacz" , "Kaczorku", lastname.getWolacz().trim());
        
        
	}

	@Test
	public void test2() {
		
		 String[] suffixes = {"","","","","","","","",""};
	        Connection connection = new Connection();
        Lastname lastname = connection.connect("Kaczorek", suffixes, "K");
        

        
        assertEquals("Mianownik", "Kaczorek", lastname.getMianownik().trim());
        assertEquals("Dopełniacz", "Kaczorek", lastname.getDopelniacz().trim());
        assertEquals("Celownik", "Kaczorek", lastname.getCelownik().trim());
        assertEquals("Biernik" , "Kaczorek", lastname.getBiernik().trim());
        assertEquals("Narzędnik" , "z Kaczorek", lastname.getNarzednik().trim());
        assertEquals("Miejscownik" , "o Kaczorek", lastname.getMiejscownik().trim());
        assertEquals("Wołacz" , "Kaczorek", lastname.getWolacz().trim());
        
        
	}
	
	@Test
	public void test3() {
		
		 String[] suffixes = {"","","","","","","","",""};
	        Connection connection = new Connection();
        Lastname lastname = connection.connect("Kaczorek", suffixes, "P");
        

        
        assertEquals("Mianownik", "Kaczorkowie", lastname.getMianownik().trim());
        assertEquals("Dopełniacz", "Kaczorków", lastname.getDopelniacz().trim());
        assertEquals("Celownik", "Kaczorkom", lastname.getCelownik().trim());
        assertEquals("Biernik" , "Kaczorków", lastname.getBiernik().trim());
        assertEquals("Narzędnik" , "z Kaczorkami", lastname.getNarzednik().trim());
        assertEquals("Miejscownik" , "o Kaczorkach", lastname.getMiejscownik().trim());
        assertEquals("Wołacz" , "Kaczorkowie", lastname.getWolacz().trim());
        
        
	}
}
