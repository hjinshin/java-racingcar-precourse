package validator;

public class NumberFormatValidator implements CustomValidator<String> {

    /**
     *  전진을 시도할 횟수가 숫자이어야 한다.
     * @param input
     * return void
     */
    @Override
    public void validate(String input) {
        try {
            Long.parseLong(input);
        } catch (NumberFormatException e) {
            throwError("시도할 횟수는 숫자이어야 한다.\n");
        }
    }
}
