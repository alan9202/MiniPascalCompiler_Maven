package com.own.develop.compiler.statements;

import com.own.develop.compiler.Heap;
import com.own.develop.compiler.expressions.Digit;
import com.own.develop.compiler.expressions.Identifier;

public class ForStm implements Statement {
    
    private Identifier identifier;
    private Digit digit_1;
    private Digit digit_2;
    private StatementList statementList;
    
    public ForStm(Identifier identifier, Digit digit_1, Digit digit_2, StatementList statementList) {
        this.identifier = identifier;
        this.digit_1 = digit_1;
        this.digit_2 = digit_2;
        this.statementList = statementList;
    }
    
    public void doAction() {
        Heap.heap(this.identifier.getValue(), this.digit_1.getValue());
        
        int idHeapValue = this.identifier.getExpressionValue();
        
        while(idHeapValue <= this.digit_2.getValue()) {
            
            idHeapValue++;
            
            this.statementList.executeStatementList();
            
            Heap.heap(this.identifier.getValue(), idHeapValue);

            idHeapValue = this.identifier.getExpressionValue();
        }
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public Digit getDigit_1() {
        return digit_1;
    }

    public void setDigit_1(Digit digit_1) {
        this.digit_1 = digit_1;
    }

    public Digit getDigit_2() {
        return digit_2;
    }

    public void setDigit_2(Digit digit_2) {
        this.digit_2 = digit_2;
    }

    public StatementList getStatementList() {
        return statementList;
    }

    public void setStatementList(StatementList statementList) {
        this.statementList = statementList;
    }
}
