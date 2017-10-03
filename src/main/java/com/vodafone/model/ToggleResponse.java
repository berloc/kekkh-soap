package com.vodafone.model;

/**
 * Created by balint on 10/2/17.
 */
public class ToggleResponse {

    private Boolean isSuccessful;

    public void setIsSuccessful(Boolean isSuccessful) {
        this.isSuccessful = isSuccessful;
    }

    public ToggleResponse(){
        this.isSuccessful = true;
    }

    public Boolean getSuccessful() {
        return isSuccessful;
    }

    public void setSuccessful(Boolean successful) {
        isSuccessful = successful;
    }
}
