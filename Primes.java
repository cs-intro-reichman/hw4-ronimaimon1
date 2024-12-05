public class Primes {
    public static void main(String[] args) {
         // Parse the upper limit 'n' from the command line argument
         int n = Integer.parseInt(args[0]);

         // Create a boolean array where primeArr[i] will be true if i is prime
         boolean[] primeArr = new boolean[n + 1];
 
         // Initialize the array: assume all numbers are prime
         for (int i = 2; i <= n; i++) {
             primeArr[i] = true;
         }
 
         // Sieve of Eratosthenes algorithm
         for (int p = 2; p * p <= n; p++) {
             if (primeArr[p]) {
                 // Mark all multiples of p as non-prime, starting from p^2
                 for (int k = p * p; k <= n; k += p) {
                     primeArr[k] = false;
                 }
             }
         }
         
         // Print the primes
        System.out.println("Prime numbers up to " + n + ":");
        
         // Count and print all primes, and calculate the percentage of primes
         int sum = 0;
         for (int l = 2; l <= n; l++) {
             if (primeArr[l]) {
                 sum++;
                 System.out.println(l); // Print the prime number
             }
         }
 
         // Calculate and display the percentage of prime numbers as an integer
         int percentage = (sum * 100) / n;  // Perform integer division
         System.out.println("There are " + sum + " primes between 2 and " + n + " (" + percentage + "% are primes)");
     }
}