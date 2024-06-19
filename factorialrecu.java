class factorialrecu {
    private static final int n = 0;
    static int fact(int n) {
        if (n == 0)
            return 1;
        else
            return (n * fact(n - 1));
    }
    public static void main(String[] args) {
        int fact = 1;
        int n=7;
        fact = fact(n);
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}