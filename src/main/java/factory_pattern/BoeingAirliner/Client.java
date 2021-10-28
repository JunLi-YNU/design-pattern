package factory_pattern.BoeingAirliner;

/**
 * 在需要生成复杂的对象的时候就可以使用工厂模式
 */
public class Client {
    public static void main(String[] args){
        //创造一个工厂
        BoeingAirlinerFactory boeingAirlinerFactory = new BoeingAirliner787Factory();
        //生产一个产品
        BoeingAirliner boeingAirliner = boeingAirlinerFactory.produceBoeingAirliner();
        //使用这个产品
        boeingAirliner.modelNumber();
    }
}
