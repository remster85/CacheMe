# CacheMe
Small poc to play with java cache and memory profiling.   

## Step 1
Create a sample rest api with a resource sample that can be retrieved by id.  
The resources are 4Mo big.     
There is a caffeine cache attached to the endpoint to optimize data access performance.   
It takes about 15s to access the resource from the golden data source (non cached).  

### User Experience from Internet Browser
![image](https://github.com/remster85/CacheMe/assets/23420546/25f0cf7f-f282-431b-a931-9faf5442f9da)

### Logs
![image](https://github.com/remster85/CacheMe/assets/23420546/ed187ae7-02fd-453f-a205-fe3b3b985ce3)

### Memory Over Time  
![image](https://github.com/remster85/CacheMe/assets/23420546/775d1d85-032d-42b4-9175-42940adb8cf2)

### HeapDump 
![image](https://github.com/remster85/CacheMe/assets/23420546/09379654-798c-4204-a5b6-61a8062e1a57)

I have noticed that when increasing size of the heavy object, that google chrome takes much longer than a postman:  
Postman Versio  415ms vs 10 or 25 seconds in Google Chrome  (both up to date)
![image](https://github.com/remster85/CacheMe/assets/23420546/5433c716-6c03-44ac-912b-8e2e80350084)
![image](https://github.com/remster85/CacheMe/assets/23420546/8b37e9c1-55f2-46ef-bfb9-7470be758be9)


