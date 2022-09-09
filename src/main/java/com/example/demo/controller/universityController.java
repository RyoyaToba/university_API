package com.example.demo.controller;

import com.example.university.controller.UniversityApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController // Controllerはviewを返す。RestControllerはJsonやxmlを返す。
public class universityController implements UniversityApi {

    @Override
    public ResponseEntity<Void> university10Get() {
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> listUniversity(Integer limit, Long offset) {

        return null;
    }
}
