/*
 * SwaggerPetstoreLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package io.swagger.petstore.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.petstore.DateTimeHelper;
import org.joda.time.DateTime;

public class Order 
        implements java.io.Serializable {
    private static final long serialVersionUID = -7535524729621542655L;
    private Long id;
    private Long petId;
    private Integer quantity;
    private DateTime shipDate;
    private StatusEnum status;
    private Boolean complete = false;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public Long getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (Long value) { 
        this.id = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("petId")
    public Long getPetId ( ) { 
        return this.petId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("petId")
    public void setPetId (Long value) { 
        this.petId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("quantity")
    public Integer getQuantity ( ) { 
        return this.quantity;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("quantity")
    public void setQuantity (Integer value) { 
        this.quantity = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("shipDate")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getShipDate ( ) { 
        return this.shipDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("shipDate")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setShipDate (DateTime value) { 
        this.shipDate = value;
    }
 
    /** GETTER
     * Order Status
     */
    @JsonGetter("status")
    public StatusEnum getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * Order Status
     */
    @JsonSetter("status")
    public void setStatus (StatusEnum value) { 
        this.status = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("complete")
    public Boolean getComplete ( ) { 
        return this.complete;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("complete")
    public void setComplete (Boolean value) { 
        this.complete = value;
    }
 
}
