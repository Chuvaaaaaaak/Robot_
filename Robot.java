public class Robot {
    int x;
    int y;
    Direction dir;

    public Robot(int x, int y, Direction dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public Direction getDirection() {
        return dir;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        if (dir == Direction.UP) {
            dir = Direction.LEFT;
        } else if (dir == Direction.DOWN) {
            dir = Direction.RIGHT;
        } else if (dir == Direction.LEFT) {
            dir = Direction.DOWN;
        } else if (dir == Direction.RIGHT) {
            dir = Direction.UP;
        }
    }

    public void turnRight() {
        if (dir == Direction.UP) {
            dir = Direction.RIGHT;
        } else if (dir == Direction.DOWN) {
            dir = Direction.LEFT;
        } else if (dir == Direction.LEFT) {
            dir = Direction.UP;
        } else if (dir == Direction.RIGHT) {
            dir = Direction.DOWN;
        }
    }

    public void stepForward() {
        if (dir == Direction.UP) {
            y++;
        }
        if (dir == Direction.DOWN) {
            y--;
        }
        if (dir == Direction.LEFT) {
            x--;
        }
        if (dir == Direction.RIGHT) {
            x++;
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        for (int j = 0; j < 4; j++) {
            Direction tekPos = robot.getDirection();
            if (tekPos == Direction.DOWN) {
                for (int i = robot.getY(); i > toY; i--) {
                    robot.stepForward();
                }
            }
            if (tekPos == Direction.LEFT) {
                for (int i = robot.getX(); i > toX; i--) {
                    robot.stepForward();
                }
            }
            if (tekPos == Direction.UP) {
                for (int i = robot.getY(); i < toY; i++) {
                    robot.stepForward();
                }
            }
            if (tekPos == Direction.RIGHT) {
                for (int i = robot.getX(); i < toX; i++) {
                    robot.stepForward();
                }
            }
            robot.turnRight();
        }
    }
}