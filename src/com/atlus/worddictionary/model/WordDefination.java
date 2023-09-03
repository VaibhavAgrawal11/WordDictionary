package com.atlus.worddictionary.model;

public class WordDefination {
	private String word;
	private String defination;

	public WordDefination(String word, String defination) {
		this.setWord(word);
		this.setDefination(defination);
	}

	public String getDefination() {
		return defination;
	}

	public void setDefination(String defination) {
		this.defination = defination;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public String toString() {
		return "WordDefination [word=" + word + ", defination=" + defination + "]";
	}
	
	
}
