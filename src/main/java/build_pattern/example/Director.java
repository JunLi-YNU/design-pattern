package build_pattern.example;

public class Director {
    Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String board,String display){
        builder.builderBoard(board);
        builder.builderDisplay(display);
        builder.buildOperationSystem();
    }
}
