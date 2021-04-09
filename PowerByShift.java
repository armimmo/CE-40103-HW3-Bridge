public class PowerByShift implements Power{

    Multiplication multiplier;

    public PowerByShift(Multiplication multiplier) {
        this.multiplier = multiplier;
    }

    public Integer power(Integer base, Integer power)
    {
        int result = 1;
        while (power != 0)
        {
            if ((power & 1) == 1)
                result = multiplier.multiply(result, base);
            power >>= 1;
            base = multiplier.multiply(result, base);
        }

        return result;
    }
}
