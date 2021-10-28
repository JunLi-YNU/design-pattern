package factory_pattern.BoeingAirliner;

public class BoeingAirliner737Factory extends BoeingAirlinerFactory{
    @Override
    public BoeingAirliner produceBoeingAirliner() {
        return new BoeingAirliner737();
    }
}
