import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class RPCProxyClient implements InvocationHandler {
    /*
    * 1.实现InvocationHandler接口创建自己的代理客户端
    * 2.通过对Proxy类指定一个classLoader对象、Interface数组类、代理对象来创建动态代理类
    * 3.通过反射机制获得动态代理类的构造函数，其唯一函数类型 是调用处理器接口类型
    * 4.通过构造函数创建动态代理类实例，构造时调用处理器对象作为参数传入
    * */
    private Object obj;

    public RPCProxyClient(Object obj) {
        this.obj = obj;
    }

    //得到被代理的对象
    public static Object getProxy(Object obj){
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),new RPCProxyClient(obj));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //  结果参数

        //  执行通信相关逻辑


       //   执行方法
        System.out.println("Before invoke "  + method.getName());
        method.invoke(obj, args);
        System.out.println("After invoke " + method.getName());

        return null;
    }
}
