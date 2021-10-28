package build_pattern.improtant;

public class Client {
    public static void main(String[] args){
        Product product = new Product.Builder()
                .setProductName("LiJun")
                .setProductCompany("YNU")
                .setParameterOne("软件学院")
                .setParameterTwo("软件工程")
                .setParameterThree("设计模式")
                .build();
        System.out.println(product);
    }
}
