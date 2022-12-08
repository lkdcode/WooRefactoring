package First.onboarding;

import First.onboarding.problemOne.CalNumber;
import First.onboarding.problemOne.ValidateNumber;

import java.util.List;

class Problem1 {
    private final static ValidateNumber VALIDATE_NUMBER = new ValidateNumber();
    private final static CalNumber CAL_NUMBER = new CalNumber();
    private static int startOrLast = 0;
    private static int pobiOddNumber = 0;
    private static int pobiEvenNumber = 0;
    private static int crongOddNumber = 0;
    private static int crongEvenNumber = 0;
    private static int pobiStepNumber = 0;
    private static int crongStepNumber = 0;
    private static int pobiNumber = 0;
    private static int crongNumber = 0;

    public static int solution(List<Integer> pobi, List<Integer> crong) {

        int pobiLeftNumber = pobi.get(0);
        startOrLast = VALIDATE_NUMBER.startOrLast(pobiLeftNumber);
        pobiOddNumber = VALIDATE_NUMBER.oddNumber(pobiLeftNumber);

        int pobiRightNumber = pobi.get(1);
        pobiEvenNumber = VALIDATE_NUMBER.evenNumber(pobiRightNumber);

        int crongLeftNumber = crong.get(0);
        startOrLast = VALIDATE_NUMBER.startOrLast(crongLeftNumber);
        crongOddNumber = VALIDATE_NUMBER.oddNumber(crongLeftNumber);

        int crongRightNumber = crong.get(1);
        crongEvenNumber = VALIDATE_NUMBER.evenNumber(crongRightNumber);

        pobiStepNumber = VALIDATE_NUMBER.stepNumber(pobiLeftNumber, pobiRightNumber);
        crongStepNumber = VALIDATE_NUMBER.stepNumber(crongLeftNumber, crongRightNumber);

        int pobiLeftPage = Math.max(CAL_NUMBER.addNumber(pobiLeftNumber), CAL_NUMBER.multipleNumber(pobiLeftNumber));
        int pobiRightPage = Math.max(CAL_NUMBER.addNumber(pobiRightNumber), CAL_NUMBER.multipleNumber(pobiRightNumber));
        int crongLeftPage = Math.max(CAL_NUMBER.addNumber(crongLeftNumber), CAL_NUMBER.multipleNumber(crongLeftNumber));
        int crongRightPage = Math.max(CAL_NUMBER.addNumber(crongRightNumber), CAL_NUMBER.multipleNumber(crongRightNumber));

        pobiNumber = Math.max(pobiLeftPage, pobiRightPage);
        crongNumber = Math.max(crongLeftPage, crongRightPage);

        int answer = 0;

        if (pobiNumber > crongNumber) {
            answer = 1;
        }

        if (pobiNumber < crongNumber) {
            answer = 2;
        }

        if (pobiNumber == crongNumber) {
            answer = 0;
        }

        if (startOrLast == -1 ||
          pobiOddNumber == -1 ||
          pobiEvenNumber == -1 ||
          crongOddNumber == -1 ||
          crongEvenNumber == -1 ||
          pobiStepNumber == -1 ||
          crongStepNumber == -1) {
            answer = -1;
        }

        return answer;
    }
}