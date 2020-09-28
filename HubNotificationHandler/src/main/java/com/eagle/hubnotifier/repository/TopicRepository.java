package com.eagle.hubnotifier.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.eagle.hubnotifier.model.HubTopic;

public interface TopicRepository extends MongoRepository<HubTopic, String> {
	public HubTopic findByKey(String key);
}
