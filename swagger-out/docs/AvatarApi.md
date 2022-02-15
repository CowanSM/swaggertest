# IO.Swagger.Api.AvatarApi

All URIs are relative to *https://virtserver.swaggerhub.com/sean15/TestOA3App/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AvatarUidGet**](AvatarApi.md#avataruidget) | **GET** /avatar/{uid} | Retrieve avatar information
[**UserUuidAvatarsGet**](AvatarApi.md#useruuidavatarsget) | **GET** /user/{uuid}/avatars | Retrieve avatars for user

<a name="avataruidget"></a>
# **AvatarUidGet**
> Avatar AvatarUidGet (string uid)

Retrieve avatar information

Retrieve avatar info for given id

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AvatarUidGetExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: OAuth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AvatarApi();
            var uid = uid_example;  // string | Avatar Unique Id

            try
            {
                // Retrieve avatar information
                Avatar result = apiInstance.AvatarUidGet(uid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AvatarApi.AvatarUidGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **string**| Avatar Unique Id | 

### Return type

[**Avatar**](Avatar.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="useruuidavatarsget"></a>
# **UserUuidAvatarsGet**
> List<Avatar> UserUuidAvatarsGet (string uuid)

Retrieve avatars for user

Retrieve all avatar info for the given user

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserUuidAvatarsGetExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: OAuth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AvatarApi();
            var uuid = uuid_example;  // string | Unique User Id

            try
            {
                // Retrieve avatars for user
                List&lt;Avatar&gt; result = apiInstance.UserUuidAvatarsGet(uuid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AvatarApi.UserUuidAvatarsGet: " + e.Message );
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

[**List<Avatar>**](Avatar.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
