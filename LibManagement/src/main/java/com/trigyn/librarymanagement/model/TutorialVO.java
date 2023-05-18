package com.trigyn.librarymanagement.model;

import java.util.HashSet;
import java.util.Set;

public class TutorialVO {

    private Set<Long> tags = new HashSet<>();
    private Long id;
    private String title;
    private String description;
    private boolean published;

    public Set<Long> getTags() {
        return tags;
    }

    public void setTags(Set<Long> tags) {
        this.tags = tags;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    @Override
    public String toString() {
        return "TutorialVO{" +
                "tags=" + tags +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", published=" + published +
                '}';
    }
}
