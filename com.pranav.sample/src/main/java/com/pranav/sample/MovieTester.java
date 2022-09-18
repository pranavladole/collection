package com.pranav.sample;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.pranav.sample.entity.Movie;

public class MovieTester {
	
public static void main(String args[]) {
	System.out.println("Array List");
	
//	ArrayList<String> name = new ArrayList<>();
//	name.add("pranav");
//	name.add("pranav1");
//	name.add(1,"pranav 1 index");
//	System.out.println(name);
	
//	ArrayList<String> name = new ArrayList<>();
//	name.add("pranav");
//	name.add("pranav1");
//	System.out.println(name);
//	name.remove(1);
//	System.out.println(name);
	
	System.out.println("set/ update");
	ArrayList<Integer> num = new ArrayList<>();
	num.add(1);
	num.add(2);
	num.add(3);
	
for(int i=0;i<num.size();i++) {
	System.out.println("simple for "+num.get(i));
}

for(Integer ele: num) {
	System.out.println("for each " +ele);
}
	
	Iterator<Integer> it = num.iterator();
	if(it.hasNext()) {
		System.out.println("iterator"+it.next());
	}
	

}

}
