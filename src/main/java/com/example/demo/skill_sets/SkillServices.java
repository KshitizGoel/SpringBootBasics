package com.example.demo.skill_sets;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SkillServices {

    //Hardcoding the data for now. It will be retrieved from the realtime database..

    public List<Skills> getSkills() {

        return List.of(
                new Skills(
                        "Flutter Development",
                        "Professional",
                        1.5),
                new Skills(
                        "Android Development",
                        "Professional",
                        2),
                new Skills(
                        "Java",
                        "Professional",
                        2),
                new Skills(
                        "Dart",
                        "Professional",
                        1.5),
                new Skills(
                        "Python",
                        "Intermediate",
                        0.4),
                new Skills(
                        "Spring Boot Development",
                        "Amateur",
                        0.1)

        );

    }

}
