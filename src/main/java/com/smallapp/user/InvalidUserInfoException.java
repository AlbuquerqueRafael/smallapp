package com.smallapp.user;

public class InvalidUserInfoException extends IllegalArgumentException{
	
	private static final long serialVersionUID = -7569167261003686996L;

	public InvalidUserInfoException(String message){
		super(message);
	}
}
