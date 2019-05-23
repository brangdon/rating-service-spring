package com.service.rating.ratingservice;

import org.hibernate.validator.constraints.Range;

public class Index {
    @Range(min = 1, max = 10, message = "Movie rates must be from 1 to 10")
    private Integer value;

    public Index() {
    }

    public Index(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
