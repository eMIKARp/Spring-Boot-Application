package com.emikarp.springbootapplication.Main.Topic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController 
{
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics()
    {
        return topicService.getAllTopics();
                
    }
    
    @RequestMapping("/topics/{topicId}")
    public Optional<Topic> getTopic(@PathVariable("topicId") String topicId)
    {
        return topicService.getTopic(topicId);
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic)
    {
        topicService.addTopic(topic);
    }
    
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable("topicId") String topicId)
    {
        topicService.updateTopic(topicId, topic);
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}")
    public void deleteTopic(@PathVariable("topicId") String topicId)
    {
        topicService.deleteTopic(topicId);
    }

}
