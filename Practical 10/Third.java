class GrandFather{

    	GrandFather(){
		System.out.println("I am your GrandFather.");
	}

	void grandFatherinfo(String name){
		System.out.println("grandfather:"+name);
		
	}

}

class Parent extends GrandFather{

	Parent(){
		System.out.println("I am your Parent.");
	}

	void parentinfo(String name){
		System.out.println("parent:"+name);
		
	}

}

class Child extends Parent{

	Child(){
		System.out.println("I am Child.");
	}

	void childinfo(String name){
		System.out.println("child:"+name);
		
	}
	
	public static void main(String[] args){
		Child c1=new Child();
		c1.grandFatherinfo("Boss1");
		c1.parentinfo("Boss2");
		c1.childinfo("Boss3");

	}




}