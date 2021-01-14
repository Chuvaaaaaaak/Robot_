
public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(-10, -10, Direction.DOWN);
        robot.moveRobot(robot, 10, 20);
        System.out.println(robot.getX() + ", " + robot.getY());
    }
}
