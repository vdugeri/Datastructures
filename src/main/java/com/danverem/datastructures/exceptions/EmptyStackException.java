/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danverem.datastructures.exceptions;

/**
 *
 * @author Verem
 */
public class EmptyStackException extends Exception {

    private static final long serialVersionUID = 7811117804194807864L;
    private final String message;

    public EmptyStackException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

}
