//Creating a class name "flag"
public class flag {
    //Creating a main method
    public static void main(String[] args) {
        String f1 = "* * * * * * ================================== \n * * * * * ===================================";
        String f2 = "==============================================";
        String f3 = "* * * * * * ==================================";


        for (int i = 0; i<4; i++) {
            System.out.println(f1);
        }
        System.out.println(f3);

        for (int i = 0; i <6; i++) {
            System.out.println(f2);
        }
    }
}