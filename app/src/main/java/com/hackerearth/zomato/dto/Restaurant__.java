
package com.hackerearth.zomato.dto;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.hackerearth.zomato.R;

public class Restaurant__ {

    @SerializedName("R")
    @Expose
    private R r;
    @SerializedName("apikey")
    @Expose
    private String apikey;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("cuisines")
    @Expose
    private String cuisines;
    @SerializedName("average_cost_for_two")
    @Expose
    private Integer averageCostForTwo;
    @SerializedName("price_range")
    @Expose
    private Integer priceRange;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("offers")
    @Expose
    private List<Object> offers = new ArrayList<Object>();
    @SerializedName("thumb")
    @Expose
    private String thumb;
    @SerializedName("user_rating")
    @Expose
    private UserRating userRating;
    @SerializedName("photos_url")
    @Expose
    private String photosUrl;
    @SerializedName("menu_url")
    @Expose
    private String menuUrl;
    @SerializedName("featured_image")
    @Expose
    private String featuredImage;
    @SerializedName("has_online_delivery")
    @Expose
    private Integer hasOnlineDelivery;
    @SerializedName("is_delivering_now")
    @Expose
    private Integer isDeliveringNow;
    @SerializedName("deeplink")
    @Expose
    private String deeplink;
    @SerializedName("has_table_booking")
    @Expose
    private Integer hasTableBooking;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;
    @SerializedName("establishment_types")
    @Expose
    private List<Object> establishmentTypes = new ArrayList<Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Restaurant__() {
    }

    /**
     * 
     * @param cuisines
     * @param eventsUrl
     * @param hasTableBooking
     * @param userRating
     * @param location
     * @param hasOnlineDelivery
     * @param offers
     * @param isDeliveringNow
     * @param url
     * @param apikey
     * @param currency
     * @param id
     * @param averageCostForTwo
     * @param priceRange
     * @param r
     * @param menuUrl
     * @param photosUrl
     * @param name
     * @param deeplink
     * @param establishmentTypes
     * @param thumb
     * @param featuredImage
     */
    public Restaurant__(R r, String apikey, String id, String name, String url, Location location, String cuisines, Integer averageCostForTwo, Integer priceRange, String currency, List<Object> offers, String thumb, UserRating userRating, String photosUrl, String menuUrl, String featuredImage, Integer hasOnlineDelivery, Integer isDeliveringNow, String deeplink, Integer hasTableBooking, String eventsUrl, List<Object> establishmentTypes) {
        this.r = r;
        this.apikey = apikey;
        this.id = id;
        this.name = name;
        this.url = url;
        this.location = location;
        this.cuisines = cuisines;
        this.averageCostForTwo = averageCostForTwo;
        this.priceRange = priceRange;
        this.currency = currency;
        this.offers = offers;
        this.thumb = thumb;
        this.userRating = userRating;
        this.photosUrl = photosUrl;
        this.menuUrl = menuUrl;
        this.featuredImage = featuredImage;
        this.hasOnlineDelivery = hasOnlineDelivery;
        this.isDeliveringNow = isDeliveringNow;
        this.deeplink = deeplink;
        this.hasTableBooking = hasTableBooking;
        this.eventsUrl = eventsUrl;
        this.establishmentTypes = establishmentTypes;
    }

    /**
     * 
     * @return
     *     The r
     */
    public R getR() {
        return r;
    }

    /**
     * 
     * @param r
     *     The R
     */
    public void setR(R r) {
        this.r = r;
    }

    /**
     * 
     * @return
     *     The apikey
     */
    public String getApikey() {
        return apikey;
    }

    /**
     * 
     * @param apikey
     *     The apikey
     */
    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The cuisines
     */
    public String getCuisines() {
        return cuisines;
    }

    /**
     * 
     * @param cuisines
     *     The cuisines
     */
    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    /**
     * 
     * @return
     *     The averageCostForTwo
     */
    public Integer getAverageCostForTwo() {
        return averageCostForTwo;
    }

