package org.misoenergy.hackday.kessel_run;

import org.misoenergy.hackday.kessel_run.class_definitions.CharacterClass;

import java.io.File;
import java.util.List;

public class PCGenConverter {

    public static File convertToPCGen(List<CharacterClass> classes) {
        File pcGenOutput = new File("sw5eClasses.lst");
        PCGenExporter exporter = new PCGenExporter();
        exporter.export(pcGenOutput);
        return pcGenOutput;
    }

}
