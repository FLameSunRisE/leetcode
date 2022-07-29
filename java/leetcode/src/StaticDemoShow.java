class StaticDemo {

    static int a = 3;
    static int b = 4;

    static {
        System.out.println("Voila! Static block put into action");
    }

    static void show() {
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }

}

public class StaticDemoShow {
    public static void main() {
        StaticDemo.show();
    }
}