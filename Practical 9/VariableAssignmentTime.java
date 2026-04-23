

 class VariableAssignmentTime {


	static void stringBuilder(){
         	StringBuilder msg=new StringBuilder("utsav");
         	for(int i=1;i<=2026;i++){
            		msg.append("_").append(i);
         	}
     	}

	static void stringBuffer(){
         	StringBuffer msg=new StringBuffer("utsav");
         	for(int i=1;i<=2026;i++){
             		msg.append("_").append(i);
         	}
     	}

     
	static void string(){
         	String msg="utsav";
         	for(int i=1;i<=2026;i++){
             		msg=msg+"_"+i;
         	}
     	}

    

    

     public static void main(String[] args) {
       
         long string_tt=0,stringBuffer_tt=0,stringBuilder_tt=0,st,end;

         
             st=System.nanoTime();
             string();
             end=System.nanoTime();
             string_tt+=end-st;


        
             st=System.nanoTime();
             stringBuffer();
             end=System.nanoTime();
             stringBuffer_tt+=end-st;
        

         
             st=System.nanoTime();
             stringBuilder();
             end=System.nanoTime();
             stringBuilder_tt+=end-st;
        

         System.out.println("string:"+string_tt);
         System.out.println("stringBuffer:"+stringBuffer_tt);
         System.out.println("stringBuilder:"+stringBuilder_tt);


     }

}
