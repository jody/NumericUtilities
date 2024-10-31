/* Utilities.java */
/**
 * Template for class that implements numeric utility functions.
 * Initial functions address numeric sequences.
 *
 * @author Copyright &copy; 2024 Dr. Jody Paul (GPLv3)
 * @version 1.1.6
 */
public final class Utilities {
    /**
     * Hide constructor because this is a utility class.
     */
    private Utilities() { }

    /**
     * Determines the number of unique connections between
     * fully-connected members of a group of the specified
     * size.
     * The sequence starts with numberOfConnections(0)==0
     * numberOfConnections(1)==0, numberOfConnections(2)==1.
     *
     * @param  numPeople the number of people in the group
     *                   (valid for numPeople >= 0)
     * @return the number of connections
     */
    public static long numberOfConnections(int numPeople) {
        if (numPeople == 0) return 0;
        else return numberOfConnections(numPeople - 1) + (numPeople - 1);
    }

    /**
     * Determines the number in the Fibonacci sequence
     * corresponding to the index given as the parameter.
     * The sequence starts with fibonacci(0)==0 and
     * fibonacci(1)==1.
     *
     * @param  index the index of the desired value
     *               (valid for index >= 0)
     * @return the number in the Fibonacci sequence at the specific index
     */
    public static long fibonacci(int index) {
        return index;
    }

    /**
     * Determine the number in a Tribonacci sequence
     * corresponding to the index given as the parameter.
     * The sequence is defined as follows:
     * tribonacci(0)==0,
     * tribonacci(1)==0,
     * tribonacci(2)==1,
     * tribonacci(n)==tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3).
     *
     * @param  index the index of the desired value
     *               (valid for index >= 0)
     * @return the number in the Tribonacci sequence at the specific index
     */
    public static long tribonacci(int index) {
        return index;
    }

    /**
     * Determine the number in a Fibonacci primes sequence
     * corresponding to the index given as the parameter.
     * A Fibonacci prime number is a Fibonacci number that is also prime.
     * The first few Fibonacci primes are the following.
     * fibonacciPrimes(0)==2,
     * fibonacciPrimes(1)==3,
     * fibonacciPrimes(2)==5, and
     * fibonacciPrimes(3)==13.
     *
     * @param  index the index of the desired value
     *               (valid for index >= 0)
     * @return the number in the Fibonacci primes sequence at the specific index
     */
    public static long fibonacciPrimes(int index) {
        return index;
    }
}
