# RESTful microPoS 


请参考spring-petclinic-rest/spring-petclinic-microserivces 将aw04的webpos项目改为rest风格的微服务架构
（至少包含产品管理服务pos-products和购物车管理服务pos-carts以及discovery/gateway等微服务架构下需要的基础设施服务）。具体要求包括：

1. 请使用OpenAPI的定义每个服务的rest接口（参考pos-products）
2. 请使用ehcache管理缓存；
3. 请注意使用断路器等机制；
4. 有兴趣的同学可自学一些reactjs或vuejs等为microPoS开发一个前端。

实现了pos-carts，pos-products，pos-gateway，pos-discovery四个微服务

其中pos-gateway作为网关调用pos-carts与pos-products

pos-products实现了查看所有product，查询特定id的product两个接口，分别为/api/products,api/products/{productId}，这两个接口都通过ehcache框架进行缓存

pos-carts实现了查看当前cart，向购物车内添加Item两个接口，分别为/api/cart,api/cart/add/{productId}，其中add方法通过Restful风格的接口调用pos-producs微服务，并配置有断路器，在无响应时返回预先定义好的错误信息

