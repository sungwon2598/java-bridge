package bridge.view;

import bridge.constant.ExceptionMessage;
import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        System.out.println("다리 건너기 게임을 시작합니다.\n");
        System.out.println("다리의 길이를 입력해주세요.");
        String input = readInput();
        return parseBridgeSize(input);
    }

    private String readInput() {
        return Console.readLine();
    }

    private int parseBridgeSize(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println(ExceptionMessage.INVALID_NUMBER.getMessage());
            return 0; // 또는 사용자가 유효한 값을 입력할 때까지 재시도할 수 있습니다.
        }
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        System.out.println("이동할 칸을 선택해주세요. (위: U, 아래: D)");
        String input = Console.readLine();
        if (!(input.equals("U") || input.equals("D"))) {
            throw new IllegalArgumentException(ExceptionMessage.PLEASE_INPUT_UORD.getMessage());
        }
        return input;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        System.out.println("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)");
        String input = Console.readLine();
        if (!(input.equals("R") || input.equals("Q"))) {
            throw new IllegalArgumentException(ExceptionMessage.PLEASE_INPUT_RORQ.getMessage());
        }
        return input;
    }

}
