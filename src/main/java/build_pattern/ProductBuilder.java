package build_pattern;

public interface ProductBuilder {
    void setProductName(String productName);
    void setProductCompany(String productCompany);
    void setProductParameterOne(String productParameterOne);
    void setProductParameterTwo(String productParameterTwo);
    void setProductParameterThree(String productParameterThree);
    void setProductPartOne(Object objectOne);
    void setProductPartTwo(Object objectTwo);
    Product builder();
}
