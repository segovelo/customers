# customers
 
This APi is built with Spring 3 and gradle to querie customers-db hosted on Mongo-DB. To start this application up, you will need a Mongo-DB account to obtain username, password, cluster, connection string and setup a DB ("customers-db") with a collection named "customers", then assign these details in properties. The rest API contains two endpoints POST /customers/save and GET /customers/retrieve. 
The POST endpoint accepts json payload with the following format:
![image](https://github.com/segovelo/customers/assets/44499182/a5629389-606c-4869-868e-ad0752cb1a29)

If insertion into DB is successfull API will return response with 201 status code and String message in the payload. Otherwise responsey entity will be populated with 500 status code.
![image](https://github.com/segovelo/customers/assets/44499182/334caaca-1f45-42d5-ae33-d08e310db675)

The GET /customers/retrieve required query paramater "customerRef", if not present API will return 400 status code.
IWhen request is formed properly API will query customers-db and search by customer Ref. This will result in a 200 status code response with below format:  
![image](https://github.com/segovelo/customers/assets/44499182/05c661b9-fe7f-4b51-b0d9-82c482fd1936)

Conversely, if  there is no customer for the passed customerRef, API will respond with 404 code and message accordingly in response:
![image](https://github.com/segovelo/customers/assets/44499182/c2e4bca0-63b3-4e75-b64b-b7d3e136c0e7)

