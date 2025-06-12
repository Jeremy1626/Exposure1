package sieve;


// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.





import java.util.Scanner;


public class Lab11avst {
    public static void main(String[] args) {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        final int MAX = 100;
        boolean primes[];
        primes = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[]) {
        System.out.println("\nCOMPUTING PRIME NUMBERS");
        for (int i = 2; i < primes.length; i++) {
            primes[i] = true;
        }


        for (int i = 2; i < primes.length; i++) {
            if (primes[i]){
                for (int t = i + i; t < primes.length; t = t+i) {
                    primes[t] = false;

                }

            }

        }
    }

    //Student edits start here- 80 point version


    public static void displayPrimes(boolean primes[]) {
        System.out.println("\n\nPRIMES BETWEEN 1 AND " + primes.length);
        //output of all values of the list
        for (int i = 2; i < primes.length; i++)
            if (primes[i]) {
                System.out.print(i + " ");
            }

        System.out.println();


    }

}