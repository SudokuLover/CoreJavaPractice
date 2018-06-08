//implmentation of Threading via association
//implements Runnable interface whose run method is called by thread
class Thread1 implements Runnable{
	
	int x=10;
	public void run(){
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}

}


class RunThread{
	
	public static void main(String args[]){
		
		Thread1 t1= new Thread1();
		//pass our refrence to thread class so that jvm can call our run method instead its default method for thread class
		Thread tt1= new Thread(t1,"Thread1");

		tt1.start();
		
		Thread tt2= new Thread(t1,"Thread2");
		tt2.start();		
	}
	
}