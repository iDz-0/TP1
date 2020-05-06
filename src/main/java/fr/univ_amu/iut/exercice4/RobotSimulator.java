package fr.univ_amu.iut.exercice4;

import java.util.ArrayList;
import java.util.List;

import static fr.univ_amu.iut.exercice4.Movement.getMovement;

public class RobotSimulator {
    private Robot robot;
    private String instructions;

    public RobotSimulator(Robot robot, String instructions) {
        this.robot = robot;
        this.instructions = instructions;
    }

    public void simulate() {
        for(int i = 0; i < this.instructions.length(); ++i) {
            if(this.instructions.charAt(i) == 'A') {
                this.robot.advance();
            }

            if(this.instructions.charAt(i) == 'R') {
                this.robot.turnRight();
            }

            if(this.instructions.charAt(i) == 'L') {
                this.robot.turnLeft();
            }

        }
    }

    public List<Movement> getMovements() {

        List<Movement> movements = new ArrayList<>();

        for(int i = 0; i < this.instructions.length(); ++i) {

            if(this.instructions.charAt(i) != ' ') {
                movements.add(getMovement(this.instructions.charAt(i)));
            }

        }

        return movements;
    }
}
