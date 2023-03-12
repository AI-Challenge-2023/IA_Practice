package com.aichallenge.practice;

import fr.emse.fayol.maqit.simulator.SimFactory;
import fr.emse.fayol.maqit.simulator.components.Obstacle;
import fr.emse.fayol.maqit.simulator.configuration.SimProperties;
import fr.emse.fayol.maqit.simulator.environment.GridManagement;

public class CustomSim extends SimFactory {
    private static int idObstacle = 0;

    public CustomSim(SimProperties sp, GridManagement env) {
        super(sp, env);
    }

    @Override
    public void createObstacle() {
//        Obstacle obstacle = new Obstacle(idObstacle++, environment.getPlace());
//        lobstacle.add(obstacle);
//        addNewComponent(obstacle);

        Obstacle obstacle = new Obstacle(idObstacle--, environment.getPlace());
        lobstacle.add(obstacle);
        addNewComponent(obstacle, new int[]{0, 0, 0});
    }

    @Override
    public void createObstacle(int[] ints) {
        Obstacle obstacle = new Obstacle(idObstacle++, ints);
        lobstacle.add(obstacle);
        addNewComponent(obstacle);
    }

    @Override
    public void createTurtlebot() {

    }

    @Override
    public void createTurtlebot(int[] ints) {

    }

    @Override
    public void schedule() {

    }

    public int getRows() {
        return environment.getRows();
    }

    public int getColumns() {
        return environment.getColumns();
    }
}
