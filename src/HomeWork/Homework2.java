package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Homework2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> List1 = new ArrayList<>();
		List1.add(1);
		List1.add(2);
		List1.add(3);
		List1.add(4);
		List1.add(5);
		System.out.println("List1: " + List1);
		
		ArrayList<Integer> List2 = new ArrayList<>();
		List2.add(11);
		List2.add(22);
		List2.add(33);
		List2.add(44);
		List2.add(55);		
		System.out.println("List2: " + List2);
		
		ArrayList<String> List3 = new ArrayList<>();
		List3.add("Orange");
		List3.add("Purple");
		List3.add("Teal");
		List3.add("Fuscia");
		List3.add("Gold");
		List3.add("Blue");
		List3.add("Magenta");
		System.out.println("List3: " + List3);
		
		ArrayList<String> alphabet = new ArrayList<>(Arrays.asList("a","b","c","d","e","f","g"));
		System.out.println("List4: " + alphabet);
		
		ArrayList<String> List5 = new ArrayList<>();
		System.out.println("List5: " + List5);
		
		ArrayList<String> List6 = new ArrayList<>();
		List6.add("A");
		List6.add("B");
		List6.add("C");
		List6.add("D");		
		System.out.println("List6: " + List6);
			
		System.out.println("************************");
		System.out.println("");
//		Write a Java program to copy one array list into another		
		ArrayList List7 = (ArrayList)List1.clone();
		System.out.println("List 3 is a clone of List 1: " + List7);
		
//		Write a Java program to extract a portion of an array list
		List<String> extract = List3.subList(0, 4);
		System.out.println("Extracted Colors: " + extract);
		
//		Write a Java program of swap two elements in an array list
		Collections.swap(alphabet, 0, 6);
		System.out.println("Swapped elements: " + alphabet);
		
//		Write a Java program to test an array list is empty or not
		boolean list = List5.isEmpty();		
		if(list == true)
			System.out.println("Is Empty?: " + "Empty as wha what");
		else
			System.out.println("Is Empty?: " + "Full of a that ooohweee");
		
//		Write a Java program to replace the second element of an ArrayList with the specified element.
		List6.set(2, "E");
		System.out.println("Replace Element: " + List6 + " is my favorite character from the Community");
		
//		Write a Java program to trim the capacity of an array list the current list size
//		I don't really understand this one, but I think I did it correctly...
		List3.trimToSize();
		System.out.println("Trimmed List: " + List3);
		
		
	}

	
	
	
}
