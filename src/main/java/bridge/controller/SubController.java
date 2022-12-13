package bridge.controller;

public class SubController {
    private final BridgeController BRIDGE_CONTROLLER = new BridgeController();
    private final MoveController MOVE_CONTROLLER = new MoveController();
    private final ResultController RESULT_CONTROLLER = new ResultController();

    public void bridge() {
        // 다리 생성 메소드
        MOVE_CONTROLLER.setBridge(BRIDGE_CONTROLLER.bridge());
    }

    public void move() {
        // 이동 관리 메소드
        MOVE_CONTROLLER.moveHandler();
    }

    public void result() {
        // 성공 여부, 시도 횟수 출력하는 메소드
        RESULT_CONTROLLER.resultMove();
    }
}
