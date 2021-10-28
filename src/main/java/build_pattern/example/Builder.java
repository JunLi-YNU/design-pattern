package build_pattern.example;

public abstract class Builder {
    public abstract void builderBoard(String board);
    public abstract void builderDisplay(String display);
    public abstract void buildOperationSystem();
    public abstract Computer create();
}
