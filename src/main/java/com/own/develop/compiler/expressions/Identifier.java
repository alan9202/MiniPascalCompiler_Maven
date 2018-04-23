package com.own.develop.compiler.expressions;

import com.own.develop.compiler.Heap;

public class Identifier implements Expression {
    
    private String value;

    public Identifier(String value) {
        this.value = value;
    }

    public int getExpressionValue() {
        return Heap.searchInHeap(value);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
