package es.cesguiro;

import es.cesguiro.impl.BasicFileReader;
import es.cesguiro.impl.BufferFileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReaderTest {

    //private final Reader reader = new BasicFileReader();
    private final Reader reader = new BufferFileReader();

    @Test
    public void testOpenExistingFile() {
        String fileName = "products.txt";
        assertInstanceOf(String.class, this.reader.read(fileName));
    }

    @Test
    public void testOpenNotExistingFile() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            this.reader.read("file_not_exists.txt");
        });

        String expectedMessage = "No se encuentra el archivo";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testFileToList() {
        List<String> products_read = List.of(this.reader.read("products.txt"));
        List<String> products_expected = List.of("zapatillas\npantalón\ncamiseta\nvestido");

        assertEquals(products_expected, products_read);
    }

    @Test
    public void testAppendWord() {
        this.reader.append("products.txt", "\nfalda", true);

        List<String> products_read = List.of(this.reader.read("products.txt"));
        List<String> products_expected = List.of("zapatillas\npantalón\ncamiseta\nvestido\nfalda");

        assertEquals(products_expected, products_read);
    }

    @Test
    public void testRebuildFile() {
        this.reader.append("products.txt", "chaqueta\nfalda\nzapatos\nbañador", false);

        List<String> products_read = List.of(this.reader.read("products.txt"));
        List<String> products_expected = List.of("chaqueta\nfalda\nzapatos\nbañador");

        assertEquals(products_expected, products_read);
    }


    @AfterEach
    public void rebuildFile(){
        this.reader.append("products.txt", "zapatillas\npantalón\ncamiseta\nvestido", false);
    }

}