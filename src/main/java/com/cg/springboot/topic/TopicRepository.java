package com.cg.springboot.topic;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Integer> {
	List<Topic> findByName(String name);

	void deleteByName(String name);
}
