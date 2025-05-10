package com.designpatterns.saga;
//add status and id fields

public class Order {
    private Long id;
    private String status;

    // Other order-related fields

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Other getters and setters
}
