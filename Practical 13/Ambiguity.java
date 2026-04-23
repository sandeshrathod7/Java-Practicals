class Ambiguity {
    static void m1(String s) {
        System.out.println("String");
    }

    static void m1(Integer i) {
        System.out.println("Integer");
    }

    public static void main(String[] args) {
        m1(null); // ambiguous
    }
}