package com.klu;
import java.util.*;

public class MessageControlledRobotMovement {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int x, y;
        x = sr.nextInt();
        y = sr.nextInt();
        String curr, specified;
        curr = sr.next();
        specified = sr.next();

        String result = moveRobot(x, y, curr, specified);
        System.out.println(result);
    }

    public static String moveRobot(int x, int y, String curr, String specified) {
        int xx = Integer.parseInt(curr.split("-")[0]);
        int yy = Integer.parseInt(curr.split("-")[1]);
        String d = curr.split("-")[2];
        String msg[] = specified.split(" ");

        for (int i = 0; i < msg.length; i++) {
            int x1 = xx;
            int y1 = yy;
            String d1 = d;

            if (msg[i].equals("M")) {
                if (d.equals("E")) {
                    xx++;
                } else if (d.equals("W")) {
                    xx--;
                } else if (d.equals("N")) {
                    yy++;
                } else {
                    yy--;
                }
            } else if (msg[i].equals("L")) {
                if (d.equals("E")) {
                    d = "N";
                } else if (d.equals("W")) {
                    d = "S";
                } else if (d.equals("N")) {
                    d = "W";
                } else if (d.equals("S")) {
                    d = "E";
                }
            } else if (msg[i].equals("R")) {
                if (d.equals("E")) {
                    d = "S";
                } else if (d.equals("W")) {
                    d = "N";
                } else if (d.equals("N")) {
                    d = "E";
                } else if (d.equals("S")) {
                    d = "W";
                }
            }

            // Check if the new position is out of bounds
            if (xx > x || xx < 0 || yy > y || yy < 0) {
                // Return the last valid position with "-ER" appended
                return x1 + "-" + y1 + "-" + d1 + "-ER";
            }
        }

        // Return the final position and direction
        return xx + "-" + yy + "-" + d;
    }
}
