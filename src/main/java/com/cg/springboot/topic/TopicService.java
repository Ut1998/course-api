package com.cg.springboot.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getAllTopics() {
		return topicRepository.findAll();
	}
	
	public List<Topic> getTopic(String name) {
		return topicRepository.findByName(name);
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(String name, Topic topic) {
		topicRepository.save(topic);
	}

	public void removeTopic(Integer id) {
		topicRepository.deleteById(id);		
	}

}
