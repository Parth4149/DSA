class _5StringBuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("abcd");

        str.reverse();
        System.out.println(str);// dcba

        str.setCharAt(2,'p');
        System.out.println(str);// dcpa

        str.delete(0, 2);
        System.out.println(str);// pa

        str.insert(2, "Parth");
        System.out.println(str);// paParth

        str.replace(0, 2, "Prajapati");
        System.out.println(str);// PrajapatiParth
    }
}
