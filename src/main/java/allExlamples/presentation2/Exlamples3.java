package allExlamples.presentation2;
//Create a multiplication table with 10 columns and 5 rows.

public class Exlamples3 {
    public static void main(String[] args) {
        for(int i =1;i<=5;i++){
            for (int j=1;j<=10;j++){
                int a=i*j;
                System.out.print("   "+a+"   ");

            }
            System.out.println();
        }
    }
}
