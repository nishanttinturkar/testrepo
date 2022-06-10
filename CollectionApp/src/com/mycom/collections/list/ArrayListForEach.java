package com.mycom.collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListForEach {

	public static void main(String[] args) {
		ArrayList<String> langList = new ArrayList<String>();

		// add() method without index parameter

		langList.add("Java");
		langList.add("C#");
		langList.add("Java");
		langList.add("C");
		langList.add("Python");

		for (String language : langList) {
			System.out.println(language);
		}
		
		System.out.println("Language Collection after sorting");
		Collections.sort(langList);
		
		for (String language : langList) {
			System.out.println(language);
		}
		
		ArrayList<String> langListRemove = new ArrayList<String>();
		langListRemove.add("Java");
		langListRemove.add("C#");

		langList.removeAll(langListRemove);

		System.out.println("Language list after deleting objext of index 0");
		for (String language : langList) {
			System.out.println(language);
		}

	}

}
