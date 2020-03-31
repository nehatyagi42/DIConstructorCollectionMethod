package com.rtpl.common;

import java.util.Iterator;
import java.util.List;

public class Question {
private int id;
public String Name;

private List<String>answer;
	
	public Question() {	}
	public Question(int id, String Name, List<String>answer) {
		super();
		this.id=id;
		this.Name=Name;
		this.answer=answer;
		
	}
	public void displayinfo() {
		System.out.println(">>>>>>>>>>displayed info>>>>>>>>>>>" +id  +   "  "+   Name);
		System.out.println("answers are:");  
		Iterator<String> iterator=answer.iterator();
		while(iterator.hasNext()){  
	        System.out.println(iterator.next());  
	    }  
	}
}
