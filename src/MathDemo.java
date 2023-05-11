public class MathDemo {
    public static void main(String[] args) {
        MathOperations add = new MathOperations();
        add.setName("Add");

        MathOperations mul = new MathOperations();
        mul.setName("Mul");

        add.start();
        mul.start();
    }
}
