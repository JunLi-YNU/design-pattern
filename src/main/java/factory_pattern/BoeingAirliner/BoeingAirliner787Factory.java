package factory_pattern.BoeingAirliner;

public class BoeingAirliner787Factory extends BoeingAirlinerFactory{
    @Override
    public BoeingAirliner produceBoeingAirliner() {
        return new BoeingAirliner787();
    }
}
