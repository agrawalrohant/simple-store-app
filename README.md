# simple-store-app
Simple Store Info App allows user to perform CRUD (Create, Read, Update and Delete) operations on Store Object. 
It uses tools/framework such as below - 
a. Maven - as a Build tool to resolve Spring and JUnit dependency and crete a Jar and War file for Service and Web project respectively. It also has parent pom.xml to have multi-module level project.
b. Spring - uses Spring-context and spring-web for bean creation and commincating over the web http methods such as GET, POST, PUT and DELETE. 
c. Servlet - helps UI to communicate with the BO (Business Object) Layer.

Build
Perform "mvn clean install" inside StoreParent project.

Deploy/Run
Deploy the project to any Web Application server and access the UI using the browser url http://<server-url>:<server-port>/storeweb/store.html
