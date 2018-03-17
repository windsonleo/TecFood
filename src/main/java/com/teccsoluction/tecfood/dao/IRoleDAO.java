package com.teccsoluction.tecfood.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teccsoluction.tecfood.entidade.Role;

@Repository
public interface IRoleDAO extends JpaRepository<Role, UUID> {
}
