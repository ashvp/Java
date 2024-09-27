package Lab7;

import java.util.*;

public class ex3 {
    int divide(int a) {
        return a / 0;
    }

    int divide(int a, int b) {
        if (b > 0)
            return a / b;
        else
            throw new IllegalArgumentException("Cannot Divide by 0.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ex3 obj = new ex3();
        int choice;
        int num1;
        int num2;
        boolean loopController = true;
        while (loopController) {
            System.out.println("Hello!");
            System.out.println("1. To Show Arithmetic Exception.");
            System.out.println("2. To Show ArrayIndexOutOfBounds Exception");
            System.out.println("3. IllegalArgument Exception");
            System.out.println("4. Exit");
            try {
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Dividing Any Number with 0");
                        System.out.print("Enter the number : ");
                        num1 = input.nextInt();
                        System.out.println(obj.divide(num1));
                        break;
                    case 2:
                        int arr[] = { 1, 2, 3, 4, 5 };
                        System.out.println("The Length of the Array : " + arr.length);
                        System.out.println("Now I will add 1 to that to Throw the Exception.");
                        System.out.println(arr[arr.length + 1]);
                        break;
                    case 3:
                        System.out.print("Enter the number : ");
                        num1 = input.nextInt();
                        System.out.print("Enter the number : ");
                        num2 = input.nextInt();
                        System.out.println("Result of division : " + obj.divide(num1, num2));
                        System.out.println("Dividing some number with 0 now..");
                        System.out.println(obj.divide(num1, 0));
                        break;
                    case 4:
                        loopController = false;
                        break;
                    default:
                        System.out.println("Invalid Input..");
                        break;
                }
            } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                System.out.println("Exception Raised : " + arrayIndexOutOfBoundsException);
            } catch (ArithmeticException arithmeticException) {
                System.out.println("Exception Raised : " + arithmeticException);
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("Exception Raised : " + illegalArgumentException);
            } catch (Exception e) {
                System.out.println("Exception Raised : " + e);
            }
        }
    }
}
