////package com.alok.day7;
////
////import java.io.Serializable;
////
////public class Book  implements Serializable{
////	
////	private final static long  serialVersionUUID=1L;
////	
////	
////	private int id;
////	private String name;
////	transient private int age;
////	
////	
////	public int getId() {
////		return id;
////	}
////	public void setId(int id) {
////		this.id = id;
////	}
////	public String getName() {
////		return name;
////	}
////	public void setName(String name) {
////		this.name = name;
////	}
////	public Book(int id, String name) {
////		super();
////		this.id = id;
////		this.name = name;
////	}
////	@Override
////	public String toString() {
////		return "Book [id=" + id + ", name=" + name + "]";
////	}
////	public Book() {
////		super();
////		// TODO Auto-generated constructor stub
////	}
////	
////	
////
////}
////
////import java.util.*;
////
////class DictionaryService {
////    private Map<String, List<String>> dictionary;
////
////    public DictionaryService() {
////        dictionary = new HashMap<>();
////
////        // Adding words with their meanings and synonyms
////        addWord("happy", "Feeling of joy", Arrays.asList("joyful", "content", "cheerful"));
////        addWord("sad", "Feeling of sorrow", Arrays.asList("unhappy", "downcast", "miserable"));
////        addWord("fast", "Moving quickly", Arrays.asList("quick", "speedy", "swift"));
////        addWord("smart", "Intelligent", Arrays.asList("clever", "bright", "sharp"));
////    }
////
////    // Method to add a word along with its meaning and synonyms
////    public void addWord(String word, String meaning, List<String> synonyms) {
////        List<String> details = new ArrayList<>();
////        details.add("Meaning: " + meaning);
////        details.addAll(synonyms);
////        dictionary.put(word.toLowerCase(), details);
////    }
////
////    // Method to retrieve meaning and synonyms
////    public List<String> getWordDetails(String word) {
////        return dictionary.getOrDefault(word.toLowerCase(), null);
////    }
////}
////
////public class DictionaryApp {
////    public static void main(String[] args) {
////        DictionaryService dictionaryService = new DictionaryService();
////        Scanner scanner = new Scanner(System.in);
////
////        System.out.println("Enter a word to get its meaning and synonyms:");
////        String word = scanner.nextLine();
////
////        List<String> details = dictionaryService.getWordDetails(word);
////        
////        if (details != null) {
////            System.out.println("Details for '" + word + "':");
////            for (int i = 0; i < details.size(); i++) {
////                if (i == 0) {
////                    System.out.println(details.get(i));  // First entry is the meaning
////                } else {
////                    System.out.println("Synonym: " + details.get(i)); // Remaining are synonyms
////                }
////            }
////        } else {
////            System.out.println("Word not found in the dictionary.");
////        }
////
////        scanner.close();
////    }
////}
////
//
//
//
//
//
//
//
//
//
//
//
//
////
////import java.util.*;
////
////
////// Persistence Layer: Handles storage of dictionary data
////class DictionaryRepository {
////    private final Map<String, List<String>> dictionary;
////
////    public DictionaryRepository() {
////        this.dictionary = new HashMap<>();
////    }
////
////    public void saveWord(String word, String meaning, List<String> synonyms) {
////        List<String> details = new ArrayList<>();
////        details.add("Meaning: " + meaning);
////        details.addAll(synonyms);
////        dictionary.put(word.toLowerCase(), details);
////    }
////
////    public List<String> getWordDetails(String word) {
////        return dictionary.getOrDefault(word.toLowerCase(), null);
////    }
////
////    public Map<String, List<String>> getAllWords() {
////        return dictionary;
////    }
////}
////
////
////// Service Layer: Handles business logic
////class DictionaryService {
////    private final DictionaryRepository repository;
////
////    public DictionaryService(DictionaryRepository repository) {
////        this.repository = repository;
////    }
////
////    public void addWord(String word, String meaning, List<String> synonyms) {
////        repository.saveWord(word, meaning, synonyms);
////    }
////
////    public List<String> getWordDetails(String word) {
////        return repository.getWordDetails(word);
////    }
////
////    public Map<String, List<String>> getAllWords() {
////        return repository.getAllWords();
////    }
////}
////
////
////// Presentation Layer: Handles user interaction
////public class DictionaryApp {
////    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        DictionaryRepository repository = new DictionaryRepository();
////        DictionaryService service = new DictionaryService(repository);
////
////        while (true) {
////            System.out.println("\nDictionary Menu:");
////            System.out.println("1. Add Word");
////            System.out.println("2. Get Meaning & Synonyms");
////            System.out.println("3. Show All Words");
////            System.out.println("4. Exit");
////            System.out.print("Enter choice: ");
////            int choice = scanner.nextInt();
////            scanner.nextLine();  // Consume newline
////
////            switch (choice) {
////                case 1:
////                    System.out.print("Enter word: ");
////                    String word = scanner.nextLine();
////                    System.out.print("Enter meaning: ");
////                    String meaning = scanner.nextLine();
////                    System.out.print("Enter synonyms (comma-separated): ");
////                    String[] synonymArray = scanner.nextLine().split(",");
////                    List<String> synonyms = new ArrayList<>();
////                    for (String syn : synonymArray) {
////                        synonyms.add(syn.trim());
////                    }
////                    service.addWord(word, meaning, synonyms);
////                    System.out.println("✅ Word added successfully!");
////                    break;
////
////                case 2:
////                    System.out.print("Enter word to search: ");
////                    String searchWord = scanner.nextLine();
////                    List<String> details = service.getWordDetails(searchWord);
////                    if (details != null) {
////                        System.out.println("📖 Details for '" + searchWord + "':");
////                        for (int i = 0; i < details.size(); i++) {
////                            if (i == 0) {
////                                System.out.println(details.get(i));  // Meaning
////                            } else {
////                                System.out.println("Synonym: " + details.get(i));  // Synonyms
////                            }
////                        }
////                    } else {
////                        System.out.println("❌ Word not found.");
////                    }
////                    break;
////
////                case 3:
////                    System.out.println("\n📚 All Words in Dictionary:");
////                    Map<String, List<String>> allWords = service.getAllWords();
////                    if (allWords.isEmpty()) {
////                        System.out.println("Dictionary is empty.");
////                    } else {
////                        for (Map.Entry<String, List<String>> entry : allWords.entrySet()) {
////                            System.out.println("🔹 " + entry.getKey() + ": " + entry.getValue());
////                        }
////                    }
////                    break;
////
////                case 4:
////                    System.out.println("📕 Exiting dictionary. Goodbye!");
////                    scanner.close();
////                    return;
////
////                default:
////                    System.out.println("❌ Invalid choice. Please try again.");
////            }
////        }
////    }
////}
//
//
//Here’s an improved version of the Java dictionary application with **`DuplicateEntryException`** implemented in a separate package. This ensures that the system prevents duplicate words from being added.
//
//---
//
//### **🚀 Project Structure**
//```
//📂 DictionaryApp
//│── 📂 com.dictionary.exception
//│      ├── DuplicateEntryException.java
//│
//│── 📂 com.dictionary.repository
//│      ├── DictionaryRepository.java
//│
//│── 📂 com.dictionary.service
//│      ├── DictionaryService.java
//│
//│── 📂 com.dictionary.presentation
//│      ├── DictionaryApp.java
//```
//
//---
//
//## **1️⃣ Custom Exception Class (DuplicateEntryException.java)**
//📌 **Location:** `com.dictionary.exception`
//```java
//package com.dictionary.exception;
//
//public class DuplicateEntryException extends Exception {
//    public DuplicateEntryException(String message) {
//        super(message);
//    }
//}
//```
//### **✅ Purpose:**
//- Thrown when a user tries to add a word that already exists.
//
//---
//
//## **2️⃣ Persistence Layer (DictionaryRepository.java)**
//📌 **Location:** `com.dictionary.repository`
//```java
//package com.dictionary.repository;
//
//import java.util.*;
//
//public class DictionaryRepository {
//    private final Map<String, List<String>> dictionary;
//
//    public DictionaryRepository() {
//        this.dictionary = new HashMap<>();
//    }
//
//    public void saveWord(String word, String meaning, List<String> synonyms) {
//        List<String> details = new ArrayList<>();
//        details.add("Meaning: " + meaning);
//        details.addAll(synonyms);
//        dictionary.put(word.toLowerCase(), details);
//    }
//
//    public boolean wordExists(String word) {
//        return dictionary.containsKey(word.toLowerCase());
//    }
//
//    public List<String> getWordDetails(String word) {
//        return dictionary.getOrDefault(word.toLowerCase(), null);
//    }
//
//    public Map<String, List<String>> getAllWords() {
//        return dictionary;
//    }
//}
//```
//### **✅ Purpose:**
//- Stores words and meanings in a `HashMap`.
//- Checks if a word already exists (`wordExists()`).
//- Fetches details of a word.
//
//---
//
//## **3️⃣ Service Layer (DictionaryService.java)**
//📌 **Location:** `com.dictionary.service`
//```java
//package com.dictionary.service;
//
//import com.dictionary.repository.DictionaryRepository;
//import com.dictionary.exception.DuplicateEntryException;
//import java.util.*;
//
//public class DictionaryService {
//    private final DictionaryRepository repository;
//
//    public DictionaryService(DictionaryRepository repository) {
//        this.repository = repository;
//    }
//
//    public void addWord(String word, String meaning, List<String> synonyms) throws DuplicateEntryException {
//        if (repository.wordExists(word)) {
//            throw new DuplicateEntryException("❌ Word '" + word + "' already exists in the dictionary!");
//        }
//        repository.saveWord(word, meaning, synonyms);
//    }
//
//    public List<String> getWordDetails(String word) {
//        return repository.getWordDetails(word);
//    }
//
//    public Map<String, List<String>> getAllWords() {
//        return repository.getAllWords();
//    }
//}
//```
//### **✅ Purpose:**
//- **Throws `DuplicateEntryException`** if a word already exists.
//- Calls the `repository` methods to store or fetch data.
//
//---
//
//## **4️⃣ Presentation Layer (DictionaryApp.java)**
//📌 **Location:** `com.dictionary.presentation`
//```java
//package com.dictionary.presentation;
//
//import com.dictionary.service.DictionaryService;
//import com.dictionary.repository.DictionaryRepository;
//import com.dictionary.exception.DuplicateEntryException;
//import java.util.*;
//
//public class DictionaryApp {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        DictionaryRepository repository = new DictionaryRepository();
//        DictionaryService service = new DictionaryService(repository);
//
//        while (true) {
//            System.out.println("\n📚 Dictionary Menu:");
//            System.out.println("1. Add Word");
//            System.out.println("2. Get Meaning & Synonyms");
//            System.out.println("3. Show All Words");
//            System.out.println("4. Exit");
//            System.out.print("Enter choice: ");
//            int choice = scanner.nextInt();
//            scanner.nextLine();  // Consume newline
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter word: ");
//                    String word = scanner.nextLine();
//                    System.out.print("Enter meaning: ");
//                    String meaning = scanner.nextLine();
//                    System.out.print("Enter synonyms (comma-separated): ");
//                    String[] synonymArray = scanner.nextLine().split(",");
//                    List<String> synonyms = new ArrayList<>();
//                    for (String syn : synonymArray) {
//                        synonyms.add(syn.trim());
//                    }
//
//                    try {
//                        service.addWord(word, meaning, synonyms);
//                        System.out.println("✅ Word added successfully!");
//                    } catch (DuplicateEntryException e) {
//                        System.out.println(e.getMessage());
//                    }
//                    break;
//
//                case 2:
//                    System.out.print("Enter word to search: ");
//                    String searchWord = scanner.nextLine();
//                    List<String> details = service.getWordDetails(searchWord);
//                    if (details != null) {
//                        System.out.println("\n📖 Details for '" + searchWord + "':");
//                        for (int i = 0; i < details.size(); i++) {
//                            if (i == 0) {
//                                System.out.println(details.get(i));  // Meaning
//                            } else {
//                                System.out.println("Synonym: " + details.get(i));  // Synonyms
//                            }
//                        }
//                    } else {
//                        System.out.println("❌ Word not found.");
//                    }
//                    break;
//
//                case 3:
//                    System.out.println("\n📚 All Words in Dictionary:");
//                    Map<String, List<String>> allWords = service.getAllWords();
//                    if (allWords.isEmpty()) {
//                        System.out.println("Dictionary is empty.");
//                    } else {
//                        for (Map.Entry<String, List<String>> entry : allWords.entrySet()) {
//                            System.out.println("🔹 " + entry.getKey() + ": " + entry.getValue());
//                        }
//                    }
//                    break;
//
//                case 4:
//                    System.out.println("📕 Exiting dictionary. Goodbye!");
//                    scanner.close();
//                    return;
//
//                default:
//                    System.out.println("❌ Invalid choice. Please try again.");
//            }
//        }
//    }
//}
//```
//---
//
//## **📌 Sample Output**
//```
//📚 Dictionary Menu:
//1. Add Word
//2. Get Meaning & Synonyms
//3. Show All Words
//4. Exit
//Enter choice: 1
//Enter word: intelligent
//Enter meaning: Having a high level of mental ability
//Enter synonyms (comma-separated): clever, bright, smart
//✅ Word added successfully!
//
//📚 Dictionary Menu:
//1. Add Word
//2. Get Meaning & Synonyms
//3. Show All Words
//4. Exit
//Enter choice: 1
//Enter word: intelligent
//Enter meaning: Quick to understand
//Enter synonyms (comma-separated): sharp, witty, genius
//❌ Word 'intelligent' already exists in the dictionary!
//
//📚 Dictionary Menu:
//1. Add Word
//2. Get Meaning & Synonyms
//3. Show All Words
//4. Exit
//Enter choice: 2
//Enter word to search: intelligent
//📖 Details for 'intelligent':
//Meaning: Having a high level of mental ability
//Synonym: clever
//Synonym: bright
//Synonym: smart
//
//📚 Dictionary Menu:
//1. Add Word
//2. Get Meaning & Synonyms
//3. Show All Words
//4. Exit
//Enter choice: 4
//📕 Exiting dictionary. Goodbye!
//```
//
//---
//
//## **✅ Key Benefits of This Approach**
//✔ **Layered Architecture**: `Exception`, `Repository`, `Service`, `Presentation` layers.  
//✔ **Prevents Duplicate Words**: Using `DuplicateEntryException`.  
//✔ **Easy to Maintain & Scale**: Can add a database later without modifying `DictionaryApp`.  
//
//---
//
//## **🚀 Next Steps**
//- Store dictionary words **in a database** using **JDBC/MySQL**.  
//- Implement a **GUI using JavaFX** for a better user interface.  
//
//Would you like me to add **database integration** or a **GUI version**? 🚀😃