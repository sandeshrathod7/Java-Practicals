class Sample {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Please provide two arguments.");
            return;
        }

        String one = args[0];
        char c = one.charAt(0);
        String two = args[1];
        int count = 0;

        for (int i = 0; i < two.length(); i++) {
            if (c == two.charAt(i)) {
                count++;
            }
        }

        System.out.print(count);
    }
}