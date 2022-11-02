import java.util.Scanner;
public class Chalenge {
    public static String sayHello (String name){
        return "Hello, " +name;
    }
    public static String sayHello(){
     return "Hello, there!";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        System.out.println("Digite o seu nome");
        name = in.nextLine();,
        if (name.length() == 0){
            System.out.println(sayHello(name));
        } else
            System.out.println(sayHello());
    }
}
