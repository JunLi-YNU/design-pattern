package factory_pattern.BoeingAirliner;

/**
 * 具体产品
 */
public class BoeingAirliner787 extends BoeingAirliner{
    @Override
    public void modelNumber() {
        System.out.println("Boeing Airliner: 787");
    }
}
