package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

//StudentService must be instantiated
//@Service Tell that it is a spring bean
@Service
public class StudentService {

    public List<Student> getStudents() {

        List<Student> list = new ArrayList<>();
        list.add(new Student(
                1L,
                "Nafees Iqbal",
                "Nafees@gmail.com",
                LocalDate.of(2000, Month.JANUARY,5),
                21));

        return list;

    }
}
