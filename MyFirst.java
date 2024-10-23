public class MyFirstClass {
    public static void main(String... args) {
        System.out.println("Hello, " + args[0]);
        System.out.println(GenerateMessage.getMessage());
        System.out.println(AnotherMessage.getMessage());
    }
}

class GenerateMessage {
    static String getMessage() {
        return "Hello this is generated message";
    }
}

class AnotherMessage {
    static String getMessage() {
        return "This is another message";
    }
}
