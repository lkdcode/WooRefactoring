package bridge.controller;

import bridge.view.MoveState;

public class State {
    MoveState state;

    public State() {
        state = MoveState.RIGHT;
    }

    public void right() {
        state = MoveState.RIGHT;
    }

    public void wrong() {
        state = MoveState.WRONG;
    }

    public void end() {
        state = MoveState.END;
    }

    public bridge.view.MoveState getState() {
        return state;
    }
}
