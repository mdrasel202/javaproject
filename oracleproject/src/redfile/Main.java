package redfile;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String inputPath = "C:\\Users\\Java Student PC-5\\Desktop\\1285720\\java\\javaproject\\oracleproject\\src\\redfile\\data.csv";
        ReadFile readFile = new ReadFile(inputPath);
        readFile.readFile();
        List<String[]> inputfile = readFile.getStringList();


        InsertData insertData = new InsertData();
        insertData.insertAllFruits(inputfile);

        RetriveData retriveData = new RetriveData();
        retriveData.selectAllFruits();
        List<String[]> readData=retriveData.getArrayString();

        for (String[] data: readData){

            data[2] = "APP";
            data[3] =  "OR";

        }


        String filePath2 = "C:\\Users\\Java Student PC-5\\Desktop\\1285720\\java\\javaproject\\oracleproject\\src\\redfile\\write.csv";
        WriteFile writeFile = new WriteFile(filePath2, readData);
        writeFile.writeFile();
    }

}