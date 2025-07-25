import java.util.*;

class Solution {
    static final int MAX = 1000000;
    static List<Integer> primes = new ArrayList<>();

    // Generate all primes up to MAX using Sieve of Eratosthenes
    static void generatePrimes() {
        boolean[] isPrime = new boolean[MAX + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= MAX; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
    }

    // Function to process all queries
    static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q) {
        ArrayList<Integer> result = new ArrayList<>();
        generatePrimes(); // generate primes once

        for (int i = 0; i < q; i++) {
            long n = query.get(i);
            int count = 0;

            // Count primes whose square is <= n
            for (int p : primes) {
                if ((long) p * p <= n) {
                    count++;
                } else {
                    break;
                }
            }

            result.add(count);
        }

        return result;
    }

    // Optional main method for testing
    public static void main(String[] args) {
        ArrayList<Long> query = new ArrayList<>();
        query.add(6L);
        query.add(10L);
        int q = query.size();

        ArrayList<Integer> ans = threeDivisors(query, q);
        for (int res : ans) {
            System.out.println(res);
        }
    }
}