    /**
     * 
     * @param averageCostForTwo
     *     The average_cost_for_two
     */
    public void setAverageCostForTwo(Integer averageCostForTwo) {
        this.averageCostForTwo = averageCostForTwo;
    }

    /**
     * 
     * @return
     *     The priceRange
     */
    public Integer getPriceRange() {
        return priceRange;
    }

    /**
     * 
     * @param priceRange
     *     The price_range
     */
    public void setPriceRange(Integer priceRange) {
        this.priceRange = priceRange;
    }

    /**
     * 
     * @return
     *     The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * 
     * @return
     *     The offers
     */
    public List<Object> getOffers() {
        return offers;
    }

    /**
     * 
     * @param offers
     *     The offers
     */
    public void setOffers(List<Object> offers) {
        this.offers = offers;
    }

    /**
     * 
     * @return
     *     The thumb
     */
    public String getThumb() {
        return thumb;
    }

    /**
     * 
     * @param thumb
     *     The thumb
     */
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    /**
     * 
     * @return
     *     The userRating
     */
    public UserRating getUserRating() {
        return userRating;
    }

    /**
     * 
     * @param userRating
     *     The user_rating
     */
    public void setUserRating(UserRating userRating) {
        this.userRating = userRating;
    }

    /**
     * 
     * @return
     *     The photosUrl
     */
    public String getPhotosUrl() {
        return photosUrl;
    }

    /**
     * 
     * @param photosUrl
     *     The photos_url
     */
    public void setPhotosUrl(String photosUrl) {
        this.photosUrl = photosUrl;
    }

    /**
     * 
     * @return
     *     The menuUrl
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * 
     * @param menuUrl
     *     The menu_url
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    /**
     * 
     * @return
     *     The featuredImage
     */
    public String getFeaturedImage() {
        return featuredImage;
    }

    /**
     * 
     * @param featuredImage
     *     The featured_image
     */
    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    /**
     * 
     * @return
     *     The hasOnlineDelivery
     */
    public Integer getHasOnlineDelivery() {
        return hasOnlineDelivery;
    }

    /**
     * 
     * @param hasOnlineDelivery
     *     The has_online_delivery
     */
    public void setHasOnlineDelivery(Integer hasOnlineDelivery) {
        this.hasOnlineDelivery = hasOnlineDelivery;
    }

    /**
     * 
     * @return
     *     The isDeliveringNow
     */
    public Integer getIsDeliveringNow() {
        return isDeliveringNow;
    }

    /**
     * 
     * @param isDeliveringNow
     *     The is_delivering_now
     */
    public void setIsDeliveringNow(Integer isDeliveringNow) {
        this.isDeliveringNow = isDeliveringNow;
    }

    /**
     * 
     * @return
     *     The deeplink
     */
    public String getDeeplink() {
        return deeplink;
    }

    /**
     * 
     * @param deeplink
     *     The deeplink
     */
    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    /**
     * 
     * @return
     *     The hasTableBooking
     */
    public Integer getHasTableBooking() {
        return hasTableBooking;
    }

    /**
     * 
     * @param hasTableBooking
     *     The has_table_booking
     */
    public void setHasTableBooking(Integer hasTableBooking) {
        this.hasTableBooking = hasTableBooking;
    }

    /**
     * 
     * @return
     *     The eventsUrl
     */
    public String getEventsUrl() {
        return eventsUrl;
    }

    /**
     * 
     * @param eventsUrl
     *     The events_url
     */
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    /**
     * 
     * @return
     *     The establishmentTypes
     */
    public List<Object> getEstablishmentTypes() {
        return establishmentTypes;
    }

    /**
     * 
     * @param establishmentTypes
     *     The establishment_types
     */
    public void setEstablishmentTypes(List<Object> establishmentTypes) {
        this.establishmentTypes = establishmentTypes;
    }

}
