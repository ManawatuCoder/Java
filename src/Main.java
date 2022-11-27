import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Do you want to multiply, add, divide, subtract, or check if a number is prime(primecheck)?");
            Scanner Answer = new Scanner(System.in);
            String answer = Answer.nextLine();
            System.out.println(answer);

            switch(answer) {
                case "multiply":
                    System.out.println("Enter two numbers.");
                    Scanner multiply = new Scanner(System.in);
                    int multiply1 = multiply.nextInt();
                    int multiply2 = multiply.nextInt();
                    System.out.println(multiply1 * multiply2);
                    break;

                case "divide":
                    System.out.println("Enter two numbers.");
                    Scanner divide = new Scanner(System.in);
                    int divide1 = divide.nextInt();
                    int divide2 = divide.nextInt();
                    System.out.println(divide1 / divide2);
                    break;

                case "add":
                    System.out.println("Enter two numbers.");
                    Scanner add = new Scanner(System.in);
                    int add1 = add.nextInt();
                    int add2 = add.nextInt();
                    System.out.println(add1 + add2);
                    break;

                case "subtract":
                    System.out.println("Enter two numbers.");
                    Scanner subtract = new Scanner(System.in);
                    int subtract1 = subtract.nextInt();
                    int subtract2 = subtract.nextInt();
                    System.out.println(subtract1 - subtract2);
                    break;

                case "primecheck":
                    System.out.println("Enter a number.");
                    Scanner prime = new Scanner(System.in);
                    int prime1 = prime.nextInt();
                    boolean isprime = true;
                    for (int i = 2; i < prime1; i++) {
                        int prime2 = prime1 % i;
                        if (prime2 == 0) {
                            isprime = false;
                            break;
                        }
                    }
                    if (isprime && prime1>1) {
                        System.out.println("Your number is prime");
                    }
                    else{
                        System.out.println("Your number is not prime");
                    }
                    break;
                default:
                    System.out.println("Something went wrong, check your input and try again."); //what
                }
        }
    }
}
