package application.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import application.Main;

public class PatternVariety {
	
	private String name;
	private Boolean regexpMatch;
	
	
	public String []  findPattern(String name, String type ){
		
		String path = Main.class.getResource("odmiana").toString().substring(5);
		File file = new File(path);
		String line;
	    String variety [] = null;
	    String pattern = "";
	    regexpMatch = false;
	        
		try {

	        Scanner sc = new Scanner(file);
	       
	        
	        while(sc.hasNextLine() && !regexpMatch){
	        	line = sc.nextLine();
	        	if(line.startsWith(type)){
		        	variety = line.split(",");
		        	pattern = variety[1];
		        	regexpMatch = checkRegexpMatch(pattern, name);
	        	}
	        	if(!regexpMatch)
	        		variety = null;
	        	
	        }
	        sc.close();
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
		
		
		return variety;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	private boolean checkRegexpMatch(String p, String n){
		Pattern pat = Pattern.compile(p);
		Matcher m = pat.matcher(n);
		return m.find();
		
	}
}
