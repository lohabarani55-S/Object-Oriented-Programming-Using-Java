import java.util.Scanner;

interface Calculator
{
    int add(int a, int b);
    int sub(int a, int b);
    int mul(int a, int b);
    int div(int a, int b);
}

class Operation implements Calculator
{
    public int add(int a, int b)
    {
        return a + b;
    }

    public int sub(int a, int b)
    {
        return a - b;
    }

    public int mul(int a, int b)
    {
        return a * b;
    }

    public int div(int a, int b)
    {
        return a / b;
    }
}

class Ex5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Operation obj = new Operation();

        int choice;

        do
        {
            System.out.print("Enter first number: ");
            int n1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int n2 = sc.nextInt();

            System.out.println("\n----- Calculator Menu -----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Addition = " + obj.add(n1, n2));
                    break;

                case 2:
                    System.out.println("Subtraction = " + obj.sub(n1, n2));
                    break;

                case 3:
                    System.out.println("Multiplication = " + obj.mul(n1, n2));
                    break;

                case 4:
                    if(n2 != 0)
                    {
                        System.out.println("Division = " + obj.div(n1, n2));
                    }
                    else
                    {
                        System.out.println("Cannot divide by zero");
                    }
                    break;
case 5:
                    System.out.println("Exiting Calculator...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

            System.out.println();

        } while(choice != 5);

        sc.close();
    }
}
