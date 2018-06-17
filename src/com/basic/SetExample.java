package com.basic;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
	public static void main(String args[]) {
Set<String> set = new HashSet<String>();

set.add("one");
set.add("two");
set.add("one");
System.out.println(set);

List<String> list=new ArrayList<String>();

		list.add("one");
		list.add("two");
		list.add("three"); 
		list.add("one");
	Set<String> setOne = new HashSet<String>(list);
		
		System.out.println(setOne);
LinkedHashSet<String> linkedset = new LinkedHashSet<String>();
	linkedset.add("One");
	for(int i=0;i<10;i++) {
		linkedset.add("two "+i);
	}
	System.out.println(linkedset);
	}

}