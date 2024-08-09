package com.springboot.TopicProject;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TopicModel {
    @Id
    String id;
    String name;
    String Description;

    public TopicModel() {
    }

    public TopicModel(String id, String name, String description) {
        this.id = id;
        this.name = name;
        Description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
