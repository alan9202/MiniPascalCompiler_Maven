package com.own.develop.compiler.statements;

import com.own.develop.compiler.Heap;
import com.own.develop.compiler.expressions.ArithmeticOperation;
import com.own.develop.compiler.expressions.Digit;
import com.own.develop.compiler.expressions.Expression;
import com.own.develop.compiler.expressions.Identifier;

public class AssigmentStm implements Statement {

    private Identifier identifier;
    private Expression expression;

    public AssigmentStm(Identifier identifier, Expression expression) {
        this.identifier = identifier;
        this.expression = expression;
    }

    public void doAction() {
        if(this.expression instanceof Digit) {
            Heap.heap(this.identifier.getValue(), ((Digit) this.expression).getExpressionValue());
        }
        else if(this.expression instanceof Identifier) {
            Heap.heap(this.identifier.getValue(), ((Identifier) this.expression).getExpressionValue());
        }
        else if(this.expression instanceof ArithmeticOperation) {
            Heap.heap(this.identifier.getValue(), ((ArithmeticOperation) this.expression).getExpressionValue());
        }
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
