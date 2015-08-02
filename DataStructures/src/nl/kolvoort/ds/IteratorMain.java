package nl.kolvoort.ds;

public class IteratorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyContainer<String> v1 = new MyContainer<String>();
		MyContainer<Integer> v2  = new MyContainer<Integer>();
		
		v1.add("4");
		v1.add("3");
		v1.add("2");
		v1.add("Hello world");
		
		v2.add(4);
		v2.add(3);
		v2.add(2);
		v2.add(1);
		v2.add(0);
		
		System.out.println("Container v1 contains:  ");
		MyContainerIterator<String> itr = v1.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next().toString());
		}
		System.out.println("End of container v1\n");
		
		System.out.println("Container v2 contains:  ");
		MyContainerIterator<Integer> itr2 = v2.iterator();
		while (itr2.hasNext()){
			System.out.println(itr2.next().toString());
		}
		System.out.println("End of container v2\n");
		
		

	}

}
