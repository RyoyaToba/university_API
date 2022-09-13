package com.example.demo.entity;

import lombok.Value;

@Value
public class UniversityEntity {

    Long id;
    String name;
    Integer universityCategoryId;
    Integer prefectureId;
    Integer genderCategoryId;
}
