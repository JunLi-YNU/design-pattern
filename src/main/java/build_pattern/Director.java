package build_pattern;

public class Director {
    private ProductBuilder productBuilder;

    public Director(ProductBuilder productBuilder) {
        this.productBuilder = productBuilder;
    }

    public Product makeProduct(String productName, String productCompany, String parameterOne, String parameterTwo, String parameterThree, Object partOne, Object partTwo) {
        productBuilder.setProductName(productName);
        productBuilder.setProductCompany(productCompany);
        productBuilder.setProductParameterOne(parameterOne);
        productBuilder.setProductParameterTwo(parameterTwo);
        productBuilder.setProductParameterThree(parameterThree);
        productBuilder.setProductPartOne(parameterOne);
        productBuilder.setProductPartTwo(parameterTwo);
        return productBuilder.builder();
    }
}
