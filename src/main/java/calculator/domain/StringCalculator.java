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
            int number = Integer.parseInt(numberStr);
            if (number < 0) {
                throw new IllegalArgumentException("음수는 계산할 수 없습니다.");
            }
            return number;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자가 아닌 값은 계산할 수 없습니다.");
        }
    }
}
