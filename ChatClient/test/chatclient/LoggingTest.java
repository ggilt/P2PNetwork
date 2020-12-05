/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatclient;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author whyyo
 */
public class LoggingTest {
    
    public LoggingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of CreateFile method, of class Logging.
     */
    @Test
    public void testCreateFile() {
        System.out.println("CreateFile");
        Logging.CreateFile();
      File file = new File("log.txt");
      assertTrue(file.exists());
    }

    /**
     * Test of Write method, of class Logging.
     */
    @Test
    public void testWrite() throws FileNotFoundException, IOException {
        System.out.println("Write");
        BufferedReader reader = new BufferedReader(new FileReader("log.txt"));
        int lines = 0;
        while (reader.readLine() != null) lines++;
        reader.close();
        lines = lines+1;
        String str = "Test Line";
        Logging.Write(str);
        BufferedReader reader2 = new BufferedReader(new FileReader("log.txt"));
        int newlines = 0;
        while (reader2.readLine() != null) newlines++;
        reader2.close();
        assertEquals(lines,newlines);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of InputWrite method, of class Logging.
     */
    @Test
    public void testInputWrite() throws FileNotFoundException, IOException {
        System.out.println("InputWrite");
        BufferedReader reader = new BufferedReader(new FileReader("log.txt"));
        int lines = 0;
        while (reader.readLine() != null) lines++;
        reader.close();
        lines = lines+1;
        String str = "Test Line";
        Logging.Write(str);
        BufferedReader reader2 = new BufferedReader(new FileReader("log.txt"));
        int newlines = 0;
        while (reader2.readLine() != null) newlines++;
        reader2.close();
        assertEquals(lines,newlines);
    }
    
}
