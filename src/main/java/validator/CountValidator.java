package validator;

public class CountValidator implements CustomValidator<String> {

    /**
      * 전진을 시도할 횟수가 0이상, int 범위 이하인지 확인
      *
      * @param input
      * return void
      */
    @Override
    public void validate(String input) {
        long longValue = Long.parseLong(input);
            if (longValue < 0 || longValue > Integer.MAX_VALUE) {
                throwError("시도할 횟수는 "
                        + "0이상 이고 "
                        + Integer.MAX_VALUE
                        + "보다 작아야 한다.\n"
                        );
            }
    }
}
