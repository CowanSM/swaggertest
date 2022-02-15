# IO.Swagger.Api.SessionApi

All URIs are relative to *https://virtserver.swaggerhub.com/sean15/TestOA3App/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DevelopersDeveloperKeyAppKeySessionsUuidDelete**](SessionApi.md#developersdeveloperkeyappkeysessionsuuiddelete) | **DELETE** /developers/{developerKey}/{appKey}/sessions/{uuid} | End a Session
[**DevelopersDeveloperKeyAppKeySessionsUuidPatch**](SessionApi.md#developersdeveloperkeyappkeysessionsuuidpatch) | **PATCH** /developers/{developerKey}/{appKey}/sessions/{uuid} | Pause Or Resume Session
[**DevelopersDeveloperKeyAppKeySessionsUuidPost**](SessionApi.md#developersdeveloperkeyappkeysessionsuuidpost) | **POST** /developers/{developerKey}/{appKey}/sessions/{uuid} | Start a Session
[**DevelopersDeveloperKeyAppKeySessionsUuidPut**](SessionApi.md#developersdeveloperkeyappkeysessionsuuidput) | **PUT** /developers/{developerKey}/{appKey}/sessions/{uuid} | Keep-Alive a Session

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

            var apiInstance = new SessionApi();
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
                Debug.Print("Exception when calling SessionApi.DevelopersDeveloperKeyAppKeySessionsUuidDelete: " + e.Message );
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

            var apiInstance = new SessionApi();
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
                Debug.Print("Exception when calling SessionApi.DevelopersDeveloperKeyAppKeySessionsUuidPatch: " + e.Message );
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

            var apiInstance = new SessionApi();
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
                Debug.Print("Exception when calling SessionApi.DevelopersDeveloperKeyAppKeySessionsUuidPost: " + e.Message );
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

            var apiInstance = new SessionApi();
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
                Debug.Print("Exception when calling SessionApi.DevelopersDeveloperKeyAppKeySessionsUuidPut: " + e.Message );
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
