# IO.Swagger.Api.DevApi

All URIs are relative to *https://virtserver.swaggerhub.com/sean15/TestOA3App/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PingGet**](DevApi.md#pingget) | **GET** /ping | Server heartbeat operation
[**RootGet**](DevApi.md#rootget) | **GET** / | Server example operation

<a name="pingget"></a>
# **PingGet**
> void PingGet ()

Server heartbeat operation

This operation shows how to override the global security defined above, as we want to open it up for all users.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class PingGetExample
    {
        public void main()
        {
            var apiInstance = new DevApi();

            try
            {
                // Server heartbeat operation
                apiInstance.PingGet();
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DevApi.PingGet: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="rootget"></a>
# **RootGet**
> string RootGet (string testq)

Server example operation

This is an example operation to show how security is applied to the call.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class RootGetExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: OAuth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new DevApi();
            var testq = testq_example;  // string | Test query parameter

            try
            {
                // Server example operation
                string result = apiInstance.RootGet(testq);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DevApi.RootGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testq** | **string**| Test query parameter | 

### Return type

**string**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
