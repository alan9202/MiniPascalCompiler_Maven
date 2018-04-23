package com.own.develop.compiler.expressions;

public class Digit implements Expression {
    
    private Integer value;
    
    public Digit(Integer value) {
        this.value = value;
    }

    public int getExpressionValue() {
        return value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
