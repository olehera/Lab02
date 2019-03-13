package it.polito.tdp.alien;

public class Word {
	
	private String alienWord;
	private String translation;
	
	public Word(String a, String b) {
		alienWord = a;
		translation = b;
	}
	
	public String getAlienWord() {
		return alienWord;
	}

	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}

	@Override
	public boolean equals(Object obj) {
		Word other = (Word)obj;
		String s = other.getAlienWord();
		String st = s;
		
		if (s.compareTo(this.alienWord) == 0)
			return true;
		else if (s.contains("?")) {
		Character alfa[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		for(int i=0; i<alfa.length; i++) {
			if (s.replace('?', alfa[i]).compareTo(this.alienWord) == 0)
				return true; 
			else
				s = st;
		}}
		return false;
	}
}
