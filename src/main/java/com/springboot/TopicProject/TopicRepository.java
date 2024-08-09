package com.springboot.TopicProject;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicRepository extends CrudRepository<TopicModel,String> {
    List<TopicModel> findAllByName(String name);
}
