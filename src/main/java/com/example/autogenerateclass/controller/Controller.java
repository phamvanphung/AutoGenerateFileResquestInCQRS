package com.example.autogenerateclass.controller;

import com.example.autogenerateclass.controller.interfaces.IController;
import com.example.autogenerateclass.dtos.request.RegisterPathRequest;
import com.example.autogenerateclass.dtos.response.RegisterPathResponse;
import com.example.autogenerateclass.services.Services;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller  implements IController {

    private final Services services;

    @Override
    public ResponseEntity<RegisterPathResponse> registerPath(RegisterPathRequest request) {
        return new ResponseEntity<>(services.registerPath(request), HttpStatus.OK);
    }
}
