# CacheMe
Small poc to play with java cache

## Step 1
Create a sample rest api with a resource sample that can be retrieved by id.  
The resource are 10Mo big.     
There is a caffeine cache attached to the endpoint to optimize data access performance.   
It takes about 15s to access the resource from the golden data source (non cached).  

