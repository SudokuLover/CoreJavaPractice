//make object of an interface via association 
interface Test{

void show();

}

class User
{

public static void main(String args[]){

/*	Test test=	new Test(){
	 public void show(){
		System.out.println("hello world");
	 
	 }
	
	};

	test.show();

	*/
	
new Test(){
	 public void show(){
		System.out.println("hello world");
	 
	 }
	
	}.show();

	
	
}

}