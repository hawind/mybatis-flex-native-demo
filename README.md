# mybatis-flex-native-demo

## 使用版本
- spring boot 3.3.5
- mybatis-flex 1.10.1
- native-maven-plugin 0.10.3

此项目基于 Mybatis Flex 构建，主要是通过native-maven-plugin编译成native执行文件

主要是基于 https://github.com/mybatis/spring-boot-starter/wiki/MyBatisNativeConfiguration.java 配置文件修改而来
- 目前只是基本可以编译通过和运行更多的Mybatis Flex支持未测试

## 使用方法

1. 先打出jar包后执行
```cmd
java -agentlib:native-image-agent=config-output-dir=META-INF/native-image -jar target/your-app.jar
```
然后将META-INF/native-image的放入src/resources中

2. 构建native