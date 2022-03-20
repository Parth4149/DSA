import java.lang.StringBuilder;
public class _4StringBuilder {
    public static void main(String[] args) {
        String s1="Parth";
        String s2=s1;
        s1=s1+"Prajapati";
        if(s1==s2)
            System.out.println("same");
        else
            System.out.println("not same");//

        StringBuilder str1=new StringBuilder("Parth");
        StringBuilder str2=str1;
        str1.append("Prajapati");
        if(str1==str2)
            System.out.println("same");//
        else
            System.out.println("not same");
    }
}
