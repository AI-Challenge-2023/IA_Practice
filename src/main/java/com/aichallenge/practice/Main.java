package com.aichallenge.practice;

import fr.emse.fayol.maqit.simulator.configuration.IniFile;
import fr.emse.fayol.maqit.simulator.configuration.SimProperties;

public class Main {
    public static void main(String[] args) {
        try {
            IniFile file = new IniFile("configuration.ini");
            SimProperties properties = new SimProperties(file);
            properties.initMQTT();
            properties.displayParams();
            properties.simulationParams();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}