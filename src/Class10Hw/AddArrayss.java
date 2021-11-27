package Class10Hw;

public class AddArrayss {
    public static void main(String[] args) {
        int[] newp={0,1,1,1};
        int sum=0;
        int addxyz=newp.length;
        for(int i=0;i<addxyz;i++){
            sum=sum+newp[i];
        }

        System.out.println(sum);

    }
}
