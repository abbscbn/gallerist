package com.abbascoban.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abbascoban.model.RefreshToken;
import java.util.List;



@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
	
	Optional<RefreshToken> findByRefreshToken(String refreshToken);
	
	

}