### Backend Tigo Orquestador Network
###### Version 1.0

Servicios REST para Tigo Orquestador Network.

## Configuration
- Spring Boot 2.7.1
- Java 1.8 
- Maven 3.6.3

## Dependencies
- JPA
- Web
- AOP

## Usage
#### Clone repository
```
git clone https://gitlab-bsd.tigo.com.gt/BSD-APPS/Instalaciones-Tecnicas/integradortivoli_click_2_0/src.git
```
#### Project information
```
    <groupId>gt.com.tigo</groupId>
    <artifactId>orquestador-network-api</artifactId>
    <version>1.0</version>
    <packaging>war</packaging>
    <name>orquestador-network-api</name>
    <description>Tigo Orquestador Network API</description>
```
#### Base package
```
    gt.com.tigo.orquestadornetwork
```
#### Main class
```
    public class OrquestadorNetworkApplication extends SpringBootServletInitializer implements WebApplicationInitializer {
        ...
    }
```
#### Main class path
```
    <project-path>/src/main/java/gt/com/tigo/orquestadornetwork/OrquestadorNetworkApplication.java
```
#### Weblogic configuration
```
    <wls:context-root>/orquestador-network-api</wls:context-root>
```
#### Build
```
mvn package
```
##### API Documentation
```
N/A
``` 
