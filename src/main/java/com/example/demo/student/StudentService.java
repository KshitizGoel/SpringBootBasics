package com.example.demo.student;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class StudentService {
    //Hardcoding the data for now until we connect to the real database....
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        "Taya Miller",
                        4L,
                        22,
                        LocalDate.of(1999, 3, 4),
                        "tayaMiller@gmail.com"
                ),
                new Student(
                        "Mayank Mittal",
                        6L,
                        20,
                        LocalDate.of(2001, 6, 8),
                        "mayamusk@gmail.com"
                ),
                new Student(
                        "Ishaan Aggarwal",
                        7L,
                        20,
                        LocalDate.of(2001, 7, 2),
                        "ishanAgg@gmail.com"
                )
        );
    }

}
