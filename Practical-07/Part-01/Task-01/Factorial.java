public class Factorial {
    static int iterative(int n){
        if(n<0) return -1;
        int result=1;
        for(int i=1;i<=n;i++){
            result*=i;
        }
        return result;
    }
    static int recursive(int n){
        if(n<0) return -1;
        if(n==0) return 1;
        return n*recursive(n-1);
    }

    public static void main(String[] args) {
        System.out.println(iterative(-12));
        System.out.println(iterative(0));
        System.out.println(iterative(1));
        System.out.println(iterative(5));
        System.out.println(recursive(-12));
        System.out.println(recursive(0));
        System.out.println(recursive(1));
        System.out.println(recursive(5));

    }
}
