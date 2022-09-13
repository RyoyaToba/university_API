package com.example.demo.record;

import lombok.Value;

@Value
public class UniversityRecord {

    Long id;
    String name;
    Integer universityCategoryId;
    Integer prefectureId;
    Integer genderCategoryId;
}
