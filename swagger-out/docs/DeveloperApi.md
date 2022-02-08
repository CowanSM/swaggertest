# IO.Swagger.Api.DeveloperApi

All URIs are relative to *https://virtserver.swaggerhub.com/sean15/TestOA3App/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DevelopersDeveloperKeyAppKeySessionsUuidDelete**](DeveloperApi.md#developersdeveloperkeyappkeysessionsuuiddelete) | **DELETE** /developers/{developerKey}/{appKey}/sessions/{uuid} | End a Session
[**DevelopersDeveloperKeyAppKeySessionsUuidPatch**](DeveloperApi.md#developersdeveloperkeyappkeysessionsuuidpatch) | **PATCH** /developers/{developerKey}/{appKey}/sessions/{uuid} | Pause Or Resume Session
[**DevelopersDeveloperKeyAppKeySessionsUuidPost**](DeveloperApi.md#developersdeveloperkeyappkeysessionsuuidpost) | **POST** /developers/{developerKey}/{appKey}/sessions/{uuid} | Start a Session
[**DevelopersDeveloperKeyAppKeySessionsUuidPut**](DeveloperApi.md#developersdeveloperkeyappkeysessionsuuidput) | **PUT** /developers/{developerKey}/{appKey}/sessions/{uuid} | Keep-Alive a Session
[**DevelopersDeveloperKeyAppKeyUgtGet**](DeveloperApi.md#developersdeveloperkeyappkeyugtget) | **GET** /developers/{developerKey}/{appKey}/ugt | Retrieve ugts for given user ids.
[**DevelopersDeveloperKeyAppKeyUuidUgtGet**](DeveloperApi.md#developersdeveloperkeyappkeyuuidugtget) | **GET** /developers/{developerKey}/{appKey}/{uuid}/ugt | Fetch UGT for user.
[**DevelopersDeveloperKeyAppKeyUuidUgtPost**](DeveloperApi.md#developersdeveloperkeyappkeyuuidugtpost) | **POST** /developers/{developerKey}/{appKey}/{uuid}/ugt | Set UGT for user.

<a name="developersdeveloperkeyappkeysessionsuuiddelete"></a>
# **DevelopersDeveloperKeyAppKeySessionsUuidDelete**
> ModelApiResponse DevelopersDeveloperKeyAppKeySessionsUuidDelete (string uuid, string developerKey, string sessionKey, string appKey)

End a Session

End an active session for an user.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DevelopersDeveloperKeyAppKeySessionsUuidDeleteExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: OAuth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new DeveloperApi();
            var uuid = uuid_example;  // string | User Unique Id
            var developerKey = developerKey_example;  // string | Developer Api Key
            var sessionKey = sessionKey_example;  // string | Session Key from POST
            var appKey = appKey_example;  // string | App Api Key

            try
            {
                // End a Session
                ModelApiResponse result = apiInstance.DevelopersDeveloperKeyAppKeySessionsUuidDelete(uuid, developerKey, sessionKey, appKey);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DeveloperApi.DevelopersDeveloperKeyAppKeySessionsUuidDelete: " + e.Message );
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
 **sessionKey** | **string**| Session Key from POST | 
 **appKey** | **string**| App Api Key | 

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="developersdeveloperkeyappkeysessionsuuidpatch"></a>
# **DevelopersDeveloperKeyAppKeySessionsUuidPatch**
> ModelApiResponse DevelopersDeveloperKeyAppKeySessionsUuidPatch (SessionsUuidBody body, string uuid, string developerKey, string appKey)

Pause Or Resume Session

Pause or Resume a session without ending the session

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DevelopersDeveloperKeyAppKeySessionsUuidPatchExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: OAuth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new DeveloperApi();
            var body = new SessionsUuidBody(); // SessionsUuidBody | Has relevant session info for update.
            var uuid = uuid_example;  // string | User Unique Id
            var developerKey = developerKey_example;  // string | Developer Api Key
            var appKey = appKey_example;  // string | App Api Key

            try
            {
                // Pause Or Resume Session
                ModelApiResponse result = apiInstance.DevelopersDeveloperKeyAppKeySessionsUuidPatch(body, uuid, developerKey, appKey);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DeveloperApi.DevelopersDeveloperKeyAppKeySessionsUuidPatch: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SessionsUuidBody**](SessionsUuidBody.md)| Has relevant session info for update. | 
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
<a name="developersdeveloperkeyappkeysessionsuuidpost"></a>
# **DevelopersDeveloperKeyAppKeySessionsUuidPost**
> InlineResponse200 DevelopersDeveloperKeyAppKeySessionsUuidPost (string uuid, string developerKey, string appKey)

Start a Session

Start a Session for the user

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DevelopersDeveloperKeyAppKeySessionsUuidPostExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: OAuth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new DeveloperApi();
            var uuid = uuid_example;  // string | User Unique Id
            var developerKey = developerKey_example;  // string | Developer Api Key
            var appKey = appKey_example;  // string | App Api Key

            try
            {
                // Start a Session
                InlineResponse200 result = apiInstance.DevelopersDeveloperKeyAppKeySessionsUuidPost(uuid, developerKey, appKey);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DeveloperApi.DevelopersDeveloperKeyAppKeySessionsUuidPost: " + e.Message );
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

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="developersdeveloperkeyappkeysessionsuuidput"></a>
# **DevelopersDeveloperKeyAppKeySessionsUuidPut**
> ModelApiResponse DevelopersDeveloperKeyAppKeySessionsUuidPut (SessionInfo body, string uuid, string developerKey, string appKey)

Keep-Alive a Session

Keep an active session for an user alive

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DevelopersDeveloperKeyAppKeySessionsUuidPutExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: OAuth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new DeveloperApi();
            var body = new SessionInfo(); // SessionInfo | Has relevant session info for update.
            var uuid = uuid_example;  // string | User Unique Id
            var developerKey = developerKey_example;  // string | Developer Api Key
            var appKey = appKey_example;  // string | App Api Key

            try
            {
                // Keep-Alive a Session
                ModelApiResponse result = apiInstance.DevelopersDeveloperKeyAppKeySessionsUuidPut(body, uuid, developerKey, appKey);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DeveloperApi.DevelopersDeveloperKeyAppKeySessionsUuidPut: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SessionInfo**](SessionInfo.md)| Has relevant session info for update. | 
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

            var apiInstance = new DeveloperApi();
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
                Debug.Print("Exception when calling DeveloperApi.DevelopersDeveloperKeyAppKeyUgtGet: " + e.Message );
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

            var apiInstance = new DeveloperApi();
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
                Debug.Print("Exception when calling DeveloperApi.DevelopersDeveloperKeyAppKeyUuidUgtGet: " + e.Message );
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

            var apiInstance = new DeveloperApi();
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
                Debug.Print("Exception when calling DeveloperApi.DevelopersDeveloperKeyAppKeyUuidUgtPost: " + e.Message );
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
