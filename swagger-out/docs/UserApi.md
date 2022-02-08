# IO.Swagger.Api.UserApi

All URIs are relative to *https://virtserver.swaggerhub.com/sean15/TestOA3App/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DevelopersDeveloperKeyAppKeySessionsUuidDelete**](UserApi.md#developersdeveloperkeyappkeysessionsuuiddelete) | **DELETE** /developers/{developerKey}/{appKey}/sessions/{uuid} | End a Session
[**DevelopersDeveloperKeyAppKeySessionsUuidPatch**](UserApi.md#developersdeveloperkeyappkeysessionsuuidpatch) | **PATCH** /developers/{developerKey}/{appKey}/sessions/{uuid} | Pause Or Resume Session
[**DevelopersDeveloperKeyAppKeySessionsUuidPost**](UserApi.md#developersdeveloperkeyappkeysessionsuuidpost) | **POST** /developers/{developerKey}/{appKey}/sessions/{uuid} | Start a Session
[**DevelopersDeveloperKeyAppKeySessionsUuidPut**](UserApi.md#developersdeveloperkeyappkeysessionsuuidput) | **PUT** /developers/{developerKey}/{appKey}/sessions/{uuid} | Keep-Alive a Session
[**UserUuidAvatarsGet**](UserApi.md#useruuidavatarsget) | **GET** /user/{uuid}/avatars | Retrieve avatars for user
[**UserUuidGet**](UserApi.md#useruuidget) | **GET** /user/{uuid} | Retrieve user info
[**UserUuidPortalsGet**](UserApi.md#useruuidportalsget) | **GET** /user/{uuid}/portals | Retrieve portals for user
[**UserUuidUgtGet**](UserApi.md#useruuidugtget) | **GET** /user/{uuid}/ugt | Retrieve ugts for user

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

            var apiInstance = new UserApi();
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
                Debug.Print("Exception when calling UserApi.DevelopersDeveloperKeyAppKeySessionsUuidDelete: " + e.Message );
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

            var apiInstance = new UserApi();
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
                Debug.Print("Exception when calling UserApi.DevelopersDeveloperKeyAppKeySessionsUuidPatch: " + e.Message );
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

            var apiInstance = new UserApi();
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
                Debug.Print("Exception when calling UserApi.DevelopersDeveloperKeyAppKeySessionsUuidPost: " + e.Message );
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

            var apiInstance = new UserApi();
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
                Debug.Print("Exception when calling UserApi.DevelopersDeveloperKeyAppKeySessionsUuidPut: " + e.Message );
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

            var apiInstance = new UserApi();
            var uuid = uuid_example;  // string | Unique User Id

            try
            {
                // Retrieve avatars for user
                List&lt;Avatar&gt; result = apiInstance.UserUuidAvatarsGet(uuid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserUuidAvatarsGet: " + e.Message );
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
<a name="useruuidget"></a>
# **UserUuidGet**
> User UserUuidGet (string uuid)

Retrieve user info

Retrieve explicit information for user

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UserUuidGetExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: OAuth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new UserApi();
            var uuid = uuid_example;  // string | Unique User Id

            try
            {
                // Retrieve user info
                User result = apiInstance.UserUuidGet(uuid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserUuidGet: " + e.Message );
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

[**User**](User.md)

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

            var apiInstance = new UserApi();
            var uuid = uuid_example;  // string | Unique User Id

            try
            {
                // Retrieve portals for user
                List&lt;Portal&gt; result = apiInstance.UserUuidPortalsGet(uuid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserUuidPortalsGet: " + e.Message );
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

            var apiInstance = new UserApi();
            var uuid = uuid_example;  // string | Unique User Id

            try
            {
                // Retrieve ugts for user
                List&lt;User&gt; result = apiInstance.UserUuidUgtGet(uuid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.UserUuidUgtGet: " + e.Message );
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
