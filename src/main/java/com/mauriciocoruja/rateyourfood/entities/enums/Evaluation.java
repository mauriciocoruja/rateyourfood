package com.mauriciocoruja.rateyourfood.entities.enums;

public enum Evaluation {
    TERRIBLE(0),
    BAD(1),
    OK(2),
    GOOD(3),
    VERY_GOOD(4),
    EXCELLENT(5);

    private int rate;

    Evaluation(int rate) {
        this.rate = rate;
    }

    public int getCode() {
        return rate;
    }

    public static Evaluation valueOf(int rate) {
        for (Evaluation value : Evaluation.values()) {
            if (value.getCode() == rate) {
                return value;
            }
        }
        throw new IllegalArgumentException("An illegal rate are informed");
    }
}
