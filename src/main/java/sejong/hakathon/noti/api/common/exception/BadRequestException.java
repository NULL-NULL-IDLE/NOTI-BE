package sejong.hakathon.noti.api.common.exception;


import sejong.hakathon.noti.api.common.enums.ErrorStatus;

public class BadRequestException extends CustomException {
    public BadRequestException(final ErrorStatus errorStatus) {
        super(errorStatus);
    }
}
