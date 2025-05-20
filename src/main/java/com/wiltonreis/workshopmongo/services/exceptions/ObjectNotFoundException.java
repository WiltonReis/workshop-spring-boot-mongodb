package com.wiltonreis.workshopmongo.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String id) {
		super("Object not found, id: " + id);
	}
}
