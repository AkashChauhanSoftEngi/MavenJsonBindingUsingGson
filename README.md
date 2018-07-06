# MavenJsonBindingUsingGson

* Maven + Json + Gson + Binding
* Helpful in Data binding when using Rest end points
* By using com.google.gson.Gson;
```java
	Gson.toJson(POJO) and Gson.fromJson(json, POJO.class);
```
> **###1. Technologies**
* Maven 3.1
* gson 2.8.5
```xml
<!-- https://mvnrepository.com/artifact/com.google.code.gson/gson -->
<dependency>
	<groupId>com.google.code.gson</groupId>
	<artifactId>gson</artifactId>
	<version>2.8.5</version>
</dependency>
```

> **###2. To Run this project locally**
* $ git clone https://github.com/AkashChauhanSoftEngi/MavenJsonBindingUsinGson
* $ mvn tomcat7:run
