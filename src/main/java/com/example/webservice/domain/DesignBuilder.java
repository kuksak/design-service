package com.example.webservice.domain;

/**
 * Created by Sakshi Kukreti on 26-04-2017.
 */
public final class DesignBuilder {
    private String designNum;
    private String author;

    private DesignBuilder() {
    }

    public static DesignBuilder aDesign() {
        return new DesignBuilder();
    }

    public DesignBuilder withDesignNum(String designNum) {
        this.designNum = designNum;
        return this;
    }

    public DesignBuilder withAuthor(String author) {
        this.author = author;
        return this;
    }

    public Design build() {
        Design design = new Design();
        design.setDesignNum(designNum);
        design.setAuthor(author);
        return design;
    }
}
