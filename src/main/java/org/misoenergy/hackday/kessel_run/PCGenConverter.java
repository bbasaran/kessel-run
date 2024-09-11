package org.misoenergy.hackday.kessel_run;

import org.misoenergy.hackday.kessel_run.class_definitions.CharacterClass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PCGenConverter {

    public File convertToPCGen(List<CharacterClass> classes) {
        File pcGenOutput = new File("sw5eEquipment.lst");
        FileWriter writer = setupFileWriter(pcGenOutput);

        classes.stream().forEach((CharacterClass charClass) -> {
            try {
                writer.write(charClass.getArchetypes());
                writer.write(charClass.getName());
                writer.write(charClass.getSummary());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        PCGenExporter exporter = new PCGenExporter();
        exporter.export(pcGenOutput);
        return pcGenOutput;
    }

    protected FileWriter setupFileWriter(File file) {
        FileWriter writer = null;

        try {
            writer = new FileWriter(file);
        } catch (IOException e) {
            handleFailedFileWriter(e);
        }

        return writer;
    }

    private void handleFailedFileWriter(Exception e) {
        System.out.println("Unable to Write to File");
        e.printStackTrace();
    }

}
