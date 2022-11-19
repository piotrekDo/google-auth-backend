package com.codecool.marwin1991.security;

import com.codecool.marwin1991.config.AppConfig;
import io.jsonwebtoken.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Date;

@Slf4j
@Service
@RequiredArgsConstructor
public class TokenProvider {

    private final AppConfig appConfig;

    public String createToken(Authentication authentication) {
        throw new RuntimeException("not implemented");
    }

    public String getUserIdFromToken(String token) {
        throw new RuntimeException("not implemented");
    }

    public boolean validateToken(String token) {
        throw new RuntimeException("not implemented");
    }
}
