package com.trigyn.librarymanagement.service;

import com.trigyn.librarymanagement.entity.Tag;
import com.trigyn.librarymanagement.model.TagVO;
import com.trigyn.librarymanagement.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TagService {

    @Autowired
    TagRepository tagRepository;
    private Tag convertVO(TagVO tagVO) {
        Tag tag = new Tag();
        tag.setId(tagVO.getId());
        tag.setName(tagVO.getName());
        return tag;
    }
    private TagVO convertEntity(Tag tag){
        TagVO tagVO = new TagVO();
        tagVO.setId(tag.getId());
        tagVO.setName(tag.getName());
        return tagVO;
    }

    public Boolean createtag(TagVO tagVO) {
        Tag tag = convertVO(tagVO);
        try {
            tagRepository.save(tag);
        } catch (Exception exception) {
            return false;
        }
        return true;
    }
    public List<TagVO> getAll(){
        List<TagVO> tagList = new ArrayList<>();
        for(Tag tag : tagRepository.findAll()){
            tagList.add(convertEntity(tag));
        }
        return tagList;
    }
}