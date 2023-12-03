package build_pattern.example;

public class MacbookBuilder extends Builder{
    private final Computer mComputer = new Macbook();
    @Override
    public void builderBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    public void builderDisplay(String display) {
        mComputer.setDisplay(display);
    }

    @Override
    public void buildOperationSystem() {
        mComputer.setOperationSystem();
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
