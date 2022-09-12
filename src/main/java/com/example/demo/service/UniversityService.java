package com.example.demo.service;

import com.example.demo.repository.UniversityMapper;
import com.example.university.model.UniversityDTO;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UniversityService {

    private final UniversityMapper universityMapper;

    public UniversityDTO loadById(Long id){
        return universityMapper.loadById(id);
    }
}
