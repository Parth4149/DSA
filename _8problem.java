import java.util.Scanner;
// print all numbers after point (.)
public class _8problem {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("input :");
            String str=sc.nextLine();
            System.out.println(findAfterPoint(str));
        }
    }

    static String findAfterPoint(String s){
        int pos=s.indexOf('.');// or "."
        if(pos<0)
            return "";
        else
            return s.substring(pos+1);
    }
}
