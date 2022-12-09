package com.example.demoSample;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@AllArgsConstructor
@Slf4j
public class Controller {

    @GetMapping("/Helo")
    public ResponseEntity<GenericResponseDto> hello(){
        log.info("Checking");
        ArrayList<String> demo=new ArrayList<>();

        demo.add("Hello");
        demo.add("Anil");
        return new ResponseEntity<>(new GenericResponseDto<>(200,demo),HttpStatus.ACCEPTED);
    }

    @GetMapping("/demo")
    public ResponseEntity<GenericResponseDto> checking(@RequestParam String name, @RequestParam String value){

        log.info("Checking name={}",name);
        log.info("Checking value={}",value);

        return new ResponseEntity<>(new GenericResponseDto(200,"hi"), HttpStatus.ACCEPTED);
    }

}
