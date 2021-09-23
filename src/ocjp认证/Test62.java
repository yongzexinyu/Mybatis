package ocjp认证;

import java.util.Arrays;

public class Test62 {
    public String name;

    @Override
    public String toString() {
        return "Test62{" +
                "name='" + name + '\'' +
                ", moons=" + moons +
                '}';
    }

    public int moons;
    public Test62(String name, int moons) {
        this.name = name;
        this.moons = moons;
    }


    public static void main(String[] args) {
        Test62[] planets = {
                new Test62("Mercury", 0),
                new Test62("Venus", 0),
                new Test62("Earth", 1),
                new Test62("Mars", 2),
        };
        System.out.println(planets);
        System.out.println("Arrays.toString(planets) = " + Arrays.toString(planets));
        System.out.println(planets[2]);
        System.out.println(planets[2].moons);

        int[] b={1,2,3};
        System.out.println("b = " + Arrays.toString(b));

    }

}
