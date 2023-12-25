package allExlamples.presentation2;
//Convert temperatures between 20 degrees and 35 degrees to Fahrenheit.

public class Exlamples2 {
    public static void main(String[] args) {
        for(int c=20;c<=35;c++){
            double f=(c*1.8)+32;
            System.out.println(c+" degree "+f+" fahrenheit.");
        }
    }
}
