package com.sample.data;

import java.util.ArrayList;
import java.util.List;

import com.sample.model.Record;
import com.sample.model.RecordTypeField;
import com.sample.model.RecordTypeFieldValue;

public class RecordTypeFieldValueDAO {

    private static List<RecordTypeFieldValue> list = new ArrayList<RecordTypeFieldValue>();

    public RecordTypeFieldValueDAO() {
        if (list.size() == 0) {
            list.add(new RecordTypeFieldValue(40, new RecordTypeField(1), new Record(29), "Intel Core i3 3.60 GHz"));
            list.add(new RecordTypeFieldValue(41, new RecordTypeField(2), new Record(29), "8GB"));
            list.add(new RecordTypeFieldValue(42, new RecordTypeField(3), new Record(29), "2x4gb"));
            list.add(new RecordTypeFieldValue(43, new RecordTypeField(4), new Record(29), "ddr3"));
            list.add(new RecordTypeFieldValue(44, new RecordTypeField(5), new Record(29), "1TB"));
            list.add(new RecordTypeFieldValue(45, new RecordTypeField(6), new Record(29), "256GB"));
            list.add(new RecordTypeFieldValue(46, new RecordTypeField(7), new Record(29), "none"));
            list.add(new RecordTypeFieldValue(47, new RecordTypeField(8), new Record(29), "n/a"));
            list.add(new RecordTypeFieldValue(48, new RecordTypeField(9), new Record(29), "n/a"));
            list.add(new RecordTypeFieldValue(49, new RecordTypeField(10), new Record(29), "VGA, HDMI"));
            list.add(new RecordTypeFieldValue(50, new RecordTypeField(11), new Record(29), "Win 7 Pro"));
            list.add(new RecordTypeFieldValue(51, new RecordTypeField(12), new Record(29), "n/a"));
            list.add(new RecordTypeFieldValue(52, new RecordTypeField(13), new Record(29), ""));
            list.add(new RecordTypeFieldValue(53, new RecordTypeField(1), new Record(30), "Intel Core i3 3.60 GHz"));
            list.add(new RecordTypeFieldValue(54, new RecordTypeField(2), new Record(30), "8GB"));
            list.add(new RecordTypeFieldValue(55, new RecordTypeField(3), new Record(30), "2x4gb"));
            list.add(new RecordTypeFieldValue(56, new RecordTypeField(4), new Record(30), "ddr3"));
            list.add(new RecordTypeFieldValue(57, new RecordTypeField(5), new Record(30), "1TB"));
            list.add(new RecordTypeFieldValue(58, new RecordTypeField(6), new Record(30), "256GB"));
            list.add(new RecordTypeFieldValue(59, new RecordTypeField(7), new Record(30), "none"));
            list.add(new RecordTypeFieldValue(60, new RecordTypeField(8), new Record(30), "n/a"));
            list.add(new RecordTypeFieldValue(61, new RecordTypeField(9), new Record(30), "n/a"));
            list.add(new RecordTypeFieldValue(62, new RecordTypeField(10), new Record(30), "VGA, HDMI"));
            list.add(new RecordTypeFieldValue(63, new RecordTypeField(11), new Record(30), "Win 7 Pro"));
            list.add(new RecordTypeFieldValue(64, new RecordTypeField(12), new Record(30), "n/a"));
            list.add(new RecordTypeFieldValue(65, new RecordTypeField(13), new Record(30), ""));
            list.add(new RecordTypeFieldValue(66, new RecordTypeField(1), new Record(31), "Intel Core i3 3.60 GHz"));
            list.add(new RecordTypeFieldValue(67, new RecordTypeField(2), new Record(31), "8GB"));
            list.add(new RecordTypeFieldValue(68, new RecordTypeField(3), new Record(31), "2x4gb"));
            list.add(new RecordTypeFieldValue(69, new RecordTypeField(4), new Record(31), "ddr3"));
            list.add(new RecordTypeFieldValue(70, new RecordTypeField(5), new Record(31), "1TB"));
            list.add(new RecordTypeFieldValue(71, new RecordTypeField(6), new Record(31), "256GB"));
            list.add(new RecordTypeFieldValue(72, new RecordTypeField(7), new Record(31), "none"));
            list.add(new RecordTypeFieldValue(73, new RecordTypeField(8), new Record(31), "n/a"));
            list.add(new RecordTypeFieldValue(74, new RecordTypeField(9), new Record(31), "n/a"));
            list.add(new RecordTypeFieldValue(75, new RecordTypeField(10), new Record(31), "VGA, HDMI"));
            list.add(new RecordTypeFieldValue(76, new RecordTypeField(11), new Record(31), "Win 7 Pro"));
            list.add(new RecordTypeFieldValue(77, new RecordTypeField(12), new Record(31), "n/a"));
            list.add(new RecordTypeFieldValue(78, new RecordTypeField(13), new Record(31), ""));
            list.add(new RecordTypeFieldValue(79, new RecordTypeField(25), new Record(32), "13x15"));
            list.add(new RecordTypeFieldValue(80, new RecordTypeField(26), new Record(32), ""));
            list.add(new RecordTypeFieldValue(81, new RecordTypeField(27), new Record(32), ""));
            list.add(new RecordTypeFieldValue(82, new RecordTypeField(28), new Record(32), "HDMI"));
            list.add(new RecordTypeFieldValue(83, new RecordTypeField(29), new Record(32), ""));
            list.add(new RecordTypeFieldValue(84, new RecordTypeField(25), new Record(40), "13x15"));
            list.add(new RecordTypeFieldValue(85, new RecordTypeField(26), new Record(40), "VGA"));
            list.add(new RecordTypeFieldValue(86, new RecordTypeField(27), new Record(40), ""));
            list.add(new RecordTypeFieldValue(87, new RecordTypeField(28), new Record(40), "HDMI"));
            list.add(new RecordTypeFieldValue(88, new RecordTypeField(29), new Record(40), ""));
            list.add(new RecordTypeFieldValue(89, new RecordTypeField(25), new Record(42), "13x15"));
            list.add(new RecordTypeFieldValue(90, new RecordTypeField(26), new Record(42), "VGA"));
            list.add(new RecordTypeFieldValue(91, new RecordTypeField(27), new Record(42), ""));
            list.add(new RecordTypeFieldValue(92, new RecordTypeField(28), new Record(42), "HDMI"));
            list.add(new RecordTypeFieldValue(93, new RecordTypeField(29), new Record(42), ""));
            list.add(new RecordTypeFieldValue(94, new RecordTypeField(25), new Record(43), "13x15"));
            list.add(new RecordTypeFieldValue(95, new RecordTypeField(26), new Record(43), "VGA"));
            list.add(new RecordTypeFieldValue(96, new RecordTypeField(27), new Record(43), ""));
            list.add(new RecordTypeFieldValue(97, new RecordTypeField(28), new Record(43), "HDMI"));
            list.add(new RecordTypeFieldValue(98, new RecordTypeField(29), new Record(43), ""));
            list.add(new RecordTypeFieldValue(99, new RecordTypeField(34), new Record(46), "SW"));
            list.add(new RecordTypeFieldValue(100, new RecordTypeField(35), new Record(46), "64:D9:89:33:0C:80"));
            list.add(new RecordTypeFieldValue(101, new RecordTypeField(36), new Record(46), "-"));
            list.add(new RecordTypeFieldValue(102, new RecordTypeField(37), new Record(46), "-"));
            list.add(new RecordTypeFieldValue(103, new RecordTypeField(38), new Record(46), "-"));
            list.add(new RecordTypeFieldValue(104, new RecordTypeField(39), new Record(46), "-"));
            list.add(new RecordTypeFieldValue(105, new RecordTypeField(40), new Record(46), "-"));
            list.add(new RecordTypeFieldValue(106, new RecordTypeField(41), new Record(46), "-"));
            list.add(new RecordTypeFieldValue(107, new RecordTypeField(34), new Record(47), "SW"));
            list.add(new RecordTypeFieldValue(108, new RecordTypeField(35), new Record(47), "64:D9:89:33:0C:80"));
            list.add(new RecordTypeFieldValue(109, new RecordTypeField(36), new Record(47), "-"));
            list.add(new RecordTypeFieldValue(110, new RecordTypeField(37), new Record(47), "-"));
            list.add(new RecordTypeFieldValue(111, new RecordTypeField(38), new Record(47), "-"));
            list.add(new RecordTypeFieldValue(112, new RecordTypeField(39), new Record(47), "-"));
            list.add(new RecordTypeFieldValue(113, new RecordTypeField(40), new Record(47), "-"));
            list.add(new RecordTypeFieldValue(114, new RecordTypeField(41), new Record(47), "-"));
            list.add(new RecordTypeFieldValue(115, new RecordTypeField(48), new Record(52), "Ref"));
            list.add(new RecordTypeFieldValue(116, new RecordTypeField(52), new Record(52), "Refrigerator"));
            list.add(new RecordTypeFieldValue(117, new RecordTypeField(48), new Record(53), "Ref"));
            list.add(new RecordTypeFieldValue(118, new RecordTypeField(52), new Record(53), "Refrigerator"));
            list.add(new RecordTypeFieldValue(119, new RecordTypeField(51), new Record(54), "Brown chairs"));
            list.add(new RecordTypeFieldValue(120, new RecordTypeField(51), new Record(55), "Brown chairs"));
            list.add(new RecordTypeFieldValue(121, new RecordTypeField(51), new Record(56), "Brown chairs"));
        }
    }

    public List<RecordTypeFieldValue> getDetailsOfRecord(Record record) {
        List<RecordTypeFieldValue> results = new ArrayList<RecordTypeFieldValue>();
        for (RecordTypeFieldValue value : list) {
            if (value.getRecord().getId() == record.getId()) {
                value.setRecord(record);
                results.add(value);
            }
        }
        return results;
    }

}
