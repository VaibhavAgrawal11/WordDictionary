# WordDictionary Java Application

The WordDictionary Java application allows you to create, manage, and search for word definitions. This README provides documentation for each of the methods in the `WordDictionary` class and instructions on how to run the main method from the command line.

## `WordDictionary` Class Documentation

### `public WordDictionary()`

The constructor initializes an empty dictionary.

### `public void insertWord(String word, String definition)`

Inserts a word and its corresponding definition into the dictionary. If the word already exists, it will override the word and its definition.

Example:
```
WordDictionary dictionary = new WordDictionary();
dictionary.insertWord("apple", "a fruit");
dictionary.insertWord("banana", "another fruit");
```

### `public String findDefinition(String word)`
Returns the definition for a given word. Returns null if the word is not found in the dictionary.

Example:

```
String definition = dictionary.findDefinition("apple"); // Returns "a fruit"
String notFound = dictionary.findDefinition("grape");  // Returns null
```

### `public List<String> partialSearch(String partialWord)`
Returns a list of definitions for words that partially match the provided partial word.

Example:

```
List<String> definitions = dictionary.partialSearch("app");
// Returns ["a fruit", "another fruit"]
```
### `public void remove(String word)`
Removes a word and its definition from the dictionary.

Example:

```
dictionary.remove("apple");
// The word "apple" and its definition are removed from the dictionary.
```


# `How to Run the Main Method`

### Compile the Java files in your project directory using the javac command:

```
javac WordDictionaryMain.java 
```

### Run the Main class using the java command:

```
java WordDictionaryMain
```

The program will display a menu for interacting with the WordDictionary. Follow the on-screen instructions to insert words, find definitions, perform partial searches, and remove words.

```
Enter an option:
1. Insert Word
2. Find Definition
3. Partial Search
4. Remove Word
5. Exit
To exit the program, choose option 5.
```

That's it! You can now use the WordDictionary application from the command line to manage and search for word definitions.
