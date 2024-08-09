package com.springboot.TopicProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;

    public List<TopicModel> getAllTopics(){
        List<TopicModel> topicList = new ArrayList<>();
         topicRepository.findAll().forEach(topicList::add);
         return topicList;
    }

    public TopicModel getTopicById(String id){
        return topicRepository.findById(id).get();
    }

    public List<TopicModel> getTopicByName(String name){
        return topicRepository.findAllByName(name);
    }

    public void addTopics(TopicModel t){
       topicRepository.save(t);
    }

    public void updateTopics(TopicModel t){
        topicRepository.save(t);
    }

    public void deleteTopics(TopicModel t){
        topicRepository.delete(t);
    }

}
