package nl.kolvoort.ds;

public class MyContainerIterator<AnyType> {
	private int current = 0;
	private MyContainer<AnyType> container;
	
	public MyContainerIterator( MyContainer<AnyType> c) {
		container = c;
	}
	
	public boolean hasNext(){
		return current < container.size;
	}
	
	public Object next(){
		return container.items.get(current++);
	}
}
