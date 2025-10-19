package calculator.domain;

public class StringCalculator {
    public int sum(String[] numbers) {
        int total = 0;
        for (String numberStr : numbers) {
            total += parsePositiveInt(numberStr);
        }
        return total;
    }

    private int parsePositiveInt(String numberStr) {
        try {
            if (numberStr == null || numberStr.trim().isEmpty()) {
                throw new IllegalArgumentException("빈 값이나 공백은 숫자로 변환할 수 없습니다.");
            }
            int number = Integer.parseInt(numberStr.trim());
            if (number < 0) {
                throw new IllegalArgumentException("음수는 계산할 수 없습니다.");
            }
            return number;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자가 아닌 값은 계산할 수 없습니다.");
        }
    }
}
