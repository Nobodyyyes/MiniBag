package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class App
{
    public static void main(String[] args ) throws IOException {
        RestService restService = new RestService();
        JSonMapper jSonMapper = new JSonMapper();
        String response = restService.run("https://cat-fact.herokuapp.com/facts");
        System.out.println(response);
        JSonModel[] jSonModels = jSonMapper.getModels(response);
        for (JSonModel model : jSonModels) {
            System.out.println(model);
        }

        FileWriter fileWriter = new FileWriter("json-file.txt" ,true);
        fileWriter.write(jSonModels[0].toString());
        fileWriter.write("\n" + jSonModels[1].toString());
        fileWriter.write("\n" + jSonModels[2].toString());
        fileWriter.write("\n" + jSonModels[3].toString());
        fileWriter.write("\n" + jSonModels[4].toString());
        fileWriter.close();
    }
}
