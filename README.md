# CacheMe
Small poc to play with java cache

## Step 1
Create a sample rest api with a resource sample that can be retrieved by id.  
The resource are 10Mo big.     
There is a caffeine cache attached to the endpoint to optimize data access performance.   
It takes about 15s to access the resource from the golden data source (non cached).  

### User Experience from Internet Browser
![image](https://github.com/remster85/CacheMe/assets/23420546/25f0cf7f-f282-431b-a931-9faf5442f9da)

### Memory Over Time  
![image](https://github.com/remster85/CacheMe/assets/23420546/775d1d85-032d-42b4-9175-42940adb8cf2)

### HeapDump 
![image](https://github.com/remster85/CacheMe/assets/23420546/09379654-798c-4204-a5b6-61a8062e1a57)



