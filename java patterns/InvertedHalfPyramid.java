class InvertedHalfPyramid {
    public static void main(String[] args) {
        int n = 4, m = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= m; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}