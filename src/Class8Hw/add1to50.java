package Class8Hw;

public class add1to50 {
    public static void main(String[] args) {
add(3,7);

    }
    public static void add(int start,int end){

        int result=0;
        for (int p=start;p<=end;p++){
            result=result+p ;
        }
        System.out.println("sum of "+start+" to "+end+" is "+result);
    }
}
