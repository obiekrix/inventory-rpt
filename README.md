# inventory-rpt

NOTE:

Ensure the other application (inventory-app) is running before running this application. 
Since inventory-app will usually startup with dockerized postgres and kafka which is also 
needed by this application.


Build and run the application using the following commands:
mvn clean package
java -jar target/inventory-rpt-1.0.0-SNAPSHOT.jar

You can test the report endpoint by running:
curl -X GET "http://localhost:7071/inventory/api/rpt/order/all/2020-10-10/2020-12-12" -H "accept: */*"

You can also find other useful, the swagger doc:
http://localhost:7071/inventory/api/rpt/swagger-ui/index.html?configUrl=/inventory/api/rpt/v3/api-docs/swagger-config