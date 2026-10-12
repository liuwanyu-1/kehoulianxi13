# 课后练习13：手写动态代理卖票

用 JDK 动态代理和 CGLib 动态代理模拟火车站卖票（不依赖 Spring 配置，纯 Java 反射实现）。

## 结构
- `SellTickets`：抽象角色，卖票接口
- `TrainStation`：真实角色，火车站，实现卖票
- `ProxyFactory1`：JDK 动态代理，`Proxy.newProxyInstance` + `InvocationHandler`
- `ProxyFactory2`：CGLib 动态代理，`Enhancer` + `MethodInterceptor`（使用 Spring 内置的 `org.springframework.cglib`）
- `Client`：测试入口，分别调用两种代理

## 运行
运行 `Client.main`，输出：
```
代售点加收 5 元服务费(JDK动态代理方式)
火车站售出一张 G2794 次黄梅东开往合肥南的高铁票（7车16F）
代售点加收 5 元服务费(CGLIB动态代理方式)
火车站售出一张 G2794 次黄梅东开往合肥南的高铁票（7车16F）
```
