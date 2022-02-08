# IO.Swagger.Api.PortalApi

All URIs are relative to *https://virtserver.swaggerhub.com/sean15/TestOA3App/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PortalUidGet**](PortalApi.md#portaluidget) | **GET** /portal/{uid} | Retrieve portal information
[**UserUuidPortalsGet**](PortalApi.md#useruuidportalsget) | **GET** /user/{uuid}/portals | Retrieve portals for user

<a name="portaluidget"></a>
# **PortalUidGet**
> Portal PortalUidGet (string uid)

Retrieve portal information

Retrieve portal info for given id

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class PortalUidGetExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: OAuth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new PortalApi();
            var uid = uid_example;  // string | Portal Unique Id

            try
            {
                // Retrieve portal information
                Portal result = apiInstance.PortalUidGet(uid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PortalApi.PortalUidGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **string**| Portal Unique Id | 

### Return type

[**Portal**](Portal.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="useruuidportalsget"></a>
# **UserUuidPortalsGet**
> List<Portal> UserUuidPortalsGet (string uuid)

Retrieve portals for user

Retrieve all portal info for the given user

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserUuidPortalsGetExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: OAuth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new PortalApi();
            var uuid = uuid_example;  // string | Unique User Id

            try
            {
                // Retrieve portals for user
                List&lt;Portal&gt; result = apiInstance.UserUuidPortalsGet(uuid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PortalApi.UserUuidPortalsGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **string**| Unique User Id | 

### Return type

[**List<Portal>**](Portal.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
