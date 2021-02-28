package wee4Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class wee4Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.) Why would we use a Stringbuilder instead of a String?
		// main difference is that a string is immutable and Stringbuilder is not, so a String cannot be chance
		
		//2.) Instantiate a new Stringbuilder and append the characters 0 - 9 to it separated by dashes, make usre no dash at end of Stringbuilder
		StringBuilder stringB = new StringBuilder();
		
		for (int i = 0; i < 10; i++) {
			if (i != 9) {
			stringB.append(i + "-");
		} else {
			stringB.append(i);
		}
		
		}
		System.out.println(stringB.toString()); 
		
		
		//3.) Create a list of Strings and add 5 Strings to it. each with a different length  // can do List<String> string = new ArrayList<String>("name, "name",....) 
		List<String> namesInList = new ArrayList<String>(); 
		namesInList.add("Bob");
		namesInList.add("Dave");
		namesInList.add("Thomas");
		namesInList.add("Ty");
		namesInList.add("Johns");
		
		
		
		//4.) Write and test a method that takes a list of strings and returns the shortest string
		System.out.println(shortestString(namesInList));
		
		
		//5.) Write and test a method that takes a list of strings and returns the list with the first and last element switched
		List<String> FLS = firstLastSwitch(namesInList); 
		for (String names : FLS) {
			System.out.println(names);
		}
		//6.) Write and test a method that takes a list of strings and returns a string with all the list elements concatenated to each toher seprated by a coma
		
		System.out.println(concatString(namesInList)); 
		
		//7.) Write and test a method that takes a list of strings and a string and returns a new list with all strings from the original list containing the second string parameter (like a search)
		
		List<String> searchResults = search(namesInList, "o");
		for (String result : searchResults) {
			System.out.println(result);
		}
		//8.) Write and test a method that takes a list of integers and returns a List<List<Interger>> where the first list in the returned value contains any number from the input list that is div by 2, the sec div by 3, thrid div 5, and fourth all number from the input list not div by 2, 3, or 5
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<List<Integer>> sort  = mulitDivision(numbers);
		
		//using a nested loop here
		
		for (List<Integer> list : sort) {
			for (Integer number : list) {
				System.out.println(number);
			}
			System.out.println("New List...................");
		}
		
		//9.) Write and test a method that takes a list of strings and returns a list of integers that contains the length of each string
		
		List<Integer> stringsLengths = calTheLength(namesInList);
		for (Integer i : stringsLengths) {
			System.out.println(i); 
		
		}
		
		//10.) Create a set of strings and add 5 values
		
		Set<String> set = new HashSet<String>();
		set.add("hello");
		set.add("Robert");
		set.add("Green");
		set.add("Blue");
		set.add("see ya"); 
		
		// 11.) Write and test a method that takes a set of strings and a character and returns a set of strings consisting of all the strings in the input set that start with the character paramter
		
		Set<String> beginsWith = nameOfMethod(set, 'h');
		for (String word : beginsWith) {
			System.out.println(word);
		}
		
		
		//12.) Write and test a method that takes a set of strings and returns a list of the same strings
		
		//what are they doing? taking a set and making it a list? what's that about?????
		
		List<String> resultlist = setToList(set);   //set is the name of the "set" above.
		
		for (String listString : resultlist) {
			System.out.println(listString);
		}
		//13.) Write and test a method that takes a set of integers and returns a new set of integers containing only even numbers from the orginal set
		
		Set<Integer> theIntSet = new HashSet<Integer>();        //onlyEvenNum(set);
		theIntSet.add(1);
		theIntSet.add(2);
		theIntSet.add(3);
		theIntSet.add(4);
		
		Set<Integer> resultsEvenNUm = onlyEvenNum(theIntSet);
		for (Integer number : resultsEvenNUm ) {
			System.out.println(number);
		}
		
		//14.) Create a map of string and string and add 3 items to it where the key of each is a word and the value is a defintion of the word
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("cow", "is a big farm animal");
		dictionary.put("chicken", "is a small farm animal");
		dictionary.put("rooster", "is a small farm animal");
		
		//15.) Write and test a method that takes a Map<String, String> and a string and returns the value of a key in the map that matches the string parameter (like dictionary lookup)
		
		String value = findLookupValue(dictionary, "cow");
		System.out.println(value); 
		
		//16.) Write and test a methods that takes a List<String> and return a MapCharacter, Integer> containing a count of all the strings that start with a given character
		
		Map<Character, Integer> theCount = countLetters(resultlist);
		for(Character character : theCount.keySet()) {
			System.out.println(character + " , " + theCount.get(character)); 
		}
		
	}  //main method end
	
	//4.)
	
	
	public static String shortestString(List<String> namesInList) {
		String theShortestOne = namesInList.get(0);
		for (String string : namesInList) {  //enhanced for loop
			if (string.length() < theShortestOne.length ()) {
				theShortestOne = string; 
				
			}
		}
		
		return theShortestOne; 
	} 

	//5.)
	
	public static List<String> firstLastSwitch(List<String> namesInList) {
		String temp = namesInList.get(0);
		namesInList.set(0, namesInList.get(namesInList.size() - 1));
		namesInList.set(namesInList.size() - 1, temp);
		return namesInList;
		
	}
	
	//6.)
	
	public static String concatString(List<String> namesInList) {
		StringBuilder concat = new StringBuilder();
		for (String string : namesInList); {
			concat.append(namesInList + ", "); 	
		}
		return concat.toString();
	}
	
	//7.)
	
	public static List<String> search(List<String> list, String query) {
		List<String> results = new ArrayList<String>();
		for (String string : list) {
			if (string.contains(query)) {
				results.add(string);
			}
		}
		return results;
	}
	
	//8.)
	
	public static List<List<Integer>> mulitDivision(List<Integer> theList) {
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>()); 
		
		for (Integer number : theList) {
			if (number % 2 == 0) {
				results.get(0).add(number);
			}
			if (number % 3 == 0) {
				results.get(1).add(number);
			}

			if (number % 5 == 0) {
				results.get(2).add(number);
			}
			if (number % 5 == 0) {
				results.get(2).add(number);
			}
			if (number % 2 != 0 && number % 3 != 0 && number %5 != 0) {
				results.get(3).add(number); 
			}
			
		}
			
		return results; 
	}
	
	//9.)
	
	public static List<Integer> calTheLength(List<String> theList) {
		List<Integer> lengths = new ArrayList<Integer>();
		for (String string : theList) {
			lengths.add(string.length());
		}
		return lengths;
	}
	
	//10.) no method needed
	
	
	//11.)
	
	public static Set<String> nameOfMethod(Set<String> set, char o) {  //why am i using this letter? he used 'c'
		Set<String> results = new HashSet<String>();
		
		for(String string : set)  {
			if (string.charAt(0) == o) {
				results.add(string);
			}
		}
		return results;
		
	}
	
	//12.)
	
	public static List<String> setToList(Set<String> set) {
		List<String> results = new ArrayList<String>();
		
		for(String string : set) {
			results.add(string);
		}
		return results;
	}
	
	//13.) 
	
	public static Set<Integer> onlyEvenNum(Set<Integer> set) {
		Set<Integer> results = new HashSet<Integer>(); 
			for (Integer number : set) {
				if (number % 2 == 0) { 
					results.add(number);
				}
			}
			return results; 
		
	}
	
	//14.) above only
	
	//15.)
	
	public static String findLookupValue(Map<String, String> nameMap, String nameString) {
		for (String key : nameMap.keySet()) {
			if (key.equals(nameString)) {
				return nameMap.get(key);

			}
		}
		return "";
	}
	
	//16.)
	
	public static Map<Character, Integer> countLetters(List<String> nameIsList) {
		Map<Character, Integer> callThisResults = new HashMap<Character, Integer>(); 	
				
		for (String string : nameIsList) {
			char c = string.charAt(0);  //why letter c?
			if (callThisResults.get(c) == null) {
				callThisResults.put(c, 1); 	
				} else {
					callThisResults.put(c, callThisResults.get(c) + 1); 
				}
			}
				
				return callThisResults;
			
		}
	
} //class end
