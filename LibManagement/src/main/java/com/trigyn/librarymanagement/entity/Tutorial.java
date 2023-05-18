package com.trigyn.librarymanagement.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tutorial {
    @Id
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "published")
    private boolean published;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "tutorial_tags", joinColumns = {@JoinColumn(name = "tutorial_id")}, inverseJoinColumns = {@JoinColumn(name = "tag_id")})
    private List<Tag> tags = new ArrayList<>();

    public void setTags(List<Tag> tags) {
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

    public List<Tag> getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return "Tutorial{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", published=" + published +
                ", tags=" + tags +
                '}';
    }
}
