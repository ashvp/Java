//package Java.Lab3;

public class employee {
    private String employeeName;
    private int employeeID;
    private String employeeAddress;
    private String employeeMailID;
    private long employeeNumber;
    private double basicPay;

    public employee(String employeeName, int employeeID, String employeeAddress, String employeeMailID,
            long employeeNumber, double basicPay) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.employeeAddress = employeeAddress;
        this.employeeMailID = employeeMailID;
        this.employeeNumber = employeeNumber;
        this.basicPay = basicPay;
    }

    private double DA() {
        return 0.97 * basicPay;
    }

    private double HRA() {
        return 0.1 * basicPay;
    }

    private double PF() {
        return 0.12 * basicPay;
    }

    private double staffClubFund() {
        return 0.001 * basicPay;
    }

    private double grossSalary() {
        return basicPay + DA() + HRA();
    }

    private double netSalary() {
        return basicPay + DA() + HRA() - PF() - staffClubFund();
    }

    public void displayPaySlip() {
        System.out.println("Name of the Employee : " + employeeName);
        System.out.println("Basic Pay : " + basicPay);
        System.out.println("Daily Allowance : " + DA());
        System.out.println("House Rent Allowance : " + HRA());
        System.out.println("Provident Fund : " + PF());
        System.out.println("Staff Club Fund : " + staffClubFund());
        System.out.println("Gross Salary : " + grossSalary());
        System.out.println("Net Salary : " + netSalary());
        System.out.println("------------------------------------------------");
    }

}
