package Class9HwPT1;

public class Superkeywoard {

   String bird= "A bird sleeps...";
    String duck="duck can swim...";
String penquin="penguins are endangered species...";
String dog="Dog can run.....";
String cat="Cat sound is meow....";
String cow="Cow gives us milk";



   }


class superkey extends Superkeywoard
{

    void printNumber() {

        System.out.println(super.bird);
        System.out.println(super.duck);
        System.out.println(super.penquin);
        System.out.println(super.cat);
        System.out.println(super.cow);
        System.out.println(super.dog);

    }

    public static void main(String[] args) {

        superkey sc=new superkey();
       sc.printNumber();

    }}