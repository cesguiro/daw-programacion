package es.cesguiro;

import java.util.List;

public interface Reader {

    public List<String> read(String fileName);

    public void append(String fileName, String word, boolean append);
}
