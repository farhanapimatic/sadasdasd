/*
 * SwaggerPetstoreLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package io.swagger.petstore.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Pet 
        implements java.io.Serializable {
    private static final long serialVersionUID = -4786215621027263263L;
    private Long id;
    private Category category;
    private String name;
    private List<String> photoUrls;
    private List<Tag> tags;
    private Status1Enum status;
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
    @JsonGetter("category")
    public Category getCategory ( ) { 
        return this.category;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("category")
    public void setCategory (Category value) { 
        this.category = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("photoUrls")
    public List<String> getPhotoUrls ( ) { 
        return this.photoUrls;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("photoUrls")
    public void setPhotoUrls (List<String> value) { 
        this.photoUrls = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("tags")
    public List<Tag> getTags ( ) { 
        return this.tags;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("tags")
    public void setTags (List<Tag> value) { 
        this.tags = value;
    }
 
    /** GETTER
     * pet status in the store
     */
    @JsonGetter("status")
    public Status1Enum getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * pet status in the store
     */
    @JsonSetter("status")
    public void setStatus (Status1Enum value) { 
        this.status = value;
    }
 
}
