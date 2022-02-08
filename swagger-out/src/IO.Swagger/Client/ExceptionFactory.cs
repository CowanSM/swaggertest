/* 
 * Test API Specification
 *
 * This is a test api for our upcoming project.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: nobodyshome@random.games
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using RestSharp;

namespace IO.Swagger.Client
{
    /// <summary>
    /// A delegate to ExceptionFactory method
    /// </summary>
    /// <param name="methodName">Method name</param>
    /// <param name="response">Response</param>
    /// <returns>Exceptions</returns>
        public delegate Exception ExceptionFactory(string methodName, IRestResponse response);
}
