# IO.Swagger.Api.UgtApi

All URIs are relative to *https://virtserver.swaggerhub.com/sean15/TestOA3App/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DevelopersDeveloperKeyAppKeyUgtGet**](UgtApi.md#developersdeveloperkeyappkeyugtget) | **GET** /developers/{developerKey}/{appKey}/ugt | Retrieve ugts for given user ids.
[**DevelopersDeveloperKeyAppKeyUuidUgtGet**](UgtApi.md#developersdeveloperkeyappkeyuuidugtget) | **GET** /developers/{developerKey}/{appKey}/{uuid}/ugt | Fetch UGT for user.
[**DevelopersDeveloperKeyAppKeyUuidUgtPost**](UgtApi.md#developersdeveloperkeyappkeyuuidugtpost) | **POST** /developers/{developerKey}/{appKey}/{uuid}/ugt | Set UGT for user.
[**UserUuidUgtGet**](UgtApi.md#useruuidugtget) | **GET** /user/{uuid}/ugt | Retrieve ugts for user

<a name="developersdeveloperkeyappkeyugtget"></a>
# **DevelopersDeveloperKeyAppKeyUgtGet**
> Portal DevelopersDeveloperKeyAppKeyUgtGet (string developerKey, string appKey, List<string> uuids)

Retrieve ugts for given user ids.

Retrieve all UGTs for a set of supplied user ids.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DevelopersDeveloperKeyAppKeyUgtGetExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: OAuth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new UgtApi();
            var developerKey = developerKey_example;  // string | Developer Api Key
            var appKey = appKey_example;  // string | App Api Key
            var uuids = new List<string>(); // List<string> | Uuid List

            try
            {
                // Retrieve ugts for given user ids.
                Portal result = apiInstance.DevelopersDeveloperKeyAppKeyUgtGet(developerKey, appKey, uuids);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UgtApi.DevelopersDeveloperKeyAppKeyUgtGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **developerKey** | **string**| Developer Api Key | 
 **appKey** | **string**| App Api Key | 
 **uuids** | [**List&lt;string&gt;**](string.md)| Uuid List | 

### Return type

[**Portal**](Portal.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="developersdeveloperkeyappkeyuuidugtget"></a>
# **DevelopersDeveloperKeyAppKeyUuidUgtGet**
> InlineResponse2001 DevelopersDeveloperKeyAppKeyUuidUgtGet (string uuid, string developerKey, string appKey)

Fetch UGT for user.

Get the UGT set by user for the given developer-app key pair.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DevelopersDeveloperKeyAppKeyUuidUgtGetExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: OAuth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new UgtApi();
            var uuid = uuid_example;  // string | User Unique Id
            var developerKey = developerKey_example;  // string | Developer Api Key
            var appKey = appKey_example;  // string | App Api Key

            try
            {
                // Fetch UGT for user.
                InlineResponse2001 result = apiInstance.DevelopersDeveloperKeyAppKeyUuidUgtGet(uuid, developerKey, appKey);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UgtApi.DevelopersDeveloperKeyAppKeyUuidUgtGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **string**| User Unique Id | 
 **developerKey** | **string**| Developer Api Key | 
 **appKey** | **string**| App Api Key | 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="developersdeveloperkeyappkeyuuidugtpost"></a>
# **DevelopersDeveloperKeyAppKeyUuidUgtPost**
> ModelApiResponse DevelopersDeveloperKeyAppKeyUuidUgtPost (UuidUgtBody body, string uuid, string developerKey, string appKey)

Set UGT for user.

Set the UGT for given user and the developer-app key pair.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DevelopersDeveloperKeyAppKeyUuidUgtPostExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: OAuth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new UgtApi();
            var body = new UuidUgtBody(); // UuidUgtBody | Contains the (valid) ugt to set for the given user/app pair.
            var uuid = uuid_example;  // string | User Unique Id
            var developerKey = developerKey_example;  // string | Developer Api Key
            var appKey = appKey_example;  // string | App Api Key

            try
            {
                // Set UGT for user.
                ModelApiResponse result = apiInstance.DevelopersDeveloperKeyAppKeyUuidUgtPost(body, uuid, developerKey, appKey);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UgtApi.DevelopersDeveloperKeyAppKeyUuidUgtPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UuidUgtBody**](UuidUgtBody.md)| Contains the (valid) ugt to set for the given user/app pair. | 
 **uuid** | **string**| User Unique Id | 
 **developerKey** | **string**| Developer Api Key | 
 **appKey** | **string**| App Api Key | 

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="useruuidugtget"></a>
# **UserUuidUgtGet**
> List<User> UserUuidUgtGet (string uuid)

Retrieve ugts for user

Retrieve a list of ugts for the described user

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserUuidUgtGetExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: OAuth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new UgtApi();
            var uuid = uuid_example;  // string | Unique User Id

            try
            {
                // Retrieve ugts for user
                List&lt;User&gt; result = apiInstance.UserUuidUgtGet(uuid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UgtApi.UserUuidUgtGet: " + e.Message );
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

[**List<User>**](User.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
