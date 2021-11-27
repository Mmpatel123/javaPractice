package Class9HwPT1;

public class employeeinfo {
    int empid;
    String empname;
    String comp;
    int sal;
    public employeeinfo(int id,String name,String company,int salary){
        empid=id;
        empname = name;
        comp=company;
        sal=salary;
    }

    public static void main(String[] args) {
employeeinfo e1=new employeeinfo(22567,"megha","boots",22000);
        System.out.println("Employee id: " + e1.empid);
        System.out.println("Employee Name: " + e1.empname);
        System.out.println("Company name: "+ e1.comp);
        System.out.println("Employer salary: "+e1.sal);
}}

