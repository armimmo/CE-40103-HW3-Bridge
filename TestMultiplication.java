public class TestMultiplication {
    public static void main(String[] args) {
        MultiplyBySum newMultiplier1 = new MultiplyBySum();
        MultiplyNormal newMultiplier2 = new MultiplyNormal();

        System.out.println(newMultiplier1.multiply(5, 6));
        System.out.println(newMultiplier2.multiply(3, 4));

    }
}
