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

    private final String PATH = System.getProperty("user.dir") + "\\src\\main\\resources\\";
    //private final Reader reader = new BasicFileReader();
    private final Reader reader = new BasicFileReader();

    @Test
    public void testOpenExistingFile() {
        assertInstanceOf(List.class, this.reader.read(this.PATH + "products.txt"));
    }

    @Test
    public void testOpenNotExistingFile() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            this.reader.read(this.PATH + "file_not_exists.txt");
        });

        String expectedMessage = "No se encuentra el archivo";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testReadFile() {
        List<String> products_read = this.reader.read(this.PATH + "products.txt");
        List<String> products_expected = List.of("zapatillas", "pantalón", "camiseta", "vestido");

        assertEquals(products_expected, products_read);
    }

    @Test
    public void testAppendWord() {
        this.reader.append(this.PATH + "products.txt", "falda", true);

        List<String> products_read = this.reader.read(this.PATH + "products.txt");
        List<String> products_expected = List.of("zapatillas", "pantalón", "camiseta", "vestido", "falda");

        assertEquals(products_expected, products_read);
    }

    @Test
    public void testRebuildFile() {
        this.reader.append(this.PATH + "products.txt", "chaqueta", false);

        List<String> products_read = this.reader.read(this.PATH + "products.txt");
        List<String> products_expected = List.of("chaqueta");

        assertEquals(products_expected, products_read);
    }


    @AfterEach
    public void rebuildFile() throws IOException {
        new FileWriter(this.PATH + "products.txt", false).close();
        List<String> original_products = List.of("zapatillas", "pantalón", "camiseta", "vestido");
        //this.reader.append(this.PATH + "products.txt", null, false);
        for (String product : original_products) {
            this.reader.append(this.PATH + "products.txt", product, true);
        }
        //this.reader.append("products.txt", "zapatillas\npantalón\ncamiseta\nvestido", false);
    }

}