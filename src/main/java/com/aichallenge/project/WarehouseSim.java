package com.aichallenge.project;


import com.aichallenge.project.robot.StockRobot;
import fr.emse.fayol.maqit.simulator.SimFactory;
import fr.emse.fayol.maqit.simulator.components.Obstacle;
import fr.emse.fayol.maqit.simulator.components.Turtlebot;
import fr.emse.fayol.maqit.simulator.configuration.SimProperties;
import fr.emse.fayol.maqit.simulator.environment.GridManagement;
import fr.emse.fayol.maqit.simulator.robot.GridTurtlebot;

public class WarehouseSim extends SimFactory {
    public WarehouseSim(SimProperties sp, GridManagement env) {
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
        StockRobot bot = new StockRobot(idRobot++, "Custom Bot", 1 /*view distance - fov */, 1, environment.getPlace(), 10, 10);
        bot.randomOrientation();
        lrobot.add(bot);
        addNewComponent(bot);
    }

    @Override
    public void createTurtlebot(int[] color) {
        StockRobot bot = new StockRobot(idRobot++, "Custom Bot", 1 /*view distance - fov */, 1, environment.getPlace(), 10, 10);
        bot.randomOrientation();
        lrobot.add(bot);
        addNewComponent(bot, color);
    }

    @Override
    public void schedule() { //for each step of the simulation
        for (Turtlebot robot : lrobot) { //go through every bot
            if (robot instanceof GridTurtlebot gRobot) { //required to be able to call the .updatePerception method from StockRobot
                gRobot.updatePerception(gRobot.getPerception());
            }

            int[] locationBeforeMove = robot.getLocation();

            robot.move(1);

            //Update the info of the grid
            environment.moveComponent(locationBeforeMove, robot.getLocation(), robot.getId() /*field used to double-check that the robot is at the provided location*/);
        }


    }
}
