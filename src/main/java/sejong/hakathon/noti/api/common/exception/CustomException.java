package sejong.hakathon.noti.api.common.exception;


import lombok.Getter;
import org.springframework.http.HttpStatus;
import sejong.hakathon.noti.api.common.enums.ErrorStatus;

@Getter
public class CustomException extends RuntimeException {
    private final HttpStatus httpStatus;
    private final String message;

    public CustomException(final ErrorStatus errorStatus) {
        super(errorStatus.getMessage());
        this.httpStatus = errorStatus.getStatus();
        this.message = errorStatus.getMessage();
    }
}
