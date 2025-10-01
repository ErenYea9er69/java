package uni.tp1;

public class HelloWorldWithMethodAndArg {
    public void Hello(String arg) {
        System.out.println(arg);
    }

    public static void main(String[] args) {
        HelloWorldWithMethodAndArg s = new HelloWorldWithMethodAndArg();
        s.Hello("Bonjour");
    }
}