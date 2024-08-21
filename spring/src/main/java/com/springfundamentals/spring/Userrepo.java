package com.springfundamentals.spring;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

//package com.springfundamentals.spring;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class Userrepo {
    private final JdbcTemplate jdbcTemplate;

    public Userrepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void add(Users user) {
        String sql = "INSERT INTO USERS (name) VALUES (?)";
        jdbcTemplate.update(sql, user.getName());
    }

    public Users getbyname(String name) {
        String sql = "SELECT * FROM USERS WHERE name = ?";
        return jdbcTemplate.queryForObject(sql, new Usermapper(), name);
    }

    private static class Usermapper implements RowMapper<Users> {
        @Override
        public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Users(rs.getInt("id"), rs.getString("name"));
        }
    }
}
//i dont understand te usuage of this classusermapper(), like any column name give it
//retrieves all values corresponding to that , that's all i know .
