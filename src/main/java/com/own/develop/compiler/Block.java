package com.own.develop.compiler;

import com.own.develop.compiler.statements.StatementList;

public class Block {
    private StatementList statementList;

    public Block(StatementList statementList) {
        this.statementList = statementList;
    }

    public StatementList getStatementList() {
        return statementList;
    }

    public void setStatementList(StatementList statementList) {
        this.statementList = statementList;
    }
    
    public void doAction() throws Exception {
        this.statementList.executeStatementList();
    }
}
