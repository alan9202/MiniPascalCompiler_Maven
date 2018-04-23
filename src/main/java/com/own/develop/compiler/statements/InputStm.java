package com.own.develop.compiler.statements;

import com.own.develop.compiler.Heap;
import com.own.develop.compiler.expressions.Identifier;
import com.own.develop.exception.DataTypeException;

public class InputStm implements Statement {
    
    private Identifier identifier;
    
    public InputStm(Identifier identifier) {
        this.identifier = identifier;
    }

    public void doAction() throws DataTypeException {
        Heap.read(this.identifier.getValue());
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }
}
