package com.own.develop.compiler.statements;

import com.own.develop.compiler.expressions.Expression;

public class IfStm implements Statement {

    private Expression expression;
    private StatementList statementList_1;
    private StatementList statementList_2;
    
    public IfStm(Expression expression, StatementList statementList_1, StatementList statementList_2) {
        this.expression = expression;
        this.statementList_1 = statementList_1;
        this.statementList_2 = statementList_2;
    }

    public void doAction() {
        int value = this.expression.getExpressionValue();
        
        if(value == 0) {
            this.statementList_2.executeStatementList();
        }
        else {
            this.statementList_1.executeStatementList();
        }
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public StatementList getStatementList_1() {
        return statementList_1;
    }

    public void setStatementList_1(StatementList statementList_1) {
        this.statementList_1 = statementList_1;
    }

    public StatementList getStatementList_2() {
        return statementList_2;
    }

    public void setStatementList_2(StatementList statementList_2) {
        this.statementList_2 = statementList_2;
    }
}
