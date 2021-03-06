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
    /// Avatar
    /// </summary>
    [DataContract]
        public partial class Avatar :  IEquatable<Avatar>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Avatar" /> class.
        /// </summary>
        /// <param name="elements">elements.</param>
        public Avatar(AvatarElements elements = default(AvatarElements))
        {
            this.Elements = elements;
        }
        
        /// <summary>
        /// Gets or Sets Uid
        /// </summary>
        [DataMember(Name="uid", EmitDefaultValue=false)]
        public string Uid { get; private set; }

        /// <summary>
        /// Gets or Sets Model
        /// </summary>
        [DataMember(Name="model", EmitDefaultValue=false)]
        public string Model { get; private set; }

        /// <summary>
        /// Gets or Sets Skin
        /// </summary>
        [DataMember(Name="skin", EmitDefaultValue=false)]
        public string Skin { get; private set; }

        /// <summary>
        /// Gets or Sets Elements
        /// </summary>
        [DataMember(Name="elements", EmitDefaultValue=false)]
        public AvatarElements Elements { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Avatar {\n");
            sb.Append("  Uid: ").Append(Uid).Append("\n");
            sb.Append("  Model: ").Append(Model).Append("\n");
            sb.Append("  Skin: ").Append(Skin).Append("\n");
            sb.Append("  Elements: ").Append(Elements).Append("\n");
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
            return this.Equals(input as Avatar);
        }

        /// <summary>
        /// Returns true if Avatar instances are equal
        /// </summary>
        /// <param name="input">Instance of Avatar to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Avatar input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Uid == input.Uid ||
                    (this.Uid != null &&
                    this.Uid.Equals(input.Uid))
                ) && 
                (
                    this.Model == input.Model ||
                    (this.Model != null &&
                    this.Model.Equals(input.Model))
                ) && 
                (
                    this.Skin == input.Skin ||
                    (this.Skin != null &&
                    this.Skin.Equals(input.Skin))
                ) && 
                (
                    this.Elements == input.Elements ||
                    (this.Elements != null &&
                    this.Elements.Equals(input.Elements))
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
                if (this.Uid != null)
                    hashCode = hashCode * 59 + this.Uid.GetHashCode();
                if (this.Model != null)
                    hashCode = hashCode * 59 + this.Model.GetHashCode();
                if (this.Skin != null)
                    hashCode = hashCode * 59 + this.Skin.GetHashCode();
                if (this.Elements != null)
                    hashCode = hashCode * 59 + this.Elements.GetHashCode();
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
