package org.misoenergy.hackday.kessel_run;

import java.io.File;
import java.io.IOException;

public class PCGenExporter {

    public PCGenExporter() {
    }

    public void export(File file) {
        try {
            createOutputFile(file);
        } catch (IOException e) {
            handleFailedOutput(e);
        }
    }

    private void createOutputFile(File file) throws IOException {
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists. Deleting and re-running");
            file.delete();
            createOutputFile(file);
        }
    }

    private void handleFailedOutput(Exception e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
}
