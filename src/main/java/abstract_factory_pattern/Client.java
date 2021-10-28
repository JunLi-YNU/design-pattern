package abstract_factory_pattern;

public class Client {
    public static void main(String[] args){
        AbstractFactory abstractFactory = new ConcreteFactoryOne();
        AbstractProductA abstractProductA = abstractFactory.createProductA();
        abstractProductA.method();
        AbstractProductB abstractProductB = abstractFactory.createProductB();
        abstractProductB.method();
    }
}
