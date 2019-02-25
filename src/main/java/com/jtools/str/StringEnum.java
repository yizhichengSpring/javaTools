package com.jtools.str;

public enum StringEnum {
    ONE("1","壹"),
    TWO("2","贰"),
    THREE("3","叁"),
    FOUR("4","肆"),
    FIVE("5","伍"),
    SIX("6","陆"),
    SEVEN("7","柒"),
    EIGHT("8","捌"),
    NINE("9","玖"),
    TEN("10","拾");

    private String abbreviation;

    private String traditional;



    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getTraditional() {
        return traditional;
    }

    public void setTraditional(String traditional) {
        this.traditional = traditional;
    }

    StringEnum(String abbreviation, String traditional) {
        this.abbreviation = abbreviation;
        this.traditional = traditional;
    }
}
