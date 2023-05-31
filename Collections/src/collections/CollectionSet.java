package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class CollectionSet {

	public static void main(String[] args) {
		Set<Integer> setNumber = new HashSet<Integer>();
		Iterator<Integer> isetNumber = setNumber.iterator();
		Integer number = Integer.valueOf(10);
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Digite 10 números: ");
		System.out.println("-------------------");
		for(int i = 0; i < 10; i++) {
			System.out.println(i+1 + "º: " );
			number = in.nextInt();
			setNumber.add(number);
			
		}
		
		System.out.println("\nLista: " + setNumber);

	}

}
