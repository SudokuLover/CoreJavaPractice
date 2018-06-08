//Threading via Association
//implements Runnable interface whose run method is called by thread
class Thread3 implements Runnable{
	
	int x;
	public void run(){
		for(int i=0;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+ x);
		
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
					System.out.println(e);
			}
		}	
	}

}


class RunThread3{
	
	public static void main(String args[]){
		
		//passing refrence of our class to thread class so that
		//jvm can call our run method instead its default method for thread class
		Thread3 t1= new Thread3();
		t1.x=50;
		Thread tt1= new Thread(t1,"Thread1");

		tt1.start();
		
		Thread3 t2= new Thread3();
		t2.x=100;
		
		Thread tt2= new Thread(t2,"Thread2");
		tt2.start();	


		Thread3 t3= new Thread3();
		t3.x=150;
		
		Thread tt3= new Thread(t3,"Thread3");
		tt3.start();
		
		//need to do same work for multiple threads ,
		//then make a single class then make multiple objects of it
			
		for(int i=0;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
					System.out.println(e);
			}
		}
	}
	
}