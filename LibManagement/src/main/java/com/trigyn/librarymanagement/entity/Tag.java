package com.trigyn.librarymanagement.entity;



import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Tag {
    @Id
    private Long id;
    @Column(name = "name")
    private String name;
    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "tags")

    private Set<Tutorial> tutorials = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Tutorial> getTutorials() {
        return tutorials;
    }

    public void setTutorials(Set<Tutorial> tutorials) {
        this.tutorials = tutorials;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tutorials=" + tutorials +
                '}';
    }
}

