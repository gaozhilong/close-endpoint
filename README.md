# Getting Started

### 说明
一个简单的spring boot应用shutdown endpoint的应用
* 使用了一个spring容器关闭前执行资源回收的方法
* 增加了基本的权限过滤，当然只是过滤了shutdown节点的url
* 使用的是[Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/reference/htmlsingle/#production-ready)提供的关闭节点

