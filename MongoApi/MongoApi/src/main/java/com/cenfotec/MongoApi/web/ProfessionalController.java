package com.cenfotec.MongoApi.web;


import com.cenfotec.MongoApi.domain.Professional;
import com.cenfotec.MongoApi.service.ProfessionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessionalController {

    @Autowired
    private ProfessionalService professionalService;

    @PostMapping("/professional")
    public ResponseEntity<String> addColleague(@RequestBody Professional professional) {
        professionalService.saveProfessional(professional);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
