package org.misoenergy.hackday.kessel_run;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertTrue;


@RunWith(MockitoJUnitRunner.class)
public class PCGenExporterTest {


    PCGenExporter exporter;

    @Test
    void exporterExists() {
        exporter = new PCGenExporter();
    }

    @Test
    void exporterCreatesFileWhenNoneExists() {
        exporter = new PCGenExporter();
        File file = new File("sw5eClasses.lst");
        deleteFileIfExists(file);
        exporter.export(file);
        assertTrue(file.isFile());
    }

    @Test
    void exporterRecreatesFileWhenExists() throws IOException {
        exporter = new PCGenExporter();
        File file = new File("sw5eClasses.lst");

        deleteFileIfExists(file);
        createFileWithData(file);

        exporter.export(file);
        BufferedReader reader = new BufferedReader(new FileReader(file));

        assertTrue(reader.readLine() == null);

    }

    void deleteFileIfExists(File file) {
        if(!file.exists()) {
            file.delete();
        }
    }

    void createFileWithData(File file) throws IOException {
        FileWriter writer = new FileWriter(file);
        writer.write("If this exists when tested, Fail!");
        writer.close();
    }
}
