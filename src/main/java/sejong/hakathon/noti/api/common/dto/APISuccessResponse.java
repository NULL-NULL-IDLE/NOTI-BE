package sejong.hakathon.noti.api.common.dto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public record APISuccessResponse<T>(
        T data
) {
    public static <T> ResponseEntity<APISuccessResponse<T>> of(final HttpStatus httpStatus, final T data) {
        return ResponseEntity.status(httpStatus).body(new APISuccessResponse<T>(data));
    }
}
