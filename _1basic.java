class basic1 {
    public static void main(String[] args) {
        String str="prajapati";
        int index=2;
        str = str.substring(0, index) + 'A'+ str.substring(index + 1);
        System.out.println(str.charAt(2));// o/p : a
        System.out.println(str.substring(3));// o/p : japati
        System.out.println(str.substring(3,7));// o/p : japa
        //str.substring(beginIndex)
        //str.substring(beginIndex, endIndex)
        System.out.println();

        String s2="praj";// if str contain "praj" word then it returns true
        System.out.println(str.contains(s2));// o/p : true
        String s3="prja";
        System.out.println(str.contains(s3));// o/p : false
        System.out.println();
        // if s2 is presented in str then it will return positive value // if s2="japati", it will return index of japati (5)
        // if s2 is not presented in str then it will return -1

        System.out.println(str.indexOf(s2));// o/p : 0

        System.out.println(str.indexOf("pati", 3));// it starts from index 3 ans return index of pati (5)
        // str.indexOf(str)
        // str.indexOf(str, fromIndex)
    }
}
