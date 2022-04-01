package com.sample.data;

import java.util.ArrayList;
import java.util.List;

import com.sample.model.RecordType;

public class RecordTypeDAO {

    private static List<RecordType> recordTypeList = new ArrayList<RecordType>();

    public RecordTypeDAO() {
        if (recordTypeList.size() == 0) {
            recordTypeList.add(new RecordType(1, "Desktop PC"));
            recordTypeList.add(new RecordType(2, "Laptop"));
            recordTypeList.add(new RecordType(3, "Monitor"));
            recordTypeList.add(new RecordType(4, "UPS"));
            recordTypeList.add(new RecordType(5, "IP Phone"));
            recordTypeList.add(new RecordType(6, "Infrastructure Devices"));
            recordTypeList.add(new RecordType(7, "Hardware Peripherals"));
            recordTypeList.add(new RecordType(8, "Chairs"));
            recordTypeList.add(new RecordType(9, "Tables"));
            recordTypeList.add(new RecordType(10, "Cabinets"));
            recordTypeList.add(new RecordType(11, "Appliances"));
            recordTypeList.add(new RecordType(12, "Office Tools"));
            recordTypeList.add(new RecordType(13, "Pedestals"));
            recordTypeList.add(new RecordType(14, "Cubicles"));
        }
    }

}
