package org.misoenergy.hackday.kessel_run;

import org.junit.jupiter.api.Test;
import org.misoenergy.hackday.kessel_run.class_definitions.CharacterClass;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

@SpringBootTest
public class PCGenConverterTests {

    @Test
    void convertToPCGen() {
        File pcGenOutput = new File("sw5eClasses.lst");
        List<CharacterClass> classes = new ArrayList<CharacterClass>();
        File pcgenFile = PCGenConverter.convertToPCGen(classes);

        assertTrue(pcgenFile.isFile());
    }

}
