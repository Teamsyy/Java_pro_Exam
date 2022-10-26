package FinalExam;

public class Q02StaticVariable {

    static final double ACRE = 2.529;
    public static void main(String[] args) {
        double acre = 55.0;
        double rai = 55.0;

        System.out.println(acre+" acre ="+ tas(acre,rai)+ " rai");
        System.out.println(rai+" rai ="+ mnan(rai,acre)+ " acre");
    }

    public static double tas(double acre ,double rai){
        rai = acre * ACRE;
        return rai;

    }
    public static double mnan(double acre ,double rai){
        acre = rai / ACRE;
        return acre;
    }
}
