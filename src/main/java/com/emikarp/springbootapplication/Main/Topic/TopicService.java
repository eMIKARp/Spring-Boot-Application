package com.emikarp.springbootapplication.Main.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService 
{
//    private List<Topic> topics = new ArrayList<>(Arrays.asList (
//        
//            new Topic("Java","Java Name","Java Des"),
//            new Topic("Spring","Spring Name","Spring Des"),
//            new Topic("Js","Js Name","Js Des")        
//            
//    )); 
    
    @Autowired
    private TopicRepository topicRepository;
    
    public List<Topic> getAllTopics() 
    {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Optional<Topic> getTopic(String topicId) 
    {
        return topicRepository.findById(topicId);
    }

    public void addTopic(Topic topic) 
    {
        topicRepository.save(topic);
    }

    public void deleteTopic(String topicId) 
    {
        topicRepository.deleteById(topicId);
    }

    public void updateTopic(String topicId, Topic topic) 
    {
        topicRepository.save(topic);
    }

}
