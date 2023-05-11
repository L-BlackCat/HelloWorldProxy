public class Main {
    public static void main(String[] args) {
//        char c = 46;
//        System.out.println(c);
        System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        IHelloWorld service = new HelloWorldService();
        //  动态代理代理的是接口类，而不是接口类的实现类或者抽象类
        IHelloWorld proxy = (IHelloWorld) RPCProxyClient.getProxy(service);
        proxy.sayHello("text");

        /*
        *   LFM 并不能完成远程计算机（A）调用另一个远程计算机上(B)的某个对象（m），就像调用本地程序中的对象一样，A计算机上需要知道B计算机上的对象结构
        *    *完成这些是透明化远程服务调用吗？  通信双方了解彼此的数据模型
        * */

    }
}