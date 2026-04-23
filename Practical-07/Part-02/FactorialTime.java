class FactorialTime {

    static long iterative(int n){
        if(n<0) return -1;
        long result=1;
        for(int i=1;i<=n;i++){
            result*=i;
        }
        return result;
    }
    static long recursive(int n){
        if(n<0) return -1;
        if(n==0) return 1;
        return n*recursive(n-1);
    }

    public static void main(String[] args) {
        int[] arr={-12,0,1,5,10,15,20};;
        long iterative_tt=0,recursive_tt=0,st,end;
        float iterative_avg,recursive_avg;
        int noofTimes = 1000000;

	for(int num:arr){
            for(int i = 0; i < noofTimes; i++) {
                st = System.currentTimeMillis();
                recursive(num);
                end = System.currentTimeMillis();
                recursive_tt += end - st;
            }

        }
        recursive_avg = (float) recursive_tt / (arr.length * noofTimes);


        for(int num:arr){
            for(int i = 0; i < noofTimes; i++) {
                    st = System.currentTimeMillis();
                    iterative(num);
                    end = System.currentTimeMillis();
                    iterative_tt += end - st;
                }
        }
        iterative_avg = (float) iterative_tt / (arr.length * noofTimes);


        

        System.out.println("iterative:"+iterative_avg);
        System.out.println("recursive:"+recursive_avg);


    }
}
