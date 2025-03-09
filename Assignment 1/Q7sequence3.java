'''Write a java program to print the following sequence:
2, 1, 4, 2, 6, 6, 8, 24, 10, and so on up to a given limit.'''
public class Q7sequence3{
    public static void main(String[] args) {
        int n = 20, oddTerm = 2, factorial = 1, count = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print(oddTerm + " ");
                oddTerm += 2;
            } else {
                factorial *= count;
                System.out.print(factorial + " ");
                count++;
            }
        }
    }
}