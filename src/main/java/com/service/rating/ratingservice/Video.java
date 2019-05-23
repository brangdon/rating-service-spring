package com.service.rating.ratingservice;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.Range;
import org.springframework.data.annotation.Id;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Video {
    @Id
    public ObjectId _id;

    @Valid
    @NotNull(message = "Field ratings cannot be null")
    public List<Index> ratings;

    @NotEmpty(message = "Title may not be empty")
    @Size(min = 2, max = 32, message = "Title must be between 2 and 32 characters long")
    public String title;

    @NotEmpty(message = "Type may not be empty")
    @Size(min = 3, max = 22, message = "Type must be between 3 and 22 characters long")
    public String type;

    @JsonFormat(pattern = "dd-MM-yyyy")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    @NotNull(message = "Field date cannot be null")
    public LocalDate production_date;

    public Video() {
    }

    public Video(ObjectId id, List<Index> ratings, String title, String type, LocalDate production_date) {
        this._id = id;
        this.ratings = ratings;
        this.title = title;
        this.type = type;
        this.production_date = production_date;
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public List<Index> getRatings() {
        return ratings;
    }

    public void setRatings(List<Index> ratings) {
        this.ratings = ratings;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getProduction_date() {
        return production_date;
    }

    public void setProductionDate(LocalDate production_date) {
        this.production_date = production_date;
    }
}
