package com.tkpark.bike.products;

public class ProductRequest {

    private Long id;

    protected ProductRequest() {/*empty*/}

    public ProductRequest(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
