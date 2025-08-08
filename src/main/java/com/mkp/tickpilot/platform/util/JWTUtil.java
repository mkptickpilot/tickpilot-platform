package com.mkp.tickpilot.platform.util;

import java.time.Instant;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

@Component
public class JWTUtil {

	private final String SECRET_KEY = "Y29tcGFzc3NpbGVuY2VsaXN0ZW53cml0ZXNvdW5kYmxhY2tmaW5nZXJza2lsbHdoZXQ=";

	public String generateToken(UUID organizationId, UUID id, String email, long durationInSeconds) {
		return JWT.create()
		.withSubject("Auth token for tickpilot")
		.withClaim("email", email)
		.withClaim("empId", id.toString())
		.withClaim("orgId", organizationId.toString())
		.withIssuedAt(Instant.now())
		.withExpiresAt(Instant.now().plusSeconds(durationInSeconds))
		.sign(Algorithm.HMAC256(SECRET_KEY));
	}

    public boolean validateToken(String token) {
        try {
            verifyToken(token);
            return true;
        } catch (JWTVerificationException e) {
            return false;
        }
    }
    
    public DecodedJWT verifyToken(String token) {
        return JWT.require(Algorithm.HMAC256(SECRET_KEY))
                  .build()
                  .verify(token);
    }
}
