package com.sample.model;

import java.io.Serializable;

public class Record implements Serializable {

    private Integer id;
    private RecordType recordType;
    private String name;
    private String field1;
    private String field2;
    private String field3;

    public Record() {
    }

    public Record(Integer id) {
        this.id = id;
    }

    public Record(Integer id, RecordType recordType, String name) {
        this.id = id;
        this.recordType = recordType;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RecordType getRecordType() {
        return recordType;
    }

    public void setRecordType(RecordType recordType) {
        this.recordType = recordType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getField1() {
        return "field1";
    }

    public String getField2() {
        return "field2";
    }

    public String getField3() {
        return "field3";
    }

}