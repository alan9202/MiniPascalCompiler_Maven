package com.own.develop.compiler.expressions;

public class ArithmeticOperation implements Expression {

    private Expression expression_1;
    private Expression expression_2;
    private OperationType operationType;

    public ArithmeticOperation(Expression expression_1, Expression expression_2, OperationType operationType) {
        this.expression_1 = expression_1;
        this.expression_2 = expression_2;
        this.operationType = operationType;
    }

    public int getExpressionValue() {
        Integer value_1 = this.getValue(this.expression_1);
        Integer value_2 = this.getValue(this.expression_2);
        int result = 0;

        switch (operationType) {
            case ADD:
                result = value_1 + value_2;
                break;
            case SUB:
                result = value_1 - value_2;
                break;
            case MULT:
                result = value_1 * value_2;
                break;
            case DIV:
                result = value_1 / value_2;
                break;
        }
        
        return result;
    }

    private int getValue(Expression expression) {
        int result = 0;
        
        if (expression instanceof Digit) {
            result =  ((Digit) expression).getExpressionValue();
        } else if (expression instanceof Identifier) {
            result =  ((Identifier) expression).getExpressionValue();
        } else if (expression instanceof ArithmeticOperation) {
            result =  ((ArithmeticOperation) expression).getExpressionValue();
        }
        
        return result;
    }
}
