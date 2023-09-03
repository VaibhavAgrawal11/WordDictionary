package com.atlus.worddictionary;

import com.atlus.worddictionary.model.WordDefination;
import com.atlus.worddictionary.service.WordDictionary;

import java.util.List;
import java.util.Scanner;

public class WordDictionaryMain {

	public static void main(String[] args) {
		WordDictionary service = new WordDictionary();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Atlus Word Dictionary.");

		while(true) {
			System.out.println("Please select the operation: \n 1) Insert \n 2) Find \n 3) Partial Search \n 4) Remove \n 5) Exit");
			int option = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character

			switch (option) {
			case 1:
				System.out.print("Enter word: ");
				String insertWord = scanner.nextLine();
				System.out.print("Enter definition: ");
				String insertDefinition = scanner.nextLine();
				service.insertWord(insertWord, insertDefinition);
				break;
			case 2:
				System.out.print("Enter word to find definition: ");
				String findWord = scanner.nextLine();
				String definition = service.findDefinition(findWord);
				if (definition != null) {
					System.out.println("Definition: " + definition);
				} else {
					System.out.println("Word not found.");
				}
				break;
			case 3:
				System.out.print("Enter partial word to search: ");
				String partialWord = scanner.nextLine();
				List<WordDefination> definitions = service.partialSearch(partialWord);
				if (!definitions.isEmpty()) {
					System.out.println("Definitions:");
					for (WordDefination def : definitions) {
						System.out.println(def);
					}
				} else {
					System.out.println("No matching words found.");
				}
				break;
			case 4:
				System.out.print("Enter word to remove: ");
				String removeWord = scanner.nextLine();
				service.remove(removeWord);
				break;
			case 5:
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Invalid option. Please enter a valid option.");
			}
		}
	}

}
