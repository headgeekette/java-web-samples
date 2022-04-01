package com.sample.model;

public class RecordTypeField {

    private Integer id;
    private RecordType recordType;
    private String name;

    public RecordTypeField() {
    }

    public RecordTypeField(Integer id) {
        this.id = id;
    }

    public RecordTypeField(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public RecordTypeField(Integer id, RecordType recordType, String name) {
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

}