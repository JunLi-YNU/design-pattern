package factory_pattern.BoeingAirliner;

/**
 * 抽象Boeing工厂：抽象出所有工厂共同的特点
 */
public abstract class BoeingAirlinerFactory {
    /**
     * 抽象方法具体内容由具体工厂去去实现
     */
    public abstract BoeingAirliner produceBoeingAirliner();
}
