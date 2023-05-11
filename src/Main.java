import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        IHelloWorld service = new HelloWorldService();
        InvocationHandler handler = new RPCProxyClient(service);
        IHelloWorld proxy = (IHelloWorld) Proxy.newProxyInstance(service.getClass().getClassLoader(), service.getClass().getInterfaces(), handler);
        proxy.SayHello("text");
    }
}