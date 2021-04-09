public class MultiplyBySum implements Multiplication{
    @Override
    public Integer multiply(Integer a, Integer b){
        Integer res = 0;
        for (int i = 0; i < a; i++) {
            res += b;
        }
        return res;
    }
}
