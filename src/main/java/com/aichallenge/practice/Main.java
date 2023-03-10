package com.aichallenge.practice;

import fr.emse.fayol.maqit.simulator.configuration.IniFile;
import fr.emse.fayol.maqit.simulator.configuration.SimProperties;
import fr.emse.fayol.maqit.simulator.environment.GridManagement;

public class Main {
    public static void main(String[] args) {
        IniFile file;

        try {
            file = new IniFile("configuration.ini");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        SimProperties properties = new SimProperties(file);
        properties.initMQTT();
        properties.displayParams();
        properties.simulationParams();
        CustomSim customSim = new CustomSim(properties,new GridManagement(3,10,10,1));

    }
}