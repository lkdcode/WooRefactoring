package bridge.controller;

/**
 * 메인 컨트롤러
 */

public class SystemController {
    private final SubController SUB_CONTROLLER = new SubController();

    public void bridgeGame() {
        // 다리 생성
        bridge();
        // 이동 선택
        move();
        // 최종 결과
        result();
    }

    /**
     * 다리를 생성을 관리하는 컨트롤러
     */
    private void bridge() {
        SUB_CONTROLLER.bridge();
    }

    /**
     * 건널 다리를 관리하는 컨트롤러
     */
    private void move() {
        SUB_CONTROLLER.move();
    }

    /**
     * 결과를 관리하는 컨트롤러
     */
    private void result() {
        SUB_CONTROLLER.result();
    }

}
