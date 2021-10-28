package factory_pattern.BoeingAirliner;

/**
 * 具体产品
 */
public class BoeingAirliner737 extends BoeingAirliner {
    @Override
    public void modelNumber() {
        System.out.println("BoeingAirliner: 737");
    }
}
