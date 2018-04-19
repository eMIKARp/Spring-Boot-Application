package com.emikarp.springbootapplication.Main.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TopicService 
{
    private List<Topic> topics = new ArrayList<>(Arrays.asList (
        
            new Topic("Java","Java Name","Java Des"),
            new Topic("Spring","Spring Name","Spring Des"),
            new Topic("Js","Js Name","Js Des")        
            
    )); 
    
    public List<Topic> getAllTopics() 
    {
        return topics;
    }

    public Topic getTopic(String topicId) 
    {
        return topics.stream().filter(t -> t.getId().equals(topicId)).findFirst().get();
    }

    public void addTopic(Topic topic) 
    {
        topics.add(topic);
    }

    public void deleteTopic(String topicId) 
    {
        topics.removeIf(t -> t.getId().equals(topicId));
    }

    public void updateTopic(String topicId, Topic topic) 
    {
        for (int i = 0; i < topics.size(); i++)
        {
            if (topics.get(i).getId().equals(topicId))
            {
                topics.set(i, topic);
                return;
            }
        }
    }

}
