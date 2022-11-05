package baseball;

/**
 * 한자리 수를 담는 일급컬랙션 인터페이스
 *
 * @author 호두
 * @version 1.0
 */

public interface SingleDigitForGame {
    /**
     * @param otherNumber 현재 Number 객체와 비교할 다른 Number 객체
     * @return 두 객체의 값이 같다면 true, 그렇지 않다면 false 반환
     */
    boolean equals(SingleDigitForGame otherNumber);

    /**
     * 입력으로 주어진 수가 알맞은 입력값인지 확인함
     * @param number 검증할 int 형 숫자값
     * @return 알맞은 입력값인 경우 true, 그렇지 않다면 false 반환
     */
    boolean validateNumber(int number);
}