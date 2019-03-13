package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	private List<Word> l;
	//private Map<String,WordEnhanced> m;
	
	public AlienDictionary() {
		l = new LinkedList<Word>();
		//m = new HashMap<String,WordEnhanced>();
	}
	
	public void addWord(String alienWord , String translation) {
		
		Word w = new Word(alienWord, translation);
		boolean flag = true;
		
		for (Word temp : l)
			if (temp.equals(w)) {
				temp.setTranslation(translation); 
				flag = false;
				}
		
		if (flag)
			l.add(w);
		
		/*
		if (m.containsKey(alienWord))
			m.get(alienWord).aggiungi(translation);
		else
			m.put(alienWord, new WordEnhanced(alienWord,translation));
		*/
	}

	public String translateWord(String alienWord) {
		Word w = new Word(alienWord, null);
		
		for (Word temp : l)
			if (temp.equals(w))
				return temp.getTranslation();	
		
		return null;
		
		/*
		String s = "";
		
		if (m.containsKey(alienWord)) {
			for (String temp : m.get(alienWord).elenco())
				s += temp+" ";
			
			return s;
		} else
			return null;
		*/	
	}
	
}
