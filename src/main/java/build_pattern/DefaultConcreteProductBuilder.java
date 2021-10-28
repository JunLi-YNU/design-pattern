package build_pattern;

public class DefaultConcreteProductBuilder implements ProductBuilder{
    private String productName;
    private String productCompany;
    private String parameterOne;
    private String parameterTwo;
    private String parameterThree;
    private Object partOne;
    private Object partTwo;

    @Override
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public void setProductCompany(String productCompany) {
        this.productCompany = productCompany;
    }

    @Override
    public void setProductParameterOne(String productParameterOne) {
        this.parameterOne = productParameterOne;
    }

    @Override
    public void setProductParameterTwo(String productParameterTwo) {
        this.parameterTwo = productParameterTwo;
    }

    @Override
    public void setProductParameterThree(String productParameterThree) {
        this.parameterThree = productParameterThree;
    }

    @Override
    public void setProductPartOne(Object objectOne) {
        this.partOne = objectOne;
    }

    @Override
    public void setProductPartTwo(Object objectTwo) {
        this.partTwo = objectTwo;
    }


    @Override
    public Product builder() {
        return new Product(this.productName,this.productCompany,this.parameterOne,this.parameterTwo,this.parameterThree,this.partOne,this.partTwo);
    }
}
