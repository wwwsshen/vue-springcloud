package org.ec.utils.jwt;

import com.sun.org.apache.xml.internal.security.algorithms.SignatureAlgorithm;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;

import java.security.Key;
import java.util.Date;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;




/**
 * 生成json web token
 * */
public class JwtUtil {
	private JwtUtil() {}
	
	/**
	 * 生成json web token，不包含过期时间
	 * @param    id 该项可以为用户id
	 * @param    issuer 签发者
	 * @param    subject 面向用户
	 * @param    apiKeySecret 自定义的密匙
	 * 
	 * @return String 
	 * */
	/*public static String createJWT(String id, String issuer, String subject, String apiKeySecret) {
		return createJWT(id, issuer, subject, -1, apiKeySecret);
	}*/
	
	
	/**
	 * 生成json web token
	 * @param    id 该项可以为用户id
	 * @param    issuer 签发者
	 * @param    subject 面向用户
	 * @param    ttlMillis 过期时间
	 * @param    apiKeySecret 自定义的密匙
	 * 
	 * @return String 
	 * */
	/*public static String createJWT(String id, String issuer, String subject, long ttlMillis, String apiKeySecret) {
		 
		//The JWT signature algorithm we will be using to sign the token
		SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
		 
		long nowMillis = System.currentTimeMillis();
		Date now = new Date(nowMillis);
		 
		//We will sign our JWT with our ApiKey secret
		byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(apiKeySecret);
		Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());
		 
		  //Let's set the JWT Claims
		JwtBuilder builder = Jwts.builder().setId(id)
		                                .setIssuedAt(now)
		                                .setSubject(subject)
		                                .setIssuer(issuer)
		                                .signWith(signatureAlgorithm, signingKey);
		 
		//if it has been specified, let's add the expiration
		if (ttlMillis >= 0) {
		    long expMillis = nowMillis + ttlMillis;
		    Date exp = new Date(expMillis);
		    builder.setExpiration(exp);
		}
		 
		//Builds the JWT and serializes it to a compact, URL-safe string
		return builder.compact();
		}*/
}
