package com.sample.data;

import java.util.ArrayList;
import java.util.List;

import com.sample.model.RecordType;
import com.sample.model.RecordTypeField;

public class RecordTypeFieldDAO {

    private static List<RecordTypeField> list = new ArrayList<RecordTypeField>();

    public RecordTypeFieldDAO() {
        if (list.size() == 0) {
            list.add(new RecordTypeField(1, new RecordType(1), "CPU"));
            list.add(new RecordTypeField(2, new RecordType(1), "RAM"));
            list.add(new RecordTypeField(3, new RecordType(1), "RAMmodule"));
            list.add(new RecordTypeField(4, new RecordType(1), "RAMtype"));
            list.add(new RecordTypeField(5, new RecordType(1), "HDD"));
            list.add(new RecordTypeField(6, new RecordType(1), "SSD"));
            list.add(new RecordTypeField(7, new RecordType(1), "optane"));
            list.add(new RecordTypeField(8, new RecordType(1), "OD"));
            list.add(new RecordTypeField(9, new RecordType(1), "PSU"));
            list.add(new RecordTypeField(10, new RecordType(1), "videoPorts"));
            list.add(new RecordTypeField(11, new RecordType(1), "operatingSystem"));
            list.add(new RecordTypeField(12, new RecordType(1), "OSProductKey"));
            list.add(new RecordTypeField(13, new RecordType(1), "computerName"));
            list.add(new RecordTypeField(14, new RecordType(2), "CPU"));
            list.add(new RecordTypeField(15, new RecordType(2), "RAM"));
            list.add(new RecordTypeField(16, new RecordType(2), "RAMmodule"));
            list.add(new RecordTypeField(17, new RecordType(2), "RAMtype"));
            list.add(new RecordTypeField(18, new RecordType(2), "HDD"));
            list.add(new RecordTypeField(19, new RecordType(2), "SSD"));
            list.add(new RecordTypeField(20, new RecordType(2), "OD"));
            list.add(new RecordTypeField(21, new RecordType(2), "videoPorts"));
            list.add(new RecordTypeField(22, new RecordType(2), "operatingSystem"));
            list.add(new RecordTypeField(23, new RecordType(2), "OSProductKey"));
            list.add(new RecordTypeField(24, new RecordType(2), "computerName"));
            list.add(new RecordTypeField(25, new RecordType(3), "screenSize"));
            list.add(new RecordTypeField(26, new RecordType(3), "VGA"));
            list.add(new RecordTypeField(27, new RecordType(3), "DVI"));
            list.add(new RecordTypeField(28, new RecordType(3), "HDMI"));
            list.add(new RecordTypeField(29, new RecordType(3), "DP"));
            list.add(new RecordTypeField(30, new RecordType(4), "capacity"));
            list.add(new RecordTypeField(31, new RecordType(4), "phase"));
            list.add(new RecordTypeField(32, new RecordType(5), "macAddress"));
            list.add(new RecordTypeField(33, new RecordType(5), "extension"));
            list.add(new RecordTypeField(34, new RecordType(6), "specificType"));
            list.add(new RecordTypeField(35, new RecordType(6), "macAddress"));
            list.add(new RecordTypeField(36, new RecordType(6), "HWPartNumber"));
            list.add(new RecordTypeField(37, new RecordType(6), "hostName"));
            list.add(new RecordTypeField(38, new RecordType(6), "managementIP"));
            list.add(new RecordTypeField(39, new RecordType(6), "unifiMACID"));
            list.add(new RecordTypeField(40, new RecordType(6), "fortinetHWID"));
            list.add(new RecordTypeField(41, new RecordType(6), "ciscoPIDVID"));
            list.add(new RecordTypeField(42, new RecordType(7), "specificType"));
            list.add(new RecordTypeField(43, new RecordType(7), "partOfSet"));
            list.add(new RecordTypeField(44, new RecordType(7), "description"));
            list.add(new RecordTypeField(45, new RecordType(8), "description"));
            list.add(new RecordTypeField(46, new RecordType(9), "description"));
            list.add(new RecordTypeField(47, new RecordType(10), "description"));
            list.add(new RecordTypeField(48, new RecordType(11), "description"));
            list.add(new RecordTypeField(49, new RecordType(12), "description"));
            list.add(new RecordTypeField(50, new RecordType(13), "description"));
            list.add(new RecordTypeField(51, new RecordType(14), "description"));
            list.add(new RecordTypeField(52, new RecordType(11), "specificType"));
            list.add(new RecordTypeField(53, new RecordType(12), "specificType"));
        }
    }

    public RecordTypeField getById(Integer id) {

        RecordTypeField result = null;

        for (RecordTypeField entry : list) {
            if (entry.getId() == id) {
                result = new RecordTypeField(entry.getId(), entry.getName());
            }
        }
        return result;
    }

}
