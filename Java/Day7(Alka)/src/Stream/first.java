package Stream;

import java.util.stream.Stream;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer>intStream=Stream.of(23,43,56,78,89,20);
		//intStream.filter(n->n>30);
		//intStream.filter(n->n>=50).forEach(n->System.out.println(n));
		intStream.map(n->n*2).forEach(n->System.out.println(n));

		

	}

}
