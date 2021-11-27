package Class9HwPT1;


    class bank{
        double GetInterestRate(){return 0;}
    }

    class SBI extends bank{
        double GetInterestRate(){return 7;}
    }

    class BOB extends bank{
        double GetInterestRate(){return 7.1;}
    }

    class DENABANK extends bank{
        double  GetInterestRate(){return 6.9;}
    }
class test2{

    public static void main(String[] args) {

        SBI S=new SBI();
        BOB B=new BOB();
        DENABANK D=new DENABANK();
        System.out.println("SBI Rate of Interest: "+S.GetInterestRate());
        System.out.println("BOB Rate of Interest: "+B.GetInterestRate());
        System.out.println("DENABANK Rate of Interest: "+D.GetInterestRate());

    }
}


