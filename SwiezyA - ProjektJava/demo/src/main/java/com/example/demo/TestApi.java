package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("test")
public class TestApi {

    @Autowired
    private ActivityDatabase activityDatabase;

    @GetMapping("v1")
    public String test(){
        return "test";
    }

    @PostMapping(value = "activities",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void addActivity(@RequestBody Activity activity){
        activityDatabase.addActivity(activity);
    }

    @GetMapping(value = "activities",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Activity> getActivities(@Nullable @RequestParam("point") Integer point,
                                        @Nullable @RequestParam("name") String name,
                                        @Nullable @RequestParam("number") Integer number,
                                        @Nullable @RequestParam("exam") String exam)
    {
        return activityDatabase.getActivityList(point, name, number, exam);
    }

    @GetMapping(value = "activities/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getActivityById(@PathVariable("id") Integer id) {
        Activity activity = activityDatabase.getActivityById(id);
        if (activity == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(activity);
    }


    @DeleteMapping(value = "activities",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteActivites() {
        activityDatabase.deleteAll();
    }

    @DeleteMapping(value = "activities/{id}")
    public ResponseEntity deleteById(@PathVariable("id") Integer id){
        if (activityDatabase.deleteById(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

}
