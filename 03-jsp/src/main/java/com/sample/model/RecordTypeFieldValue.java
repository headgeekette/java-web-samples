package com.sample.model;

public class RecordTypeFieldValue {

    private Integer id;
    private RecordTypeField recordTypeField;
    private Record record;
    private String value;

    public RecordTypeFieldValue() {
    }

    public RecordTypeFieldValue(Integer id) {
        this.id = id;
    }

    public RecordTypeFieldValue(Integer id, RecordTypeField recordTypeField,Record record,  String value) {
        this.id = id;
        this.record = record;
        this.recordTypeField = recordTypeField;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    public RecordTypeField getRecordTypeField() {
        return recordTypeField;
    }

    public void setRecordTypeField(RecordTypeField recordTypeField) {
        this.recordTypeField = recordTypeField;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
