package com.amplitude.api;

public class EventUploadRequest {

    final private int apiVersion;
    final private String apiKey;
    final private String events;
    final private String uploadTime;
    final private String checksum;
    final private String url;
    final private String bearerToken;

    public EventUploadRequest(int apiVersion,
                              String apiKey,
                              String events,
                              String uploadTime,
                              String checksum,
                              String url,
                              String bearerToken) {

        this.apiVersion = apiVersion;
        this.apiKey = apiKey;
        this.events = events;
        this.uploadTime = uploadTime;
        this.checksum = checksum;
        this.url = url;
        this.bearerToken = bearerToken;
    }

    public int getApiVersion() {
        return apiVersion;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getEvents() {
        return events;
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public String getChecksum() {
        return checksum;
    }

    public String getUrl() {
        return url;
    }

    public String getBearerToken() {
        return bearerToken;
    }
}
