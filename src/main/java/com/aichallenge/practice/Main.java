package com.aichallenge.practice;

import fr.emse.fayol.maqit.simulator.configuration.IniFile;
import fr.emse.fayol.maqit.simulator.configuration.SimProperties;
import fr.emse.fayol.maqit.simulator.environment.ColorCell;
import fr.emse.fayol.maqit.simulator.environment.GridManagement;


public class Main {
    public static void main(String[] args) throws InterruptedException {
//        IniFile file;
//        try {
//            file = new IniFile("configuration.ini");
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//        SimProperties properties = new SimProperties(file);
//        properties.initMQTT();
//        properties.displayParams();
//        properties.simulationParams();
//        ColorCell.defaultcolor = new int[]{255, 255, 255};
//        CustomSim customSim = new CustomSim(properties,new GridManagement(99, 50, 50, "Custom Sim", 50, 50, 1000, 1000, 1));
//        customSim.createObstacle();
//        customSim.createObstacle();

        IniFile myConfig;
        try {
            myConfig = new IniFile("configuration.ini");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        SimProperties mySim = new SimProperties(myConfig);
        mySim.initMQTT();
        mySim.displayParams();
        mySim.simulationParams();
//        System.out.println("mqtt = " + mySim.mqtt);
        ColorCell.defaultcolor = new int[]{0,0,0};
        CustomSim myGrid = new CustomSim(mySim, new GridManagement(4, 10, 10, "Custom Sim", 0, 0, 500, 500, 1));
        myGrid.createObstacle();
        myGrid.createObstacle();
//        Robot myRobot = new Robot(1,1, new int[2], myGrid.getRows(), myGrid.getColumns() );
//        System.out.println("Name = " + myRobot.getName());
        myGrid.createTurtlebot();
//        myGrid.moveRobot(1, 0);

        for (int i = 0; i < 4; i++){
            Thread.sleep(1000);
            myGrid.schedule();
        }
    }
}