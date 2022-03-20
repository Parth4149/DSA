import java.util.Scanner;
// checking P anagram
// if all the alphabets(26) are present in Input String then it will print "yes"
class checking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input str :");
        String s=sc.nextLine();
        if(isPanagram(s)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    static boolean isPanagram(String str){
        if(str.length() < 26){
            return false;
        }
        boolean[] visited =new boolean[26];
        for(int i=0; i<str.length(); i++){
            char x=str.charAt(i);
            if(x>='a' && x<='z'){
                visited[x-'a']=true;
            }
            if(x>='A' && x<='Z'){
                visited[x-'A']=true;
            }
        }
        for(int i=0; i<26; i++){
            if(!visited[i]){
                return false;
            }
        }
        return true;
    }
}