package org.medicmmk.exceptions;

public class DoctorDoesNotExistException extends RuntimeException{
    public DoctorDoesNotExistException(String message) {
        super(message);
    }
}
