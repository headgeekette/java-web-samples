package com.sample.model;

import java.io.Serializable;

public class RecordType implements Serializable {

    private Integer id;
    private String name;

    public RecordType() {
    }

    public RecordType(Integer id) {
        this.id = id;
    }

    public RecordType(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
