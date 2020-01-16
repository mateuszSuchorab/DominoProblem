package com.suchorab.enums;

public enum Examples {

    //n = 10
    FIRST("5 2\n" +
            "6 2\n" +
            "10\n" +
            "4 1\n" +
            "2 2\n" +
            "1 1\n" +
            "7 6\n" +
            "0\n" +
            "9 9\n"),
    //n = 10
    SECOND("5 2\n" +
            "6 2\n" +
            "10\n" +
            "4 1\n" +
            "2 2\n" +
            "1 1\n" +
            "7 7\n" +
            "0\n" +
            "9 9\n"),
    //n = 10
    THIRD("5 2\n" +
            "6 2\n" +
            "10\n" +
            "1 4\n" +
            "2 2\n" +
            "1 1\n" +
            "6 7\n" +
            "0\n" +
            "9 9\n"),
    //n = 10
    FOURTH("5 2\n" +
            "6 2\n" +
            "10\n" +
            "1 4\n" +
            "2 2\n" +
            "1 1\n" +
            "7 7\n" +
            "0\n" +
            "9 9\n"),
    //n = 21
    FIFTH("5 2\n" +
            "6 2\n" +
            "21\n" +
            "7 14\n" +
            "10 4\n" +
            "5 5\n" +
            "9 12\n" +
            "20 0\n" +
            "7 5\n" +
            "10 3\n" +
            "0 11\n" +
            "2 9\n" +
            "16 17\n" +
            "17 0\n" +
            "7 9\n" +
            "4 10\n" +
            "12 7\n" +
            "15 7\n" +
            "11 1\n" +
            "10 18\n" +
            "15 15\n" +
            "0 19\n" +
            "0\n" +
            "9 9\n"),
    SIXTH("5 2\n" +
            "6 2\n" +
            "8\n" +
            "1 1\n" +
            "2 1\n" +
            "3 1\n" +
            "3 3\n" +
            "0\n" +
            "9 9\n");

    Examples(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }
}
