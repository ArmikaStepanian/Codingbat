package task;

public class Recursion1 {

    public int factorial(int n) {
        int res = 1;
        do {
            res = res * n;
            n = n - 1;
        }
        while (n != 0);
        return res;
    }

    public int factorial2(int n) {                                 //Это решение автора РЕКУРСИЯ
        // Base case: if n is 1, we can return the answer directly
        if (n == 1) return 1;

        // Recursion: otherwise make a recursive call with n-1
        // (towards the base case), i.e. call factorial(n-1).
        // Assume the recursive call works correctly, and fix up
        // what it returns to make our result.
        return n * factorial(n - 1);
    }

    public int fibonacci(int n) {
        if (n == 0) return 0;             // Эти две строки можно было записать как if (n<=1) return n;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) return 0;
        if (bunnies == 1) return 2;
        return (bunnyEars2(bunnies - 2) + 5);
    }

    public int triangle(int rows) {
        if (rows == 0) return 0;
        return triangle(rows - 1) + rows;

    }

    public int sumDigits(int n) {
        if (n / 10 == 0) return n;               //эта строка означает что n состоит из одной цифры
        return sumDigits(n / 10) + n % 10;
    }

    public int powerN(int base, int n) {
        if (n == 0) return 1;
        return base * powerN(base, n - 1);
    }




    /*public static void main(String[] args) {
       Recursion1 g = new Recursion1();
        System.out.println(g.array6(new int[]{5}, 0));

    }*/


}
