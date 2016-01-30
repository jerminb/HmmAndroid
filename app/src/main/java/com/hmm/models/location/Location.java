package com.hmm.models.location;

import com.hmm.models.BaseHmmModel;

/**
 * Created by code1 on 27/01/16.
 */
public class Location extends BaseHmmModel {
    private String latitude;
    private String longitude;

    public Location(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
