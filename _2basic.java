class basic2 {
    public static void main(String[] args) {
        String s1="parth";
        String s2="rth";

        int res= s1.compareTo(s2);// s1.compareTo(anotherString)
        if(res==0)
            System.out.println("same");
        if(res>0)
            System.out.println("s1 greater");
        if(res<0)
            System.out.println("s1 smaller");
    }
}
