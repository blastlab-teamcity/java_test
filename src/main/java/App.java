public class App {
    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.printHello());
        System.out.println(app.printUntestedMethod());
    }

    public String printHello() {
        return "Hello World!!!";
    }

    public String printUntestedMethod() {
        return "lorem";
    }

    public void someMethod() {
        int i;
        for (i = 0; i < 10; i++) {
            printHello();
        }
    }

    public void someDuplicatedMethod() {
        int i;
        for (i = 0; i < 10; i++) {
            printHello();
        }
    }
}
