package lwy.study.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory1 {
    private TrainStation trainStation = new TrainStation();
    public SellTickets getProxyObject() {
        //使用Proxy获取代理对象
        SellTickets sellTickets = (SellTickets)
                Proxy.newProxyInstance(trainStation.getClass().getClassLoader(),
                        trainStation.getClass().getInterfaces(),
                        new InvocationHandler() {
                            @Override
                            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                                System.out.println("代售点加收 5 元服务费(JDK动态代理方式)");
                                //执行真实对象
                                Object result = method.invoke(trainStation , args);
                                return result;
                            }
                        });
        return sellTickets;
    }
}
