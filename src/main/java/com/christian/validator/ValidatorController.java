package com.christian.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("validator")
public class ValidatorController {
    @Autowired
    private ValidatorService validatorService;
    @PostMapping("/")
    public boolean validarLinea(@RequestBody FileRequest fileRequest) {
        return validatorService.validarLinea(fileRequest);
    }
}
