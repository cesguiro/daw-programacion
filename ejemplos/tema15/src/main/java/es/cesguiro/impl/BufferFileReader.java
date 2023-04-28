package es.cesguiro.impl;

import es.cesguiro.Reader;

import java.io.*;
import java.util.List;

public class BufferFileReader implements Reader {

    private final String PATH = System.getProperty("user.dir") + "/src/main/resources/";

    public String read(String fileName) {
        try (FileReader fileReader = new FileReader(PATH + fileName); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String text = "";
            String line = bufferedReader.readLine();
            while (line != null) {
                text += "line";
                line = bufferedReader.readLine();
            }
            return text;
        } catch (FileNotFoundException e) {
            System.out.println("hola");
            throw new RuntimeException("No se encuentra el archivo");
        } catch (IOException e) {
            throw new RuntimeException("Error abriendo el fichero");
        } catch (Exception e) {
            throw new RuntimeException("Algo ha salido mal");
        }
    }

    @Override
    public void append(String fileName, String word, boolean append) {
        try (FileWriter fileWriter = new FileWriter(PATH + fileName, append); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.newLine();
            bufferedWriter.append(word);
        }catch (FileNotFoundException e) {
            throw new RuntimeException("No se encuentra el archivo");
        } catch (IOException e) {
            throw new RuntimeException("Error abriendo el fichero");
        } catch (Exception e) {
            throw new RuntimeException("Algo ha salido mal");
        }
    }


}
