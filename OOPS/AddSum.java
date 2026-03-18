class EvenOdd {
    public void evenodd() {
        int a = 10;
        if (a % 2 == 0)
            System.out.println("No is even");
        else
            System.out.println("No is not even");
    }

    public void factorial() {
        int n = 5;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial is " + fact);
    }

    public class Addsub {
        public void add() {
            int a = 20, b = 10;
            int res1 = a + b;
            int res2 = a - b;
            System.out.println("sum is " + res1);
            System.out.println("sub is " + res2);
        }

        public static void main(String[] args) {
            new EvenOdd().evenodd();
            new EvenOdd().factorial();
            new Addsub().add();
        }
    }
}
