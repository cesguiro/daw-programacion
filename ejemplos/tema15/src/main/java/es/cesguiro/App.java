package es.cesguiro;

import es.cesguiro.impl.BasicFileReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BasicFileReader fileReader = new BasicFileReader();

        try {
            System.out.println(fileReader.read("products.txt"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //System.out.println( "Hello World!" );
    }
}
