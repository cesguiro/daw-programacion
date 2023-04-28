package es.cesguiro.impl;

import es.cesguiro.Reader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BufferFileReader implements Reader {

    public List<String> read(String fileName) {
        try (FileReader fileReader = new FileReader(fileName); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            /*List<String> words = new ArrayList<>();
            String line = bufferedReader.readLine();
            while (line != null) {
                words.add(line);
                line = bufferedReader.readLine();
            }
            return words;*/
            return bufferedReader.lines().toList();
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
        try (FileWriter fileWriter = new FileWriter(fileName, append); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
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
