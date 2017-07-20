# SpringBootMoon
spring boot test project


### 预启动
1. mysql数据库
2. redis  
启动redis server：redis-server.exe [redis.conf]  
客户端：redis-cli.exe [-h 192.168.10.61 -p 6379]  


### 启动方式  

1. 直接启动@SpringBootApplication的main
1. 进入工程目录， mvn spring-boot:run
1. mvn install;  进入工程target目录;  java -jar *****.jar [--spring.profiles.active=prod]