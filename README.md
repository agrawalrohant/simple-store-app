# simple-store-app
Simple Store Info App allows user to perform CRUD (Create, Read, Update and Delete) operations on Store Object. 
It uses tools/framework such as below - 
- Maven - as a Build tool to resolve Spring and JUnit dependency and crete a Jar and War file for Service and Web project respectively. It also has parent pom.xml to have multi-module level project.
- Spring - uses Spring-context and spring-web for bean creation and commincating over the web http methods such as GET, POST, PUT and DELETE. 
- Servlet - helps UI to communicate with the BO (Business Object) Layer.

## Getting Started
If you have the above setup ready, it will take hardly 5 minutes to clone the repository and get started.

### Prerequisites
Maven, Java 8, any IDE (ex. Eclipse) is you want to review the code, any Web Application server (ex. Apache Tomcat) 

### Build
Perform maven install inside StoreParent parent folder.

> mvn clean install

### Deployment
Deploy the project to any Web Application server and access the UI using the browser url `
http://<server-url>:<server-port>/storeweb/store.html`
