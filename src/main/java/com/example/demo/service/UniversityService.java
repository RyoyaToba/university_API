package com.example.demo.service;

import com.example.demo.entity.UniversityEntity;
import com.example.demo.error.UniversityEntityNotFoundException;
import com.example.demo.repository.UniversityMapper;
import com.example.university.model.UniversityDTO;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UniversityService {

    private final UniversityMapper universityMapper;

    public UniversityEntity loadById(Long id){
        return universityMapper.loadById(id)
                .map(record -> new UniversityEntity(record.getId(),
                record.getName(),
                record.getUniversityCategoryId(),
                record.getPrefectureId(),
                record.getGenderCategoryId()))
        .orElseThrow(() -> new UniversityEntityNotFoundException(id));
    }
}
