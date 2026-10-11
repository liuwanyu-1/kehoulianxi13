package lwy.study.proxy;

public class Client {
    public static void main(String[] args) {

        //动态代理
        ProxyFactory1 proxyFactory = new ProxyFactory1();
        proxyFactory.getProxyObject().sell();
        //CGLIB动态代理
        ProxyFactory2 proxyFactory2 = new ProxyFactory2();
        proxyFactory2.getProxyObject().sell();
    }
}
