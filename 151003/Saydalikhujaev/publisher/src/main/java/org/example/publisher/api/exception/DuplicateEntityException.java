package org.example.publisher.api.exception;

public class DuplicateEntityException extends Exception{
    public DuplicateEntityException(String entity, String name) {
        super(entity + " with name " + name + " already exists");
    }
}
