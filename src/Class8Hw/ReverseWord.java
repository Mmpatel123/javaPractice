package Class8Hw;

public class ReverseWord {
    public static void main(String[] args) {
        String x="  dev";
        String rev="";
        int len=x.length();
        for(int i=len-1;i>=0;--i){
rev=rev+x.charAt(i);
        }
        System.out.println(rev);
    }
}
