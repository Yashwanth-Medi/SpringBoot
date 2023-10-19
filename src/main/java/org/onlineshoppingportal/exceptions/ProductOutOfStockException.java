package org.onlineshoppingportal.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND,reason=" User already logged in",
		code=HttpStatus.TEMPORARY_REDIRECT)
public class ProductOutOfStockException extends RuntimeException {
	public ProductOutOfStockException(){
		super("prodct out of stock");
	}

}
