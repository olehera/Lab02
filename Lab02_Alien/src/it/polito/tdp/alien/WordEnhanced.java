package it.polito.tdp.alien;

import java.util.*;

public class WordEnhanced {
	
	private String alienWord;
	private List<String> translations;
	
	public WordEnhanced(String a, String b) {
		alienWord = a;
		translations = new LinkedList<String>();
		translations.add(b);
	}

	public void aggiungi(String b) {
		boolean flag = true;
		
		for (String temp : translations)
			if (temp.compareTo(b)==0)
				flag = false;
		
		if (flag)
			translations.add(b);
	}
	
	public String getAlienWord() {
		return alienWord;
	}

	public Collection<String> elenco() {
		return translations;
	}
}
