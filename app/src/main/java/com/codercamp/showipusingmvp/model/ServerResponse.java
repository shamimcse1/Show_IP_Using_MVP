package com.codercamp.showipusingmvp.model;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ServerResponse implements Serializable {

    @SerializedName("ip")
    @Expose
    private String ip;
    @SerializedName("ip_decimal")
    @Expose
    private Integer ipDecimal;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("country_iso")
    @Expose
    private String countryIso;
    @SerializedName("country_eu")
    @Expose
    private Boolean countryEu;
    @SerializedName("region_name")
    @Expose
    private String regionName;
    @SerializedName("region_code")
    @Expose
    private String regionCode;
    @SerializedName("zip_code")
    @Expose
    private String zipCode;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("time_zone")
    @Expose
    private String timeZone;
    @SerializedName("asn")
    @Expose
    private String asn;
    @SerializedName("asn_org")
    @Expose
    private String asnOrg;
    @SerializedName("hostname")
    @Expose
    private String hostname;
    @SerializedName("user_agent")
    @Expose
    private UserAgent userAgent;


    public ServerResponse() {
    }


    public ServerResponse(String ip, Integer ipDecimal, String country, String countryIso, Boolean countryEu, String regionName, String regionCode, String zipCode, String city, Double latitude, Double longitude, String timeZone, String asn, String asnOrg, String hostname, UserAgent userAgent) {
        super();
        this.ip = ip;
        this.ipDecimal = ipDecimal;
        this.country = country;
        this.countryIso = countryIso;
        this.countryEu = countryEu;
        this.regionName = regionName;
        this.regionCode = regionCode;
        this.zipCode = zipCode;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
        this.timeZone = timeZone;
        this.asn = asn;
        this.asnOrg = asnOrg;
        this.hostname = hostname;
        this.userAgent = userAgent;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getIpDecimal() {
        return ipDecimal;
    }

    public void setIpDecimal(Integer ipDecimal) {
        this.ipDecimal = ipDecimal;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryIso() {
        return countryIso;
    }

    public void setCountryIso(String countryIso) {
        this.countryIso = countryIso;
    }

    public Boolean getCountryEu() {
        return countryEu;
    }

    public void setCountryEu(Boolean countryEu) {
        this.countryEu = countryEu;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getAsn() {
        return asn;
    }

    public void setAsn(String asn) {
        this.asn = asn;
    }

    public String getAsnOrg() {
        return asnOrg;
    }

    public void setAsnOrg(String asnOrg) {
        this.asnOrg = asnOrg;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public UserAgent getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(UserAgent userAgent) {
        this.userAgent = userAgent;
    }

}