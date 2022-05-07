package com.slh.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course,String> {

     //dont have to implement the method just declare method
     //with findByProperty name format
     // if property is a class itself and has crud repository class we should add its inner key
     //for example here we have Topic class and id within it


     List<Course> findByTopicId(String topicId);

    //getAllTopics


//getTopic(string id)

    //updateTopic(Topic t)

    //deleteTopic(string id)


}

