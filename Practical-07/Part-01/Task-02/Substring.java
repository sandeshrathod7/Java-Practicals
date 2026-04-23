class Substring {

    static int m1(String s1,String s2){
        if(s1.length()<s2.length()) return 0;
        int count =0;
        for(int i=0;i<=s1.length()-s2.length();i++){
           if(s1.substring(i,s2.length()+i).equals(s2)){
               count++;
           }
        }
        return count;
    }
    static int m2(String s1,String s2){
        int count = 0;
        int index = 0;

        while ((index = s1.indexOf(s2, index)) != -1) {
            count++;
            index = index + s2.length(); // skip full pattern
        }

        return count;

    }

    static int m3(String s1, String s2) {
        int count = 0;
        int n = s1.length();
        int m = s2.length();

        for (int i = 0; i <= n - m; i++) {
            boolean match = true;
            for (int j = 0; j < m; j++) {
                if (s1.charAt(i + j) != s2.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) count++;
        }

        return count;
    }


    static void main(String[] args) {
        System.out.println(m1("SGGSIE&TSGGS","SGGS"));
        System.out.println(m2("SGGSIE&TSGGS","SGGS"));
        System.out.println(m3("SGGSIE&TSGGS","SGGS"));
    }


}
