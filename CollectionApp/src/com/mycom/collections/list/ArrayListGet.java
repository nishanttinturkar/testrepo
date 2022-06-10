package com.mycom.collections.list;

import java.util.ArrayList;

public class ArrayListGet {
	public static void main(String[] args) {
		ArrayList<String> langList = new ArrayList<String>(); //<String generic collections
		
		// add() method without the index parameter
		langList.add("Java"); //index 0
		langList.add("C"); // index 1
		langList.add("Python"); // index 2
		langList.add("C#"); // index 3
		
		//size() - returns the no of objects in the list
		System.out.println("Size of List : " + langList.size());
		
		for(int index = 0; index < langList.size(); index++) {
			//get() returns the object at given index of the list
			System.out.println(langList.get(index));
		}
	}
}
