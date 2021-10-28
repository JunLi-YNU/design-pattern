package build_pattern;

public class Client {
    public static void main(String[] args){
        ProductBuilder productBuilder = new DefaultConcreteProductBuilder();
        Director director = new Director(productBuilder);
        Product product = director.makeProduct("LiJun","YNU",
                "软件学院","软件工程","本科",new Object(),new Object());
        System.out.println(product);
    }
}
