package int101.midterm;

public class Thuanchamnan {
    public static void main(String[] args) {
        Taspol taspol = new Taspol(50.0,60.0,70.0);
        Taspol thuan = new Taspol(10.0,20.0,30.0);
        System.out.println(taspol.toString());
        taspol.setMass(100.0);
        thuan.setVolume(200.0);
        System.out.println(taspol.toString());
        System.out.println(thuan.toString());

    }
}
