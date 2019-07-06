package com.learn.app;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class ListController {

    @RequestMapping(path = "/question/{id}", method = RequestMethod.GET)
    public ResponseEntity getQuestion(@PathVariable("id") Integer id ){

        List<String> seriesList= Arrays.asList("Got My First Question: "+id);
        return new ResponseEntity<>(seriesList,HttpStatus.OK);
    }
}
