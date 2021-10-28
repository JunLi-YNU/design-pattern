package build_pattern.example;

public abstract class Computer {
    protected String mBoard;
    protected String mDisplay;
    protected String mOperationSystem;

    protected Computer(){

    }

    public void setBoard(String mBoard) {
        this.mBoard = mBoard;
    }

    public void setDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    public abstract void  setOperationSystem();

    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOperationSystem='" + mOperationSystem + '\'' +
                '}';
    }
}
