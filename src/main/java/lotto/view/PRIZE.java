package lotto.view;

//✨feat : 등수와 당첨금 이넘 클래스
public enum PRIZE {
    FIRST(6, 2_000_000_000),
    SECOND(5, 30_000_000),
    THIRD(5, 1_500_000),
    FOURTH(4, 50_000),
    FIFTH(3, 5_000);
    private final int win;
    private final int prizeMoney;

    PRIZE(int win, int prizeMoney) {
        this.win = win;
        this.prizeMoney = prizeMoney;
    }

    public int getPrizeMoney() {
        return prizeMoney;
    }

    public int getWin() {
        return win;
    }

}
