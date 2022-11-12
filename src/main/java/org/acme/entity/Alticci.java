package org.acme.entity;

public class Alticci {
    private int value;
    private int position;

    public Alticci(Integer value, Integer position) {
        this.value = value;
        this.position = position;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
