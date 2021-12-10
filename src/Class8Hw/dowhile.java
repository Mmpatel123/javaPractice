package Class8Hw;

public class dowhile {
    //do while loop
    public static void main(String[] args) {
    int variable = 3;
        do {System.out.println(variable);
       variable++;

    }while (variable<=10);
}}
class leapyear extends dowhile {
    public static void main(String[] args) {
        int year = 2020;
        if(year%4==0){
            System.out.println("2020 is leap year");
        }
        else {
            System.out.println("2020 is not leap year");
    }
}}