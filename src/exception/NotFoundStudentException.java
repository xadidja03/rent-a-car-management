package exception;

import enums.ExceptionEnum;

public class NotFoundStudentException extends RuntimeException{
    public NotFoundStudentException(){
        super(ExceptionEnum.STUDENT_NOT_FOUND.name());

    }
}
