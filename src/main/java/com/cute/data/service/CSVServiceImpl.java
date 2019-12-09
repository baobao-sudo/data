package com.cute.data.service;


import com.csvreader.CsvReader;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class CSVServiceImpl implements CSVService {

    public static  char separator = ',';

    public List<String[]> readCsv(String filePath) throws IOException {
        CsvReader csvReader = null;
        List<String[]> dataList = new ArrayList<String[]>();
        csvReader = new CsvReader(filePath,separator, Charset.forName("GBK"));
        //跳过表头
        csvReader.readHeaders();
        String[] headArray = csvReader.getHeaders();
        while(csvReader.readRecord()){
            System.out.println(csvReader.getRawRecord());
            dataList.add(csvReader.getValues());
        }
        csvReader.close();
        for(int row = 0; row < dataList.size(); row++){

        }

        return null;
    }

    public boolean createCsv(List<String[]> dataList, String filePath) {
        return false;
    }
}
