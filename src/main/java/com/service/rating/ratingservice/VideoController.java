package com.service.rating.ratingservice;

import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/video")
//@EnableWebMvc
public class VideoController {

    @Autowired
    private VideoRepository repository;

    @RequestMapping(value = "/all", method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE} )
    public List<Video> getAllVideos() {
        return repository.findAll();
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    @ResponseBody
    public String hello() {
        return "hello";
    }
//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public Video getVideo(@PathVariable("id") ObjectId id) {
//        return repository.findBy_id(id);
//    }
//
//    @RequestMapping(value = "/rating/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<Integer> getVideoRating(@PathVariable("id") ObjectId id) {
//        return repository.findBy_id(id).getRatings();
//    }

    @RequestMapping(value = "/rating/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseBody
    public Video addVideoRating(@PathVariable("id") ObjectId id, @Valid @RequestBody Index rate) {
        Video video = repository.findBy_id(id);

        System.out.println("@@ " + rate);
        video.getRatings().add(rate);
        repository.save(video);
        return video;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE} )
//    @ResponseBody
    public Video addVideo(@Valid @RequestBody Video video) {
        return repository.save(video);
    }

}
