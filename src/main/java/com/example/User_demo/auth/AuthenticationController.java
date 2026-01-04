package com.example.User_demo.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request){

    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationRequest> rigister(@RequestBody  AuthenticationRequest request){

    }
}
