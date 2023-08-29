package com.example.demo;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class ActivityDatabase {

    private List<Activity> activityList = new ArrayList<>();

    private int activityIndex = 1;

    public List<Activity> getActivityList(Integer point, String name, Integer number, String exam) {
        if (number == null && exam == null) {
            return activityList;
        }
        List<Activity> filteredActivities = new ArrayList<>();
        for (Activity activity : activityList) {
            if (exam == null && activity.getNumber().equals(number)) {
                filteredActivities.add(activity);
            } else if (number == null && activity.getExam().equals(exam)) {
                filteredActivities.add(activity);
            } else if (activity.getNumber().equals(number) && activity.getExam().equals(exam)){
                filteredActivities.add(activity);
            }
        }
        return filteredActivities;
    }

    public void addActivity(Activity element){
        element.setId(activityIndex);
        activityList.add(element);
        activityIndex = activityIndex + 1;
    }

    public void deleteAll(){
        activityList.clear();
    }

    public Activity getActivityById(Integer id) {
        for (Activity element : activityList) {
            if (element.getId().equals(id)) {
                return element;
            }
        }
        return null;
    }

    public boolean deleteById(Integer id){
    Activity activityToDelete = null;
    for (Activity element: activityList) {
        if (element.getId().equals(id)) {
            activityToDelete = element;
            }
        }
    if (activityToDelete == null) {
        return false;
    }
    activityList.remove(activityToDelete);
    return true;
    }
}
