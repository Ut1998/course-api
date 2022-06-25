package com.cg.springboot.topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@GetMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	@GetMapping("/topics/{name}")
	public List<Topic> getTopicById(@PathVariable String name) {
		return topicService.getTopic(name);
	}
	
	@PostMapping("/topics")
	public void addTopic(@RequestBody Topic topic) {
		 topicService.addTopic(topic);
	}
	
	@PutMapping("/topics/{name}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String name) {
		 topicService.updateTopic(name, topic);
	}
	
	@DeleteMapping("/topics/{id}")
	public void deleteTopic(@PathVariable Integer id) {
		 topicService.removeTopic(id);
	}

}
