package Intermediate.advancedExceptionHandling;

class InvalidPersonException extends Exception {
    public InvalidPersonException(String message) {
        super(message);
    }
}
