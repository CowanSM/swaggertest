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
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using IO.Swagger.Client;
using IO.Swagger.Api;
using IO.Swagger.Model;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing SessionApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class SessionApiTests
    {
        private SessionApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new SessionApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of SessionApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' SessionApi
            //Assert.IsInstanceOfType(typeof(SessionApi), instance, "instance is a SessionApi");
        }

        /// <summary>
        /// Test DevelopersDeveloperKeyAppKeySessionsUuidDelete
        /// </summary>
        [Test]
        public void DevelopersDeveloperKeyAppKeySessionsUuidDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string uuid = null;
            //string developerKey = null;
            //string sessionKey = null;
            //string appKey = null;
            //var response = instance.DevelopersDeveloperKeyAppKeySessionsUuidDelete(uuid, developerKey, sessionKey, appKey);
            //Assert.IsInstanceOf<ModelApiResponse> (response, "response is ModelApiResponse");
        }
        /// <summary>
        /// Test DevelopersDeveloperKeyAppKeySessionsUuidPatch
        /// </summary>
        [Test]
        public void DevelopersDeveloperKeyAppKeySessionsUuidPatchTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //SessionsUuidBody body = null;
            //string uuid = null;
            //string developerKey = null;
            //string appKey = null;
            //var response = instance.DevelopersDeveloperKeyAppKeySessionsUuidPatch(body, uuid, developerKey, appKey);
            //Assert.IsInstanceOf<ModelApiResponse> (response, "response is ModelApiResponse");
        }
        /// <summary>
        /// Test DevelopersDeveloperKeyAppKeySessionsUuidPost
        /// </summary>
        [Test]
        public void DevelopersDeveloperKeyAppKeySessionsUuidPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string uuid = null;
            //string developerKey = null;
            //string appKey = null;
            //var response = instance.DevelopersDeveloperKeyAppKeySessionsUuidPost(uuid, developerKey, appKey);
            //Assert.IsInstanceOf<InlineResponse200> (response, "response is InlineResponse200");
        }
        /// <summary>
        /// Test DevelopersDeveloperKeyAppKeySessionsUuidPut
        /// </summary>
        [Test]
        public void DevelopersDeveloperKeyAppKeySessionsUuidPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //SessionInfo body = null;
            //string uuid = null;
            //string developerKey = null;
            //string appKey = null;
            //var response = instance.DevelopersDeveloperKeyAppKeySessionsUuidPut(body, uuid, developerKey, appKey);
            //Assert.IsInstanceOf<ModelApiResponse> (response, "response is ModelApiResponse");
        }
    }

}