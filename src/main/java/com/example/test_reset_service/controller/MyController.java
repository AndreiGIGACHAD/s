package com.example.test_reset_service.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.test_reset_service.model.Request;
import com.example.test_reset_service.model.Response;
    @Slf4j
    @RestController
    public class MyController {
        @PostMapping(value = "/feedback")
        public ResponseEntity<Response> feedback(@RequestBody Request request) {
            log.info("Входящий request : " + String.valueOf(request));
            Response response = Response.builder()
                    .uid(request.getUid())
                    .operationUid(request.getOperationUid())
                    .systemTime(request.getSystemTime())
                    .code("success")
                    .errorCode("")
                    .errorMessage("")
                    .build();
           //Response responseAfterModify = MyModifyService.modify(response);
            log.info("Исходящий response :" + String.valueOf(response));
            return new ResponseEntity<>(response, HttpStatus.OK);
        }

    }