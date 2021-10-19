package week7;

public class Prog11Divided {

    public static void main(String[] args) {
        System.out.println("\n divided /3");
        for (int i = 1; i < 100; i++) {
            if(i%3==0)
            System.out.println(i +", ");
        }
        System.out.println("\n divided /5");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0)
                System.out.println(i + ", ");
        }
        System.out.println("\n\ndivided by 3 & 5");
        for(int i=1; i<100; i++){
            if (i%3==0 && i%5==0) System.out.print(i +", ");
        }
        System.out.println("\n");
    }
}