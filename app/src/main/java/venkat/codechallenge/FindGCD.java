package venkat.codechallenge;

/**
 * Created by venkateswara_k on 22-02-2018.
 */

// Java program to find GCD of two numbers
class FindGCD

{
    // Recursive function to return gcd of a and b
    static int gcd(int a, int b)
    {
        // Everything divides 0
        if (a == 0 || b == 0)
            return 0;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }

    // Driver method
    public static void main(String[] args)
    {
        //Enter two number whose GCD needs to be calculated.
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Please enter first number to find GCD");
        int a = scanner.nextInt();
        System.out.println("Please enter second number to find GCD");
        int b = scanner.nextInt();

        System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
    }
}

