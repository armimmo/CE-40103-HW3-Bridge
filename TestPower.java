public class TestPower {
    public static void main(String[] args) {
        PowerByShift shiftNormal = new PowerByShift(new MultiplyNormal());
        PowerByShift shiftSum= new PowerByShift(new MultiplyBySum());

        PowerNormal normalNormal = new PowerNormal(new MultiplyNormal());
        PowerNormal normalSum = new PowerNormal(new MultiplyBySum());

        System.out.println(shiftNormal.power(2, 3));
        System.out.println(shiftSum.power(3, 3));
        System.out.println(normalNormal.power(3, 3));
        System.out.println(normalSum.power(3, 3));


    }
}
