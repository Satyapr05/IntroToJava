import java.util.Scanner;

public class Problem1 {
    public static int area(int length,int  breath){

        return length * breath;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length :");
        int length = sc.nextInt();
        System.out.println("Enter breadth :");
        int breath = sc.nextInt();

        System.out.println("Erea of the rectangle:" + area(length, breath));

    }
}
