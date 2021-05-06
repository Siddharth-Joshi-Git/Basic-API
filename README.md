# Basic-API
This basic API implements the CRUD capabilities using Java's spring boot framework. The API allows to perform various operations via Get and Post methods to manage the menu items of a restaurant. 

Main functions performed by this API are:
  1. Get items
  2. Get item by ID
  3. Add item
  4. Update item
  5. Delete item
  
As per Spring's MVC framework, the core implementation of API is divided into following 3 parts:
  1. Item.java  - Mainly holds the data model
  2. ItemService - Implements the business logic and interacts with In-Memory repository for data operations
  3. ItemController - Manages and routes the inbound HTTP requests to appropriate methods

API also implements Spring boots Actuator module to allow monitoring of the application health via various end-points:
e.g.
1. actuator/health
2. actuator/info

Logging levels are being controlled via application.properties file:
1. Debug
2. Info
3. Trace

API partially implements spring boots Micrometer module to allow flushing metrics to prometheus
*Very basic and may not add any value

