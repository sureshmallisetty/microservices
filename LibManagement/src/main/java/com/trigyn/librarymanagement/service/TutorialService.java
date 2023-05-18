package com.trigyn.librarymanagement.service;

import com.trigyn.librarymanagement.entity.Tag;
import com.trigyn.librarymanagement.entity.Tutorial;
import com.trigyn.librarymanagement.model.TutorialVO;
import com.trigyn.librarymanagement.repository.TagRepository;
import com.trigyn.librarymanagement.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TutorialService {
    @Autowired
    TutorialRepository tutorialRepository;
    @Autowired
    TagRepository tagRepository;
    private Tutorial convertVO(TutorialVO tutorialVO) {
        Tutorial tutorial = new Tutorial();
        tutorial.setId(tutorialVO.getId());
        tutorial.setDescription(tutorialVO.getDescription());
        if(tutorial.getTags()!=null){
            List<Tag> tagList = tagRepository.findAllById(tutorialVO.getTags());
            tutorial.setTags(tagList);
        }
        tutorial.setTitle(tutorialVO.getTitle());
        tutorial.setPublished(tutorialVO.isPublished());

        return tutorial;
    }
    private TutorialVO convertEntity(Tutorial tutorial){
        TutorialVO tutorialVO = new TutorialVO();
        tutorialVO.setId(tutorial.getId());
        tutorialVO.setTitle(tutorial.getTitle());
        tutorialVO.setDescription(tutorial.getDescription());
        return tutorialVO;
    }

    public Boolean createTutorial(TutorialVO tutorialVO) {
        Tutorial tutorial = convertVO(tutorialVO);
        try {
            tutorialRepository.save(tutorial);
        } catch (Exception exception) {
            return false;
        }
        return true;
    }
    public List<TutorialVO> getAll(){
        List<TutorialVO> tutorialList = new ArrayList<>();
        for(Tutorial tutorial : tutorialRepository.findAll()){
            tutorialList.add(convertEntity(tutorial));
        }
        return tutorialList;
    }
}
