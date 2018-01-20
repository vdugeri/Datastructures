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
public class EmptyListException extends Exception {

    private static final long serialVersionUID = -6943264073304611744L;
    private final String message;

    public EmptyListException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

}
