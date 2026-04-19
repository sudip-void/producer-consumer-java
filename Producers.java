package collections;
import java.util.*;

public class Producers implements Runnable{
	
	List<Integer> product_list =null;
	int limit = 5;
	int product_no;
	
	public Producers(List<Integer> product_list )
	{
		this.product_list = product_list;
		
	}
	
	public void SeeProduct(int product_no) throws InterruptedException{
		
		synchronized(product_list) {
			while(product_list.size() == limit)
			{
				System.out.println("Demand Overload !");
				product_list.wait();
			}
			System.out.println("New Product: "+ product_no);
			product_list.add(product_no);
			product_list.notifyAll();
		}
		Thread.sleep(100);
	

	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try
			{
				SeeProduct(product_no);
				product_no++;
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	
	

	}}
