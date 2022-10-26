package int101.midterm;

public class Taspol {
        double mass;
        double volume;
        double density;


    public Taspol(double mass, double volume, double density) {
        this.mass = mass;
        this.volume = volume;
        this.density = density;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    @Override
    public String toString() {
        return "Taspol{" +
                "mass=" + mass +
                ", volume=" + volume +
                ", density=" + density +
                '}';
    }

}


