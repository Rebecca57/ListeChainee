package com.chaines;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Instant;

public class Main {

	public static void main(String[] args) throws IOException {

	    // Enter data using BufferReader
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    //System.out.println("Nom: ");
	    //String name = String.format("%10s", reader.readLine());
	    
	    //System.out.println("Nombre d'articles: ");
	    //String nbr = String.format("%2s", reader.readLine());
	 
	    //System.out.println("Prix unitaire :");
	    //String prix = String.format("%3s", reader.readLine());
	    
	    //Chaine à modifier
	    String exemple = String.format( "        cher mr [NOM], vous achetez [X] articles au prix de [PRIX]$");
	    
	    //Modifier par les valeurs saisies & suppression des espaces inutiles
	    //String newString = exemple.replace("[NOM]", name).replace("[X]", nbr).replace("[PRIX]", prix).trim();
	    //Mettre la premiere lettre en upperCase
	    //newString = newString.substring(0,1).toUpperCase() + newString.substring(1,newString.length());
	    
	    //System.out.println(newString);
	    
	    String test = "aaa5";
	    System.out.println(test.matches("[a-b]*[0-9]?"));
	    
	    Instant testInstant = Instant.MAX;
	    System.out.println(testInstant);
	}
}