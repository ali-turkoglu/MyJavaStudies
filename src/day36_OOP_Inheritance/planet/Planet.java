package day36_OOP_Inheritance.planet;

public class Planet {

    public String name;
    public double mass, radius, surfaceGravity, surfaceArea;
    public long volume;
    public long population;

    public Planet(String name, double mass, double radius, double surfaceGravity, double surfaceArea, long volume, long population) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = surfaceGravity;
        this.surfaceArea = surfaceArea;
        this.volume = volume;
        this.population = population;
    }

    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                "kg, radius=" + radius +
                "km, surfaceGravity=" + surfaceGravity +
                "m/s², surfaceArea=" + surfaceArea +
                "million km², volume=" + volume +
                "1010 km3, population=" + population +
                '}';
    }
}
