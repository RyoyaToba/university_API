package com.example.demo.controller;

import com.example.demo.entity.UniversityEntity;
import com.example.demo.service.UniversityService;
import com.example.university.controller.UniversityApi;
import com.example.university.model.UniversityDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController // Controllerはviewを返す。RestControllerはJsonやxmlを返す。
@RequiredArgsConstructor
public class universityController implements UniversityApi {

    private final UniversityService universityService;

    @Override
    public ResponseEntity<Void> listUniversity(Integer limit, Long offset) {
        return null;
    }

    @Override
    public ResponseEntity<UniversityDTO> universityIdGet(Long id) {
        UniversityEntity universityEntity = universityService.loadById(id);
        UniversityDTO universityDTO = new UniversityDTO();

        universityDTO.setId(universityEntity.getId());
        universityDTO.setName(universityEntity.getName());
        universityDTO.setUniversityCategoryId(universityEntity.getUniversityCategoryId());
        universityDTO.setPrefectureId(universityEntity.getPrefectureId());
        universityDTO.setGenderCategoryId(universityEntity.getGenderCategoryId());
        return ResponseEntity.ok(universityDTO);
    }





}
