package com.trigyn.librarymanagement.controller;

import com.trigyn.librarymanagement.model.TagVO;
import com.trigyn.librarymanagement.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TagController {
    @Autowired
    TagService tagService;
    @GetMapping("/tag")
    List<TagVO> gettag(){
        return tagService.getAll();
    }

    @PostMapping("/tag")
    Boolean createTag(@RequestBody TagVO tagVO){
        return tagService.createtag(tagVO);
    }
}