package sejong.hakathon.noti.api.common.exception;


import sejong.hakathon.noti.api.common.enums.ErrorStatus;

public class NotFoundException extends CustomException {
    public NotFoundException(final ErrorStatus errorStatus) {
        super(errorStatus);
    }
}
