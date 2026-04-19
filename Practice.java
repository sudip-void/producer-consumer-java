package collections;
import java.util.*;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> product_list =new ArrayList<>();
		
		Thread t1= new Thread(new Producers(product_list));
		
		Thread t2= new Thread(new Consumers(product_list));
		
		t1.start();
		t2.start();
	}

}
