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
    /// InlineResponse2001
    /// </summary>
    [DataContract]
        public partial class InlineResponse2001 :  IEquatable<InlineResponse2001>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2001" /> class.
        /// </summary>
        /// <param name="_apiResponse">_apiResponse.</param>
        /// <param name="ugt">ugt.</param>
        public InlineResponse2001(ModelApiResponse _apiResponse = default(ModelApiResponse), Ugt ugt = default(Ugt))
        {
            this._ApiResponse = _apiResponse;
            this.Ugt = ugt;
        }
        
        /// <summary>
        /// Gets or Sets _ApiResponse
        /// </summary>
        [DataMember(Name="apiResponse", EmitDefaultValue=false)]
        public ModelApiResponse _ApiResponse { get; set; }

        /// <summary>
        /// Gets or Sets Ugt
        /// </summary>
        [DataMember(Name="ugt", EmitDefaultValue=false)]
        public Ugt Ugt { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse2001 {\n");
            sb.Append("  _ApiResponse: ").Append(_ApiResponse).Append("\n");
            sb.Append("  Ugt: ").Append(Ugt).Append("\n");
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
            return this.Equals(input as InlineResponse2001);
        }

        /// <summary>
        /// Returns true if InlineResponse2001 instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2001 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2001 input)
        {
            if (input == null)
                return false;

            return 
                (
                    this._ApiResponse == input._ApiResponse ||
                    (this._ApiResponse != null &&
                    this._ApiResponse.Equals(input._ApiResponse))
                ) && 
                (
                    this.Ugt == input.Ugt ||
                    (this.Ugt != null &&
                    this.Ugt.Equals(input.Ugt))
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
                if (this._ApiResponse != null)
                    hashCode = hashCode * 59 + this._ApiResponse.GetHashCode();
                if (this.Ugt != null)
                    hashCode = hashCode * 59 + this.Ugt.GetHashCode();
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
