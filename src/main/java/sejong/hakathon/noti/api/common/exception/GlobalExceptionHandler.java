package sejong.hakathon.noti.api.common.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import sejong.hakathon.noti.api.common.dto.APIErrorResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler({BadRequestException.class, NotFoundException.class, UnAuthorizedException.class})
    public ResponseEntity<APIErrorResponse> handleCustomException(final CustomException customException){
        return APIErrorResponse.of(customException.getHttpStatus(), customException.getMessage());
    }
}
