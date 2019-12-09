package com.cute.data.service;

import java.io.IOException;
import java.util.List;

public interface CSVService {

    List<String[]> readCsv(String filePath) throws IOException;

    boolean createCsv(List<String[]> dataList, String filePath);

}
