public class PowerNormal implements Power {

    Multiplication multiplier;

    public PowerNormal(Multiplication multiplier) {
        this.multiplier = multiplier;
    }

    public Integer power(Integer base, Integer power) {
        if (power == 0)
            return 1;
        int temp = power(base, power / 2);
        if (power % 2 == 0)
            return multiplier.multiply(temp, temp);
        else
            return multiplier.multiply(multiplier.multiply(base, temp), temp);

    }
}
