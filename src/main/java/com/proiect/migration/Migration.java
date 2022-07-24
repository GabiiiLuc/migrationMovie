package com.proiect.migration;

import java.util.Date;
import java.util.List;

public class Migration {
    private Long id;
    private String url;
    private String state;
    private List<Movie> items;
    private String failReason;
    private int totalItemsNumber;
    private int migratedItemsNumber;
    private int failedItemsNumber;

    public Migration() {
    }

    public Migration(Long id, String url, String state, List<Movie> items, String failReason, int totalItemsNumber, int migratedItemsNumber, int failedItemsNumber) {
        this.id = id;
        this.url = url;
        this.state = state;
        this.items = items;
        this.failReason = failReason;
        this.totalItemsNumber = totalItemsNumber;
        this.migratedItemsNumber = migratedItemsNumber;
        this.failedItemsNumber = failedItemsNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<Movie> getItems() {
        return items;
    }

    public void setItems(List<Movie> items) {
        this.items = items;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public int getTotalItemsNumber() {
        return totalItemsNumber;
    }

    public void setTotalItemsNumber(int totalItemsNumber) {
        this.totalItemsNumber = totalItemsNumber;
    }

    public int getMigratedItemsNumber() {
        return migratedItemsNumber;
    }

    public void setMigratedItemsNumber(int migratedItemsNumber) {
        this.migratedItemsNumber = migratedItemsNumber;
    }

    public int getFailedItemsNumber() {
        return failedItemsNumber;
    }

    public void setFailedItemsNumber(int failedItemsNumber) {
        this.failedItemsNumber = failedItemsNumber;
    }

    @Override
    public String toString() {
        return "Migration{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", state='" + state + '\'' +
                ", items=" + items +
                ", failReason='" + failReason + '\'' +
                ", totalItemsNumber=" + totalItemsNumber +
                ", migratedItemsNumber=" + migratedItemsNumber +
                ", failedItemsNumber=" + failedItemsNumber +
                '}';
    }
}
