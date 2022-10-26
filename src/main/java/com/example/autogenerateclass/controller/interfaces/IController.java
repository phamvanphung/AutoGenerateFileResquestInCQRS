package com.example.autogenerateclass.controller.interfaces;

import com.example.autogenerateclass.dtos.request.RegisterPathRequest;
import com.example.autogenerateclass.dtos.response.RegisterPathResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Tag(name = "Auto Change file controller")
@RequestMapping("/api/auto")
@CrossOrigin("*")
public interface IController {

    @Operation(
            summary = "Register path project",
            description = "- Register pathproject"
    )
    @PostMapping(value = "/v1/register/path")
    ResponseEntity<RegisterPathResponse> registerPath(RegisterPathRequest request);
}
