class Sample{

	static void m1(char ...a){
		System.out.print("char");
	}
	static void m1(int ...a){
		System.out.print("int");
	}
	public static void main(String[] args){
	       
   	
		m1(1,'c');

	}



}