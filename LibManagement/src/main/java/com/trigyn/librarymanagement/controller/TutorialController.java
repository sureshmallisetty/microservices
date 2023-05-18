package com.trigyn.librarymanagement.controller;

import com.trigyn.librarymanagement.model.TutorialVO;
import com.trigyn.librarymanagement.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TutorialController {
    @Autowired
    TutorialService tutorialService;
    @GetMapping("/tutorial")
    List<TutorialVO> getTutorial(){
        return tutorialService.getAll();
    }

    @PostMapping("/tutorial")
    Boolean createTutorial(@RequestBody TutorialVO tutorialVO){
        return tutorialService.createTutorial(tutorialVO);
    }
}
