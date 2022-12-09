package lotto.controller;

import lotto.model.Lotto;
import lotto.view.MESSAGE;

import java.util.*;

import static camp.nextstep.edu.missionutils.Console.readLine;

//✨feat : 유저로부터 입력받는 클래스
public class InputView {
    private final int MAX_DIGIT = 45;
    private final int MIN_DIGIT = 1;
    private final int UNIT_PRICE = 1000;
    private List<Integer> lottoNumbers = new ArrayList<>();
    private int pay;
    private int bonusNumber;
    private int tickets;

    // 유저에게 로또 번호를 입력 받는 메소드
    public void inputLottoNumbers() {
        String[] intputLottoNumbers = readLine().split(",");
        makeLottoNumbers(intputLottoNumbers);
        Lotto lotto = new Lotto(lottoNumbers);
        lottoNumbers = lotto.getNumbers();
    }

    public List<Integer> getLottoNumbers() {
        return lottoNumbers;
    }

    // 유저에게 보너스 번호를 입력 받는 메소드
    public void inputBonusNumber() {
        try {
            bonusNumber = Integer.parseInt(readLine());
            validateBonusNumber(bonusNumber);
        } catch (NumberFormatException e) {
            System.out.println(MESSAGE.ERROR_PAY.getView());
            throw new IllegalArgumentException();
        }
    }

    public int getBonusNumber() {
        return bonusNumber;
    }

    // 유저에게 로또 구매금을 입력 받는 메소드
    public void inputPay() {
        try {
            pay = Integer.parseInt(readLine());
            validatePay(pay);
            this.tickets = pay / UNIT_PRICE;
        } catch (NumberFormatException e) {
            System.out.println(MESSAGE.ERROR_PAY.getView());
            throw new IllegalArgumentException();
        }
    }

    public int getTickets() {
        return tickets;
    }

    public int getPay() {
        return pay;
    }

    private void validatePay(int pay) {
        validateMinPay(pay);
        validateUnitPay(pay);
        validateMaxPay(pay);
    }

    private void validateMaxPay(int pay) {
        if (pay > 1000000000) {
            System.out.println(MESSAGE.ERROR_PAY_MAX.getView());
            throw new IllegalArgumentException();
        }
    }

    private void validateMinPay(int pay) {
        if (pay < UNIT_PRICE) {
            System.out.println(MESSAGE.ERROR_PAY_MIN.getView());
            throw new IllegalArgumentException();
        }
    }

    private void validateUnitPay(int pay) {
        if (pay % UNIT_PRICE != 0) {
            System.out.println(MESSAGE.ERROR_PAY_UNIT.getView());
            throw new IllegalArgumentException();
        }
    }


    // 입력받은 로또 번호를 List<Integer> 로 변환
    private void makeLottoNumbers(String[] inputLottoNumbers) {
        try {
            for (int i = 0; i < inputLottoNumbers.length; i++) {
                validateRange(Integer.parseInt(inputLottoNumbers[i]));
                lottoNumbers.add(Integer.parseInt(inputLottoNumbers[i]));
            }
        } catch (NumberFormatException e) {
            System.out.println(MESSAGE.ERROR_PAY.getView());
            throw new IllegalArgumentException();
        }
    }

    // 입력받은 보너스 번호 검증
    private void validateBonusNumber(int bonusNumber) {
        validateBonusDuplication(bonusNumber);
        validateRange(bonusNumber);
    }

    // 입력받은 번호가 1 - 45 범위인지 검증
    private void validateRange(int inputLottoNumber) {
        if (!(inputLottoNumber >= MIN_DIGIT && inputLottoNumber <= MAX_DIGIT)) {
            System.out.println(MESSAGE.ERROR_RANGE.getView());
            throw new IllegalArgumentException();
        }
    }

    // 입력받은 보너스 번호가 로또 번호와 중복되는지 검증
    private void validateBonusDuplication(int bonusNumber) {
        if (lottoNumbers.contains(bonusNumber)) {
            System.out.println(MESSAGE.ERROR_DUPLICATION_BONUS.getView());
            throw new IllegalArgumentException();
        }
    }

}
