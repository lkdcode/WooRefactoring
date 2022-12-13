package bridge.view;

public enum BRIDGE_SHAPE {
    RIGHT_MOVE("[ O ]"),
    WRONG_MOVE("[ X ]"),
    BRIDGE("[   ]");
    private final String shape;

    BRIDGE_SHAPE(String shape) {
        this.shape = shape;
    }

    public String shape() {
        return shape;
    }
}
