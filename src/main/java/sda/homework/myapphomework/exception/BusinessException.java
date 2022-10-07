package sda.homework.myapphomework.exception;

/**
 * Generic exception for business related errors in api class.
 */
public class BusinessException extends RuntimeException{

    public BusinessException(String message) {
        super(message);
    }
}
