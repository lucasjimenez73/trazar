package ar.edu.unsl.trazar.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Usuario {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(unique = true,length = 50,nullable = false)
    private String userName;

    @Column(nullable = false,length = 50)
    private String password;
}
