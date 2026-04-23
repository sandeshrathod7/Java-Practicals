class Sample{
	public static void main(String[] args){
		String one=args[0];
		String two=args[1];

		String s1=two.replace(one,"");
		System.out.print(two.length()-s1.length());
        	


	}



}