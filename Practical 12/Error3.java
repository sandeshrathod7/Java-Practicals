import java.io.FileReader;
import java.io.FileNotFoundException;

class PracticeError{

	public static void main(String[] args) {
		
		try{
		FileReader f=new FileReader("Error3.java");
		}catch(FileNotFoundException e){
			System.out.println(e);
		}

		try{
		int[] arr={1,2,3,4};
		int num=arr[6];
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}

		try{
		int a=5;
		int b=0;
		int ans=a/b;
		}catch(ArithmeticException e){
			System.out.println(e);
		}
	
	}


}