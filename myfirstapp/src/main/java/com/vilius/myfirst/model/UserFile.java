package com.vilius.myfirst.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
public class UserFile {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "Id", table = "USER_FILE", updatable = false, nullable = false, unique = true)
    private Long Id;
    @NotNull
    @Max(50)
    @Column(name = "Name", table = "USER_FILE", updatable = true, nullable = false, length = 50)
    private String Name;
    @Max(100)
    @Column(name = "Location", table = "USER_FILE", updatable = true, nullable = false, length = 100)
    private String Location;
    @NotNull
    @Column(name = "Text", table = "USER_FILE", updatable = true, nullable = false)
    private String Text;
}