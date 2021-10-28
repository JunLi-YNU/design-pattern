package build_pattern.example;

public class Client {
    public static void main(String[] args){
        Builder builder = new MacbookBuilder();
        Director director = new Director(builder);
        director.construct("2.3 GHz 八核Intel Core i9","Intel UHD Graphics 630 1536 MB");
        System.out.println("Computer Info:"+builder.create().toString());
    }
}
