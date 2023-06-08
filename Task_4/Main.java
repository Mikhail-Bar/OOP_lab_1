package Task_4;

import by.vsu.mf.ai.ssd.painting.Painter;

public class Main {
    public static void main(String[] args) {
        double dPhi = Double.parseDouble(args[0]);
        double[][][] coords = genCords(dPhi);
        short[][] colors = getColor(coords.length);
        int width = 800;
        int height = 800;
        Painter.paint(width, height, coords, colors);
    }

    private static double[][][] genCords(double deltaPhi) {
        double[][][] coords = new double[(int) (2 * Math.PI / deltaPhi) + 1][][];

        double phi = 0;
        int index = 0;

        while (phi <= 2 * Math.PI) {
            double r1 = 1 - (2.0 / 3.0) * Math.pow(Math.sin(2 * (Math.cos(phi / 2))),2);
            double r2 = 0.5;
            double x1 = r1 * Math.cos(phi);
            double y1 = r1 * Math.sin(phi);
            double x2 = r2 * Math.cos(phi);
            double y2 = r2 * Math.sin(phi);
            coords[index] = new double[][]{{x1, y1}, {x2, y2}};
            phi += deltaPhi;
            index++;
        }

        return coords;
    }

    private static short[][] getColor(int num) {
        short[][] colors = new short[num][3];

        for (int i = 0; i < num; i++) {
            colors[i][0] = 255;
            colors[i][1] = 0;
            colors[i][2] = 0;
        }

        return colors;
    }
}
