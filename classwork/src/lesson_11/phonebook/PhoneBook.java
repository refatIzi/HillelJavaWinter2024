package lesson_11.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    List<Record> records = new ArrayList<>();

    public void add(Record record) {
        records.add(record);
    }

    public Record find(Record record) {
        for (Record userInfoRecord : records) {
            if (userInfoRecord.getName().equals(record.getName())) {
                System.out.println(userInfoRecord);
                break;
            }
        }
        return null;
    }


    public void findAll(String string) {
        for (Record record : records) {
            if (record.getName().equals(string)) {
                System.out.println(record);
            }
        }
    }
}
