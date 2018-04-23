package com.own.develop.compiler.statements;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.own.develop.exception.DataTypeException;
import com.own.develop.exception.ReferenceException;

public class StatementList {
    
    final static Logger logger = Logger.getLogger(StatementList.class);
    private List<Statement> statementList;
    
    public StatementList() {
        this.statementList = new ArrayList<Statement>();
    }
    
    public void addElement(Statement statement) {
        this.statementList.add(0, statement);
    }
    
    public Statement elementAt(int index) {
        return this.statementList.get(index);
    }
    
    public List<Statement> getStatementList() {
        return statementList;
    }
    
    public void setStatementList(ArrayList<Statement> statementList) {
        this.statementList = statementList;
    }
    
    public void executeStatementList() {
        
        this.statementList.forEach(stm -> {
            if(stm instanceof AssigmentStm) {
                ((AssigmentStm) stm).doAction();
            }
            else if(stm instanceof InputStm) {
                try {
                    ((InputStm) stm).doAction();
                } catch (DataTypeException ex) {
                    logger.error(ex);
                    System.exit(1);
                }
            }
            else if(stm instanceof OutputStm) {
                try {
                    ((OutputStm) stm).doAction();
                } catch (ReferenceException ex) {
                    logger.error(ex);
                    System.exit(1);
                }
            }
            else if(stm instanceof ForStm) {
                ((ForStm) stm).doAction();
            }
            else if(stm instanceof IfStm) {
                ((IfStm) stm).doAction();
            }
        });
    }
}
