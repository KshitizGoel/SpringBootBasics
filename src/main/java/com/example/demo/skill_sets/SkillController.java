package com.example.demo.skill_sets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/students/skills")
public class SkillController {

    private final SkillServices skillServices;

    @Autowired
    public SkillController(SkillServices skillServices){
        this.skillServices = skillServices;
    }


    @GetMapping
    public List<Skills> getSkillsFromServices(){
        return skillServices.getSkills();
    }

}
