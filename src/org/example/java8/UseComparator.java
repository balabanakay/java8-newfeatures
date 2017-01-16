package org.example.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class UseComparator {
	
	public static void main(String args[]){
		 
		List<String> strings = new ArrayList<String>();
		strings.add("AAA");
		strings.add("bbb");
		strings.add("CCC");
		strings.add("ddd");
		strings.add("EEE");
 
		//Simple case-sensitive sort operation
		Collections.sort(strings);
		System.out.println("Simple sort");
/*		for(String str: strings){
			System.out.println(str);
		}*/
		
		strings.forEach(string -> System.out.println(string));
		
		//Case-insensitive sort with an anonymous class
		/*
		Collections.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				return str1.compareToIgnoreCase(str2);
			}
		});
		*/
		
		Comparator<String> comp = (str1, str2) ->{
			return str1.compareToIgnoreCase(str2);
		};
		
		Collections.sort( strings , comp);
		System.out.println("Sort with comparator");
		
		
/*		Iterator<String> i = strings.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
*/	
		strings.forEach(string -> System.out.println(string));
		
		System.out.println("Geleleim : " + comp.compare("C", "A"));
		
	}
	
}
