package es.cesguiro.impl;

import es.cesguiro.Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class BasicFileReader implements Reader {

    private final String PATH = System.getProperty("user.dir") + "/src/main/resources/";
    public String read(String fileName) {
        try (FileReader fileReader = new FileReader(PATH + fileName)) {
            String text = "";
            int ascii_char = fileReader.read();
            while (ascii_char != -1) {
                text  += (char) ascii_char;
                ascii_char = fileReader.read();
            }
            return text;
        } catch (FileNotFoundException e) {
            throw new RuntimeException("No se encuentra el archivo");
        } catch (IOException e) {
            throw new RuntimeException("Error abriendo el fichero");
        } catch (Exception e) {
            throw new RuntimeException("Algo ha salido mal");
        }
    }

    @Override
    public void append(String fileName, String word, boolean append) {
        try (FileWriter fileWriter = new FileWriter(PATH + fileName, append)) {
            for (int i = 0; i < word.length(); i++) {
                fileWriter.append(word.charAt(i));
            }
        }catch (FileNotFoundException e) {
            throw new RuntimeException("No se encuentra el archivo");
        } catch (IOException e) {
            throw new RuntimeException("Error abriendo el fichero");
        } catch (Exception e) {
            throw new RuntimeException("Algo ha salido mal");
        }
    }

}
