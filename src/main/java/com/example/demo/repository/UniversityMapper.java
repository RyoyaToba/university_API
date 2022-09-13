package com.example.demo.repository;

import com.example.demo.entity.UniversityEntity;
import com.example.demo.record.UniversityRecord;
import com.example.university.model.UniversityDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

@Mapper
public interface UniversityMapper {
    @Select("SELECT * FROM university WHERE id = #{id}")
    Optional<UniversityRecord> loadById(Long id);
}
