package org.medicmmk.exceptions;

public class PatientDoesNotExistException extends RuntimeException {
    public PatientDoesNotExistException(String message) {
        super(message);
    }
}
