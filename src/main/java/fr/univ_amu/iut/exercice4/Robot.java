package fr.univ_amu.iut.exercice4;


public class Robot {
    private GridPosition gridPosition;
    private Orientation orientation;

    public Robot(GridPosition gridPosition, Orientation orientation) {
        this.gridPosition = gridPosition;
        this.orientation = orientation;
    }

    public GridPosition getGridPosition() {
        return gridPosition;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void turnRight() {
        if(this.orientation == Orientation.NORTH) {
            this.orientation = Orientation.EAST;
            return;
        }

        if(this.orientation == Orientation.EAST) {
            this.orientation = Orientation.SOUTH;
            return;
        }

        if(this.orientation == Orientation.SOUTH) {
            this.orientation = Orientation.WEST;
            return;
        }

        if(this.orientation == Orientation.WEST) {
            this.orientation = Orientation.NORTH;
            return;
        }


    }

    public void turnLeft() {

        if(this.orientation == Orientation.NORTH) {
            this.orientation = Orientation.WEST;
            return;
        }

        if(this.orientation == Orientation.EAST) {
            this.orientation = Orientation.NORTH;
            return;
        }

        if(this.orientation == Orientation.SOUTH) {
            this.orientation = Orientation.EAST;
            return;
        }

        if(this.orientation == Orientation.WEST) {
            this.orientation = Orientation.SOUTH;
            return;
        }

    }

    public void advance() {

        if(this.orientation == Orientation.NORTH) {
            this.gridPosition.setY(gridPosition.getY() + 1);
        }

        if(this.orientation == Orientation.SOUTH) {
            this.gridPosition.setY(gridPosition.getY() - 1);
        }

        if(this.orientation == Orientation.WEST) {
            this.gridPosition.setX(gridPosition.getX() - 1);
        }

        if(this.orientation == Orientation.EAST) {
            this.gridPosition.setX(gridPosition.getX() + 1);
        }

    }
}

