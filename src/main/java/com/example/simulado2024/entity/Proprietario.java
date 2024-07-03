package com.example.simulado2024.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Proprietario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min = 5, max = 50, message = "O nome deve conter de 5 a 50 caracteres")
    private String nome;

    private String cpf;

    @Email(message = " O Email não é válido")
    private String email;

    private String telefone;

    private String endereco;

    @Past(message = "A data de nascimento deve ser passada")
    private LocalDate dataNascimento;

    private LocalDate dataCadastro;

    @OneToMany(mappedBy = "proprietarios")
    private List<Imovel> imoveis;
}
