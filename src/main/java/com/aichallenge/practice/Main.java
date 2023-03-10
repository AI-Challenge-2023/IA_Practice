package com.aichallenge.practice;

import fr.emse.fayol.maqit.simulator.configuration.IniFile;
import fr.emse.fayol.maqit.simulator.configuration.SimProperties;
import fr.emse.fayol.maqit.simulator.environment.ColorCell;
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

        ColorCell.defaultcolor = new int[]{255, 255, 255}; //default white
        CustomSim customSim = new CustomSim(properties,new GridManagement(99, 10, 10, "Custom Sim", 50, 50, 500, 500, 1));
        customSim.createObstacle(new int[]{0,0,0}); //obstacles black
        customSim.createObstacle(new int[]{0,0,0});
        customSim.createTurtlebot(new int[]{0,0,255}); //robots blue
        customSim.createTurtlebot(new int[]{0,0,255});
    }
}