# SpringBootMoon
spring boot test project


### 预启动
1. mysql数据库
2. redis  
启动redis server(进入目录D:\DevProgrm\Redis-x64-3.2.100)：redis-server.exe [redis.conf]  
客户端：redis-cli.exe [-h 192.168.10.61 -p 6379]  


### 启动方式  

1. 直接启动@SpringBootApplication的main
1. 进入工程目录， mvn spring-boot:run
1. mvn install;  进入工程target目录;  java -jar *****.jar [--spring.profiles.active=prod]

### 相关注解
* 请求注解  
* @Controller
* @ResponseBody
* @RestController
* @RequestMapping（@GetMapping等组合注解）
* 参数注解
* @PathVariable  参数包含在url里，是url的一部分
* @RequestParam  老的url里的参数url?param=''，可配置是否必传以及默认值required/defaultValue
