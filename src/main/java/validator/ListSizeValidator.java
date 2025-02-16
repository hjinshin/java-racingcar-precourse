package validator;

import java.util.List;

public class ListSizeValidator implements CustomValidator<List<String>> {

    /**
     * 자동차 이름 배열의 길이가 0보다 큰지 확인
     * @param list
     * return void
     */
    @Override
    public void validate(List<String> list) {
        if (list.isEmpty()) {
                throwError("1개 이상의 자동차를 입력해주세요.\n");
            }
    }
}
