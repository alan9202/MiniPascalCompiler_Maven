package com.own.develop.compiler;

public class Token {
    private Object value;
    private int line;
    private int column;

    public Token(Object value, int line, int column) {
        this.value = value;
        this.line = line;
        this.column = column;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
