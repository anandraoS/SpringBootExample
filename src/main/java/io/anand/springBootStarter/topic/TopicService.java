package io.anand.springBootStarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> allTopics = new ArrayList<Topic>(Arrays.asList(new Topic("12", "spring", "learning"),
			new Topic("13", "spring boot", "learning boot"), new Topic("14", "angular", "learning angular")));

	public List<Topic> getAllTopics() {
		return this.allTopics;
	}

	public Topic getTopic(String id) {
		return this.allTopics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		this.allTopics.add(topic);
	}
}
