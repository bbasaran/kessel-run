package org.misoenergy.hackday.kessel_run;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.misoenergy.hackday.kessel_run.class_definitions.CharacterClass;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

@RunWith(JUnit4.class)
public class PCGenConverterTests {

    @Test
    void convertToPCGen() {
        File pcGenOutput = new File("sw5eEquipment.lst");
        List<CharacterClass> classes = new ArrayList<CharacterClass>();

        PCGenConverter converter = new PCGenConverter();
        File pcgenFile = converter.convertToPCGen(classes);

        assertTrue(pcgenFile.isFile());
    }

    @Test
    void converterWritesCharacterClassesToFile() throws IOException {
        File pcGenOutput = new File("sw5eEquipment.lst");
        List<CharacterClass> classes = createTestCharacterClasses();

        PCGenConverter converter = new PCGenConverter();
        File pcgenFile = converter.convertToPCGen(classes);

        BufferedReader reader = new BufferedReader(new FileReader(pcgenFile));
        assertTrue(reader.readLine().contains("Test Class"));
        reader.close();
    }

    List<CharacterClass> createTestCharacterClasses() {
        List<CharacterClass> characterClasses = new ArrayList<CharacterClass>();

        CharacterClass testClass = new CharacterClass();
        testClass.setArchetypes("Archetype1");
        testClass.setName("Test Class");
        testClass.setSummary("This is a test class");


        characterClasses.add(testClass);
        return characterClasses;
    }

    FileReader readPCGenFile(File file) throws FileNotFoundException {
            return new FileReader(file);
    }

}
