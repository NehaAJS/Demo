package com.greatlearning.corecollection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListConcept {
	
	public static void main(String[] args) {
		List<String> ll= new LinkedList<String>();
		
		ll.add("IT");
		ll.add("COMP");
		ll.add("MECHANICAL");
		ll.add("PETROLIUM");
		ll.add("IT");
		
		//System.out.println(ll);
		
		/*
		 * Iterator<String> itrIterator=ll.iterator();
		 * 
		 * while(itrIterator.hasNext()) { System.out.println(itrIterator.next()); }
		 */
		
		/*
		 * for(String branchName: ll) { System.out.println(branchName); }
		 */
		
		//ll.forEach(System.out::println);
		
		ll.forEach(bn->System.out.println(bn));
	}

}
