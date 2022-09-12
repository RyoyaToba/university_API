package com.example.demo.repository;

import com.example.university.model.UniversityDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UniversityMapper {
    @Select("SELECT * FROM university WHERE id = #{id}")
    UniversityDTO loadById(Long id);
}
