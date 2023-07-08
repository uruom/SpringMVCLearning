# SpringMVC

ssm: mybatis + Spring + SpringMVC	MVC架构：

JavaSE：认真学习，老师带，入门快

JavaWeb：认真学习，老师带，入门快

SSM框架：研究官方文档，锻炼自学能力，锻炼笔记、项目能力



SpringMVC + VUE + SpringBoot + SpringBoot + SpringCloud + Linux



SSM = JavaWeb做项目；



Spring ： IOC 和 AOP



SpringMVC： SpringMVC的执行流程



SpringMVC：SSM框架整合



重点听理解而不是抄一遍



MVC 模型（dao，service），视图（jsp） 控制器（servlet）



dao

service

servlet	: 转发，重定向

jsp/html



前端 数据传输 实体类

实体类：用户名，密码，生日，爱好……20

前端：用户名 密码



pojo：User

vo：视图层对象UserVo

dto：传输对象



### 两个时代

**Model1**

JSP 本质是Servlet

**Model2**

Controller

Model

Web



假设：你的项目的架构，是设计好的，还是演进的？

- Alibaba PHP
- 随着用户大， Java
- 王坚 去  IOE MySQL
- MySQL ：MySQL--> AliSQL AliRedis
- All in one ---> 微服务


全栈  ：后台+前端+数据库+运维
前端：后台+前端

MVP 

MVC:

MVVM: M V VM(ViewModel):双向绑定 


### 为什么学习SpringMVC
1. 轻量级，简单易学
2. 高效，不需要太多依赖，基于请求与响应的MVC框架
3. 与Spring兼容性好，与Spring无缝结合
4. 约定优于配置
5. 功能强大，RESTful、数据验证、格式化、本地化、主题
6. 简单灵活

使用的人多


Spring大杂烩，我们可以讲SpringMVC中放入Spring

```xml
  <build>
    <resources>
        <resource>
            <directory>src/main/java</directory>
            <includes>
                <include>**/*.properties</include>
                <include>**/*.xml</include>
            </includes>
            <filtering>false</filtering>
        </resource>
        <resource>
            <directory>src/main/resources</directory>
            <includes>
                <include>**/*.properties</include>
                <include>**/*.xml</include>
            </includes>
        </resource>
    </resources>
</build>
```

我们可以讲SpringMVC中所有要用到的bean，注册到Sprinng中
```
@Component  组件
@Servicec   service
@Controller controller
@Repository repository都是组件
```

先访问类再访问方法，但是一般不建议，一般在函数上直接写死，不要写在类上

### RestFul风格
是个样式，

localhost:8080/method?add=&

restful风格是以斜线分割，不易add等来
资源定位及资源操作的风格，不是标准也不是协议
功能
- 资源：互联网所有的食物都可以被抽象为资源
- 资源操作：使用POST，DELETE，PUT，GET
- 分别对应添加，删除，修改，查询

restful风格可以通过不同的请求方式来实现不同的效果，请求地址

报错ambious 模棱两可的，有多个方法可以执行
```
LinkedHashMap
|
ModeMap:继承了LinkedHashMap，所以他拥有LInkedHashMap的全部功能

Model：精简版（大部分情况，我们都直接使用Model）

ModelAndView 可以在存储数据的同时，设置返回的逻辑视图，进行控制层的跳转
```

前后端分离时代，
后端部署后端，提供接口，提供数据（Controller就是接口）
                |
建立连接，约定，json，一种数据格式（JavaScript Object Notion ）
                |
前端独立部署，负责渲染后端的数据

是一个字符串，完全独立于编程语言的文本格式，小，能够提供网络传输效率



Ajax
异步无刷新请求：无需重新加载整个网页的情况下，能够更新部分网页的技术
可以实现局部更新

type xhr：Ajax请求
Ajax 交互性极强，辅助搜索
