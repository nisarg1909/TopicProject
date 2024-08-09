package com.springboot.TopicProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<TopicModel> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public TopicModel getTopicsById(@PathVariable("id") String id){
        return topicService.getTopicById(id);
    }

    @RequestMapping("/topics/name/{name}")
    public List<TopicModel> getTopicsByName(@PathVariable("name") String name){
        return topicService.getTopicByName(name);
    }

    @RequestMapping(method= RequestMethod.POST, value="/topics")
    public String addTopics(@RequestBody TopicModel t){
        topicService.addTopics(t);
        return "Book Added Successfully";
    }

    @RequestMapping(method= RequestMethod.PUT, value="/topics")
    public String updateTopics(@RequestBody TopicModel t){
        topicService.updateTopics(t);
        return "Book Updated Successfully";
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/topics")
    public String deleteTopics(@RequestBody TopicModel t){
        topicService.deleteTopics(t);
        return "Book deleted Successfully";
    }

}
