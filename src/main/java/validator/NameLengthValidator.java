package validator;

import java.util.List;

public class NameLengthValidator implements CustomValidator<List<String>> {
    private static final int NAME_LENGTH_LIMIT = 5;

    /**
     * 자동차 이름의 길이가 NAME_LENGTH_LIMIT 이하 인지 확인
     * @param list
     * return void
     */
    @Override
    public void validate(List<String> list) {
        for (String name : list) {
            if (name.length() > NAME_LENGTH_LIMIT) {
                throwError("자동차의 이름은 "+ NAME_LENGTH_LIMIT + "자 이하이어야 한다.\n");
            }
            if (name.isEmpty()) {
                throwError("자동차의 이름은 1자 이상이어야 한다.\n");
            }
        }
    }
}
