package build_pattern.improtant;

/**
 * 对于该对象的创建一般情况下我们是直接new一个对象
 */
public class Product {
    private final String productName;
    private final String productCompany;
    private final  String parameterOne;
    private final String parameterTwo;
    private final String parameterThree;
    private final Object partOne;
    private final Object partTwo;

    public Product(String productName, String productCompany, String parameterOne, String parameterTwo, String parameterThree, Object partOne, Object partTwo) {
        this.productName = productName;
        this.productCompany = productCompany;
        this.parameterOne = parameterOne;
        this.parameterTwo = parameterTwo;
        this.parameterThree = parameterThree;
        this.partOne = partOne;
        this.partTwo = partTwo;
    }

    static class Builder{
        private String productName;
        private String productCompany;
        private String parameterOne;
        private String parameterTwo;
        private String parameterThree;
        private Object partOne;
        private Object partTwo;

        public Builder setProductName(String productName) {
            this.productName = productName;
            return this;
        }

        public Builder setProductCompany(String productCompany) {
            this.productCompany = productCompany;
            return this;
        }

        public Builder setParameterOne(String parameterOne) {
            this.parameterOne = parameterOne;
            return this;
        }

        public Builder setParameterTwo(String parameterTwo) {
            this.parameterTwo = parameterTwo;
            return this;
        }

        public Builder setParameterThree(String parameterThree) {
            this.parameterThree = parameterThree;
            return this;
        }

        public Builder setPartOne(Object partOne) {
            this.partOne = partOne;
            return this;
        }

        public Builder setPartTwo(Object partTwo) {
            this.partTwo = partTwo;
            return this;
        }

        Product build(){
            return new Product(productName,productCompany,parameterOne,parameterTwo,parameterThree,partOne,partTwo);
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productCompany='" + productCompany + '\'' +
                ", parameterOne='" + parameterOne + '\'' +
                ", parameterTwo='" + parameterTwo + '\'' +
                ", parameterThree='" + parameterThree + '\'' +
                ", partOne=" + partOne +
                ", partTwo=" + partTwo +
                '}';
    }
}
