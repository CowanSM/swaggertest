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
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;

namespace IO.Swagger.Model
{
    /// <summary>
    /// SessionsUuidBody
    /// </summary>
    [DataContract]
        public partial class SessionsUuidBody :  IEquatable<SessionsUuidBody>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SessionsUuidBody" /> class.
        /// </summary>
        /// <param name="sessionInfo">sessionInfo.</param>
        /// <param name="setPause">setPause.</param>
        public SessionsUuidBody(SessionInfo sessionInfo = default(SessionInfo), bool? setPause = default(bool?))
        {
            this.SessionInfo = sessionInfo;
            this.SetPause = setPause;
        }
        
        /// <summary>
        /// Gets or Sets SessionInfo
        /// </summary>
        [DataMember(Name="sessionInfo", EmitDefaultValue=false)]
        public SessionInfo SessionInfo { get; set; }

        /// <summary>
        /// Gets or Sets SetPause
        /// </summary>
        [DataMember(Name="setPause", EmitDefaultValue=false)]
        public bool? SetPause { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SessionsUuidBody {\n");
            sb.Append("  SessionInfo: ").Append(SessionInfo).Append("\n");
            sb.Append("  SetPause: ").Append(SetPause).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as SessionsUuidBody);
        }

        /// <summary>
        /// Returns true if SessionsUuidBody instances are equal
        /// </summary>
        /// <param name="input">Instance of SessionsUuidBody to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SessionsUuidBody input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.SessionInfo == input.SessionInfo ||
                    (this.SessionInfo != null &&
                    this.SessionInfo.Equals(input.SessionInfo))
                ) && 
                (
                    this.SetPause == input.SetPause ||
                    (this.SetPause != null &&
                    this.SetPause.Equals(input.SetPause))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.SessionInfo != null)
                    hashCode = hashCode * 59 + this.SessionInfo.GetHashCode();
                if (this.SetPause != null)
                    hashCode = hashCode * 59 + this.SetPause.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }
}