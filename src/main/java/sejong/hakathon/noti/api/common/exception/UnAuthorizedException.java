package sejong.hakathon.noti.api.common.exception;


import sejong.hakathon.noti.api.common.enums.ErrorStatus;

public class UnAuthorizedException extends CustomException{
    public UnAuthorizedException(ErrorStatus errorStatus) {
        super(errorStatus);
    }
}
