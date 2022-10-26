package FinalExam;

public class Q01StaticMethod {

    public static void main(String[] args) {
        double meter = 55.0;
        double wah = 55.0;
        double yards = 55.0;
        System.out.println(meter+"meter ="+Taspol(meter,wah)+"wah");
        System.out.println(yards+"yards ="+Thuanchamnan(meter,yards)+"wah");


    }
    private static double Taspol(double meter, double wah){
        wah = wah * 0.5;
        return wah;
    }

    private static double Thuanchamnan(double meter ,double yards){

        yards = yards * 0.91;
        return yards;
    }


}
