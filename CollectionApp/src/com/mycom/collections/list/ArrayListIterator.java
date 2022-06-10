package com.mycom.collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		ArrayList<String> langList = new ArrayList<String>();
		langList.add("Java");
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(52); //52 will be converted as integer object - autoboxing
		//numList.add(new Integer(53)); 
		
		numList.add(69); 
		System.out.println(numList);
		
		//add() method without index parameter
		
		langList.add("Java"); //valid and adds to the array list object
		langList.add("C");
		langList.add("Python");
		
		System.out.println(langList);
		
		Iterator<String> itr = langList.iterator(); //returns iterable objects
		System.out.println("Language list using iterator()");
		while(itr.hasNext()) { //is next object available ? true / false
			System.out.println(itr.next()); //if object available in the iterator - get it
		} //end of while loop

		System.out.println(itr.hasNext()); // returns false
		
		System.out.println("Array list navigation through for...each loop");
		
		for(String lang : langList) {
			System.out.println(lang);
		}
	}

}
