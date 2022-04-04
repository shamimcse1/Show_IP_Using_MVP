package com.codercamp.showipusingmvp.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserAgent implements Serializable
{

    @SerializedName("product")
    @Expose
    private String product;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("raw_value")
    @Expose
    private String rawValue;
    private final static long serialVersionUID = -8057380316306141987L;

    /**
     * No args constructor for use in serialization
     *
     */
    public UserAgent() {
    }


    public UserAgent(String product, String version, String comment, String rawValue) {
        super();
        this.product = product;
        this.version = version;
        this.comment = comment;
        this.rawValue = rawValue;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getRawValue() {
        return rawValue;
    }

    public void setRawValue(String rawValue) {
        this.rawValue = rawValue;
    }

}