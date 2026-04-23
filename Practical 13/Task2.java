class Sample{
	public static void main(String[] args){
		String one=args[0];
		char c=one.charAt(0);
		String two=args[1];
		char[] arr=two.toCharArray();

		int count=0;

		for(char s:arr){
			
			if(c==s){
				count++;
				
			}
		}
		System.out.print(count);
        	


	}



}