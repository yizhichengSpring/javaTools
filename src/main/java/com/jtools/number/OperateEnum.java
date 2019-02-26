package com.jtools.number;

public enum OperateEnum {
    ADD("+"),
    SUB("-"),
    MUL("*"),
    DIV("/");


    private String operation;

    OperateEnum() {
    }

    OperateEnum(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
