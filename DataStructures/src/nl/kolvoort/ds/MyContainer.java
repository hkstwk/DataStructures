package nl.kolvoort.ds;

import java.util.ArrayList;

public class MyContainer<AnyType> {
	ArrayList<AnyType> items;
	int size; 
	
	public MyContainer(){
		items = new ArrayList<AnyType>();
	}
	
	public MyContainerIterator<AnyType> iterator(){
		return new MyContainerIterator<AnyType>(this);
	}
	
	public void add(AnyType o){
		items.add(o);
		size++;
	}
}
