package com.atlus.worddictionary.service;

import java.util.ArrayList;
import java.util.List;

import com.atlus.worddictionary.model.WordDefination;

public class WordDictionary {
    private List<WordDefination> dictionary;
    
    public WordDictionary() {
        dictionary = new ArrayList<>();
    }

    public void insertWord(String word, String definition) {
        // Check if the word already exists in the dictionary and update its definition
        for (WordDefination wd : dictionary) {
            if (wd.getWord().equalsIgnoreCase(word)) {
                wd.setDefination(definition);
                return; // Exit early if the word is found and updated
            }
        }
        // If the word doesn't exist, add it to the dictionary
        dictionary.add(new WordDefination(word, definition));
    }

    public String findDefinition(String word) {
        for (WordDefination wd : dictionary) {
            if (wd.getWord().equalsIgnoreCase(word)) {
                return wd.getDefination(); // Return the definition if the word is found
            }
        }
        return null; // Return null if the word is not found
    }

    public List<WordDefination> partialSearch(String partialWord) {
        partialWord = partialWord.toLowerCase(); // Convert partialWord to lowercase for case-insensitive search
        List<WordDefination> definitions = new ArrayList<>();
        for (WordDefination wd : dictionary) {
            if (wd.getWord().toLowerCase().contains(partialWord)) {
                definitions.add(wd); // Add matching definitions to the list
            }
        }
        return definitions;
    }

    public void remove(String word) {
        // Find and remove the word from the dictionary
        for (int i = 0; i < dictionary.size(); i++) {
            WordDefination wd = dictionary.get(i);
            if (wd.getWord().equalsIgnoreCase(word)) {
                dictionary.remove(i);
                return; // Exit early if the word is found and removed
            }
        }
    }
}

