package collections;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionList {

	public static void main(String[] args) {
		
		ArrayList<String> color = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		String nameColor;
		
		System.out.println("Digite o nome de 5 cores");
		System.out.println("------------------------");
		
		for(int i = 0; i <  5; i++ ) {
			nameColor = in.next();
			color.add(nameColor);
		}
	
		System.out.println("------------------------");
		System.out.println("cores ordenadas");
		Collections.sort(color);
		
		System.out.println("\nCor: " + color);
		

	}

}
