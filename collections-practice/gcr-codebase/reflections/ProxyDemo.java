import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
interface Greeting {
    void sayHello();
}
class GreetingImpl implements Greeting {

    public void sayHello() {
        System.out.println("Hello, welcome!");
    }
}


class LoggingHandler implements InvocationHandler {

    private Object target;

    public LoggingHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // Log before method execution
        System.out.println("Calling method: " + method.getName());

        // Call actual method
        return method.invoke(target, args);
    }
}


public class ProxyDemo {
    public static void main(String[] args) {

        Greeting realObject = new GreetingImpl();

        Greeting proxyObject = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingHandler(realObject)
        );

        proxyObject.sayHello();   // intercepted
    }
}
