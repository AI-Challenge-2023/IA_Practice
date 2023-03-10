package com.aichallenge.practice;

import fr.emse.fayol.maqit.simulator.SimFactory;
import fr.emse.fayol.maqit.simulator.components.Obstacle;
import fr.emse.fayol.maqit.simulator.configuration.SimProperties;
import fr.emse.fayol.maqit.simulator.environment.GridManagement;

public class CustomSim extends SimFactory {
    public CustomSim(SimProperties sp, GridManagement env) {
        super(sp, env);
    }

    @Override
    public void createObstacle() {
        Obstacle obstacle = new Obstacle(idObstacle--, environment.getPlace());
        lobstacle.add(obstacle);
        addNewComponent(obstacle);
    }

    @Override
    public void createObstacle(int[] color) {
        Obstacle obstacle = new Obstacle(idObstacle--, environment.getPlace());
        lobstacle.add(obstacle);
        addNewComponent(obstacle, color);
    }

    @Override
    public void createTurtlebot() {
        CustomRobot bot = new CustomRobot(idRobot++, "Custom Bot", 1 /*view distance - fov */, 1, environment.getPlace(), 10, 10);
        bot.randomOrientation();
        lrobot.add(bot);
        addNewComponent(bot);
    }

    @Override
    public void createTurtlebot(int[] color) {
        CustomRobot bot = new CustomRobot(idRobot++, "Custom Bot", 1 /*view distance - fov */, 1, environment.getPlace(), 10, 10);
        bot.randomOrientation();
        lrobot.add(bot);
        addNewComponent(bot, color);
    }

    @Override
    public void schedule() {
        //todo
    }
}
