package com.sample.data;

import java.util.ArrayList;
import java.util.List;

import com.sample.model.Record;
import com.sample.model.RecordType;

public class RecordDAO {
    private static List<Record> recordList = new ArrayList<Record>();

    public RecordDAO() {
        if (recordList.size() == 0) {
            recordList.add(new Record(29, new RecordType(1), "FSIA-2200001"));
            recordList.add(new Record(30, new RecordType(1), "FSIA-2200002"));
            recordList.add(new Record(31, new RecordType(1), "FSIA-2200003"));
            recordList.add(new Record(32, new RecordType(3), "FSIA-2200004"));
            recordList.add(new Record(40, new RecordType(3), "FSIA-2200005"));
            recordList.add(new Record(42, new RecordType(3), "FSIA-2200006"));
            recordList.add(new Record(43, new RecordType(3), "FSIA-2200007"));
            recordList.add(new Record(46, new RecordType(6), "FSIA-2200008"));
            recordList.add(new Record(47, new RecordType(6), "FSIA-2200009"));
            recordList.add(new Record(48, new RecordType(11), "FSIB-2200001"));
            recordList.add(new Record(49, new RecordType(11), "FSIB-2200002"));
            recordList.add(new Record(50, new RecordType(11), "FSIB-2200003"));
            recordList.add(new Record(51, new RecordType(11), "FSIB-2200004"));
            recordList.add(new Record(52, new RecordType(11), "FSIB-2200005"));
            recordList.add(new Record(53, new RecordType(11), "FSIB-2200006"));
            recordList.add(new Record(54, new RecordType(11), "FSIB-2200007"));
            recordList.add(new Record(55, new RecordType(11), "FSIB-2200008"));
            recordList.add(new Record(56, new RecordType(11), "FSIB-2200009"));
        }
    }

    public List<Record> getAll() {
        return recordList;
    }

    public Record getById(Integer recordId) {
        Record foundRecord = null;
        for (Record record : recordList) {
            if (record.getId() == recordId) {
                foundRecord = record;
            }
        }
        return foundRecord;
    }

}
