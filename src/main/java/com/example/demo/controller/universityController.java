package com.example.demo.controller;

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
        UniversityDTO universityDTO = universityService.loadById(id);
        return ResponseEntity.ok(universityDTO);
    }
}
