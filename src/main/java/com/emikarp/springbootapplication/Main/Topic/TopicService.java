package com.emikarp.springbootapplication.Main.Topic;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TopicService 
{
    public List<Topic> getAllTopics() {
    
        return Arrays.asList(
        
            new Topic("Java","Java Name","Java Des"),
            new Topic("Spring","Spring Name","Spring Des"),
            new Topic("Js","Js Name","Js Des")        
        );
    }

}
