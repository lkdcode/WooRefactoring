package bridge.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {

    private final MakeBridge MAKE_BRIDGE = new MakeBridge();
    private List<String> bridge = new ArrayList<>();
    private String move;
    private int trial = 0;
    private int answer = 0;

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public boolean move(String move) {
        this.move = move;
        if (moveResult()) {
            System.out.println("맞췄당");
            System.out.println(answer + " 다음번 위치");
            System.out.println(trial + " 시도 횟수");
            return true;
        }
        return false;
    }

    public void move(int size) {
        this.bridge = MAKE_BRIDGE.makeBridge(size);
        System.out.println(bridge+"정답");
    }

    private boolean moveResult() {
        if (moving()) {
            answer++;
            return true;
        }
        return false;
    }

    private boolean moving() {
        trial++;
        if (bridge.get(answer).equals(this.move)) {
            return true;
        }
        return false;
    }


    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void retry(String command) {

    }


}