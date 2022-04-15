package com.vhs.bts.entities;

import com.vhs.bts.dto.UserDtoIn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String fullName;
    private String email;

    public UserEntity(UserDtoIn userDto) {
        setFullName(userDto.getFullName());
        setEmail(userDto.getEmail());
    }
}
