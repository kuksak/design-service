package com.example.webservice.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Sakshi Kukreti on 26-04-2017.
 */
@Entity
public class Design {
    @Id
    @GeneratedValue
    private Long designId;
    private String designNum;
    private String author;


    public Design() {
    }

    public Design(Long designId, String designNum, String author) {
        this.designId = designId;
        this.designNum = designNum;
        this.author = author;
    }

    public Long getDesignId() {
        return designId;
    }

    public void setDesignId(Long designId) {
        this.designId = designId;
    }

    public String getDesignNum() {
        return designNum;
    }

    public void setDesignNum(String designNum) {
        this.designNum = designNum;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

