package build_pattern;

/**
 * 对于该对象的创建一般情况下我们是直接new一个对象
 */
public class Product {
    private String productName;
    private String productCompany;
    private String parameterOne;
    private String parameterTwo;
    private String parameterThree;
    private Object partOne;
    private Object partTwo;

    public Product() {
    }

    public Product(String productName, String productCompany, String parameterOne, String parameterTwo, String parameterThree) {
        this.productName = productName;
        this.productCompany = productCompany;
        this.parameterOne = parameterOne;
        this.parameterTwo = parameterTwo;
        this.parameterThree = parameterThree;
    }

    public Product(String productName, String productCompany, String parameterOne, String parameterTwo, String parameterThree, Object partOne, Object partTwo) {
        this.productName = productName;
        this.productCompany = productCompany;
        this.parameterOne = parameterOne;
        this.parameterTwo = parameterTwo;
        this.parameterThree = parameterThree;
        this.partOne = partOne;
        this.partTwo = partTwo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCompany() {
        return productCompany;
    }

    public void setProductCompany(String productCompany) {
        this.productCompany = productCompany;
    }

    public String getParameterOne() {
        return parameterOne;
    }

    public void setParameterOne(String parameterOne) {
        this.parameterOne = parameterOne;
    }

    public String getParameterTwo() {
        return parameterTwo;
    }

    public void setParameterTwo(String parameterTwo) {
        this.parameterTwo = parameterTwo;
    }

    public String getParameterThree() {
        return parameterThree;
    }

    public void setParameterThree(String parameterThree) {
        this.parameterThree = parameterThree;
    }

    public Object getPartOne() {
        return partOne;
    }

    public void setPartOne(Object partOne) {
        this.partOne = partOne;
    }

    public Object getPartTwo() {
        return partTwo;
    }

    public void setPartTwo(Object partTwo) {
        this.partTwo = partTwo;
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
