import java.util.Scanner;

class Main {


    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter firstname" );
        String firstName = myObj.nextLine();

        System.out.println("enter secondName");
        String secondName=myObj.nextLine();
        System.out.println("Enter thirdName");
        String thirdName= myObj.nextLine();
        System.out.println("Enter age");
        int age=myObj.nextInt();


        System.out.println("your full name is:"+firstName+ "    "+secondName+ "   "+thirdName+"And your this is your age"+" "+age);




    }
}