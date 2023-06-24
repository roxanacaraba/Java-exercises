package com.nagarro.remotelearning;

import com.nagarro.remotelearning.exception.IndexOutOfBoundsException;
import com.nagarro.remotelearning.exception.InvalidStringNumberException;
import com.nagarro.remotelearning.exception.NullOrEmptyException;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class StringList implements CustomList<String> {

    private String[] stringArray= new String[100];
    private ArrayList<String> recordOperationsArray = new ArrayList<>();
    public int count;

    public StringList() {
        count = 0;
    }

    @Override
    public void add(String element) {
        if (element == null || element.isEmpty()) {
            throw new NullOrEmptyException("The added value is null or empty.");
        }
        else if (!isNumeric(element)) {
            throw new InvalidStringNumberException("The added value is not the string representation of a number.");
        }

        this.stringArray[count] = element;
        count++;
        recordOperationsArray.add("Add");
    }

    @Override
    public String get(int position) {
        if (position >= count) {
            throw new IndexOutOfBoundsException("The index we try to read from the list is out of bounds.");
        }
        recordOperationsArray.add("Get");
        return this.stringArray[position];
    }

    @Override
    public boolean contains(String element) {
        recordOperationsArray.add("Contains");
        for (int i = 0; i < count; i++) {
            if (this.stringArray[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(CustomList<String> foreignList) {
        recordOperationsArray.add("Contains all");
        for (int i = 0; i < foreignList.size(); i++) {
            if (!this.contains(foreignList.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int size() {
        recordOperationsArray.add("Size");
        return count;
    }

    public boolean isNumeric(String strNum) {
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        return pattern.matcher(strNum).matches();
    }

    public ArrayList<String> returnRecordInformation() {
        return this.recordOperationsArray;
    }
}

