package collections;
import java.util.*;

public class Consumers implements Runnable{
	
	List<Integer> product_list =null;
	int limit = 5;
	int product_no;
	
	public Consumers(List<Integer> product_list )
	{
		this.product_list = product_list;
		
	}
	
	public void TakeProduct() throws InterruptedException{
		
		synchronized(product_list) {
			while(product_list.isEmpty())
			{
				System.out.println("No products to take.");
				product_list.wait();
			}
			System.out.println("Taken Product: "+product_list.remove(0));
			product_list.notifyAll();
		}
		Thread.sleep(500);
		

}

	@Override
	public void run() {
		while(true)
		{
			try
			{
				TakeProduct();
				product_no++;
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	
	}
}