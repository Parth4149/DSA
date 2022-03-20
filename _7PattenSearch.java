import java.util.Scanner;

// Pattern Searching Problem
class PatternSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text : ");
        String txt=sc.nextLine();
        System.out.print("Input pattern : ");
        String pat=sc.nextLine();
        PattenSearch(txt,pat);
    }
    //  Input txt: abcd upcd opcd
    //  Input pattern : cd
    //  o/p : 2 7 12
    static void PattenSearch(String txt,String pat){
        int pos=txt.indexOf(pat);
        while(pos>=0){
            System.out.print(pos+" ");
            pos=txt.indexOf(pat,pos+1);
        }
    }
}
