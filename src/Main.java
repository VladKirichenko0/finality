import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Достаем данные из файла
        List<GrantData> grantDataList = readCSVFile("Гранты.csv");

        // Создаем и заполняем базу данных
        SQL.createSQLiteDB(grantDataList);

        // Задание 1
        SQL.buildAGraph();

        // Задание 2
        SQL.printAverageGrantSize();

        // Задание 3
        SQL.printBusinessType();
    }

    // Достаем данные из csv файла
    public static List<GrantData> readCSVFile(String fileName) {
        List<GrantData> grantDataListСreate = new ArrayList<>();
        try {
            Reader reader = new FileReader(fileName);
            com.opencsv.CSVReader csvReader = new CSVReader(reader);
            List<String[]> records = csvReader.readAll();
            int count = 0;
            for (String[] record : records) {
                // Пропускаем первую строку csv файла тк она является заголовками
                if (count == 0) {
                    count ++;
                    continue;
                }
                // Пропускаем запись, если требуемое поле пустое
                if (record[0] == null || record[0].isEmpty()) {
                    continue;
                }
                GrantData grantData = new GrantData(record[0], record[1],
                        Double.parseDouble(record[2].replace("$", "").
                                replace(",", "")),
                        Integer.parseInt(record[3]),
                        record[4], Integer.parseInt(record[5]));
                grantDataListСreate.add(grantData);
            }
            reader.close();
        } catch (IOException | CsvException e) {
            throw new RuntimeException(e);
        }
        return grantDataListСreate;
    }
}