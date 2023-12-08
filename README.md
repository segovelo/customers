# customers
 
This APi is built with Spring 3 and gradle to querie customers-db hosted on Mongo-DB. To be able to run successfully you will need your Mongo-DB username, password, cluster and setup a DB ("customers-db") with a collection named "cusomers" . The rest API contains of two endpoints POST /customers/save AND GET /customers/retrieve. 
The POST endpoint accepts json payload with the following schemma:

![image](https://github.com/segovelo/customers/assets/44499182/a5629389-606c-4869-868e-ad0752cb1a29)

If insertion into DB is successfull will return response with 201 status code and String message in the payload.

![image](https://github.com/segovelo/customers/assets/44499182/334caaca-1f45-42d5-ae33-d08e310db675)


