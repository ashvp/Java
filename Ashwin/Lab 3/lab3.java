//package Java.Lab3;

import java.util.*;

public class lab3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Employee Name : ");
        String empName = input.next();
        System.out.println("Enter the Employee ID : ");
        int empID = input.nextInt();
        System.out.println("Enter the Employee Address : ");
        String empAddress = input.next();
        System.out.println("Enter the Employee Mobile Number : ");
        long empNum = input.nextLong();
        System.out.println("Enter the Employee Mail ID : ");
        String empMailID = input.next();
        System.out.println("Enter the Serial Number for the Corresponding Designation : ");
        System.out.println("1. Programmer");
        System.out.println("2. Assistant Professor");
        System.out.println("3. Associate Professor");
        System.out.println("4. Professor");
        int serial = input.nextInt();
        System.out.println("Enter the Basic Pay : ");
        double basicPay = input.nextDouble();
        System.out.println("The Payroll :");
        switch (serial) {
            case 1:
                programmer obj1 = new programmer(empName, empID, empAddress, empMailID, empNum, basicPay);
                obj1.displayPaySlip();
                break;

            case 2:
                assistantProfessor obj2 = new assistantProfessor(empName, empID, empAddress, empMailID, empNum,
                        basicPay);
                obj2.displayPaySlip();
                break;

            case 3:
                associateProfessor obj3 = new associateProfessor(empName, empID, empAddress, empMailID, empNum,
                        basicPay);
                obj3.displayPaySlip();
                break;

            case 4:
                professor obj4 = new professor(empName, empID, empAddress, empMailID, empNum, basicPay);
                obj4.displayPaySlip();
                break;

            default:
                System.out.println("Invalid Input.");
                break;
        }
    }
}
