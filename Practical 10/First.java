class Vehicle{
	
	Vehicle(){
		System.out.println("Vehicle start.....");
	
	}
	
	void show(){
		System.out.println("from Vehicle parent");
		
	}
}

class Car extends Vehicle{
	
	
  	Car(){
		System.out.println("Car start.");
	}

 	public static void main(String[] args){
		Car bmw=new Car();
		bmw.show();
		
	}

}