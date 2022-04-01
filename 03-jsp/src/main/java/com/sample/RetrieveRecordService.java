package com.sample;

import java.util.List;

import com.sample.data.RecordDAO;
import com.sample.data.RecordTypeFieldDAO;
import com.sample.data.RecordTypeFieldValueDAO;
import com.sample.model.Record;
import com.sample.model.RecordTypeField;
import com.sample.model.RecordTypeFieldValue;

public class RetrieveRecordService {

    private static Record record = null;

    public RetrieveRecordService() {
    }

    public Record getRecord(Integer recordId) {
        RecordDAO dao = new RecordDAO();
        record = dao.getById(recordId);
        return record;
    }

    public List<RecordTypeFieldValue> getOtherRecordDetails() {
        List<RecordTypeFieldValue> valuesList = null;
        RecordTypeFieldValueDAO recordTypeFieldValueDAO = new RecordTypeFieldValueDAO();
        valuesList = recordTypeFieldValueDAO.getDetailsOfRecord(record);

        RecordTypeFieldDAO recordTypeFieldDAO = new RecordTypeFieldDAO();

        for (RecordTypeFieldValue value : valuesList) {
            RecordTypeField recordTypeField = recordTypeFieldDAO.getById(value.getRecordTypeField().getId());
            value.setRecordTypeField(recordTypeField);
            value.setRecord(record);
            if (value.getValue().isEmpty()) {
                value.setValue("- - -");
            }
        }

        return valuesList;
    }

}
