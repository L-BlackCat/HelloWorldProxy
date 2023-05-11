public class HelloWorldService implements IHelloWorld {
    @Override
    public void sayHello(String name) {
        System.out.println("hello world! welcome to China...");
    }

    @Override
    public void sayBye() {
        System.out.println("bye!");
    }
}
