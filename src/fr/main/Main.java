package fr.main;

import fr.elements.ListeChainee;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ListeChainee<String> maListe = new ListeChainee<>();
		maListe.add("First");
		maListe.add("Second");
		maListe.add("third");
		maListe.add("fourth");
		
		maListe.print();
		System.out.println("get(0): "+maListe.get(0));
		System.out.println("get(1): "+maListe.get(1));
		System.out.println("get(2): "+maListe.get(2));
		System.out.println("get(3): "+maListe.get(3));
		System.out.println("get(4): "+maListe.get(4));
		
		System.out.println("maListe.remove(0)");
		maListe.remove(0);	
		maListe.print();
		
		System.out.println("maListe.remove(2)");
		maListe.remove(2);	
		maListe.print();
	
	}

}
