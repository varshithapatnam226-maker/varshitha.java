class NeonNumber {
    public static void main(String[] args) {
        int num = 9;
        int square = num * num;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        if (sum == num) {
            System.out.println(num + "is neon number");
        } else {
            System.out.println(num + "is not neon number");
        }
    }
}