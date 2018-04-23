package com.own.develop.compiler.statements;

import com.own.develop.compiler.Heap;
import com.own.develop.compiler.expressions.Identifier;
import com.own.develop.exception.ReferenceException;

public class OutputStm implements Statement {

private Identifier identifier;
    
    public OutputStm(Identifier identifier) {
        this.identifier = identifier;
    }

    public void doAction() throws ReferenceException {
        Heap.print(this.identifier.getValue());
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }
}
