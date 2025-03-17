/**
 * This class demonstrates the serialization and deserialization of a singleton object.
 * It writes the singleton instance of DateUtil to a file and then reads it back to 
 * verify that the deserialized object is the same as the original singleton instance.
 * 
 * <p>Steps performed in the main method:</p>
 * <ol>
 *   <li>Obtain the singleton instance of DateUtil.</li>
 *   <li>Serialize the DateUtil instance to a file named "dateUtil.ser".</li>
 *   <li>Deserialize the DateUtil instance from the file "dateUtil.ser".</li>
 *   <li>Compare the original and deserialized instances to check if they are the same.</li>
 * </ol>
 * 
 * @throws FileNotFoundException if the file to write/read the object is not found.
 * @throws IOException if an I/O error occurs during serialization/deserialization.
 * @throws ClassNotFoundException if the class of the serialized object cannot be found.
 */
package com.rvg.patterns.singleton;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Test {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        DateUtil dateUtil1 = DateUtil.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
                new File("/Users/ricvegag/Documents/cursos/designPatterns/singleton/dateUtil.ser")));
        oos.writeObject(dateUtil1);

        DateUtil dateUtil2 = null;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                new File("/Users/ricvegag/Documents/cursos/designPatterns/singleton/dateUtil.ser")));
        dateUtil2 = (DateUtil) ois.readObject();

        oos.close();
        ois.close();

        System.out.println(dateUtil1 == dateUtil2);
    }
}
