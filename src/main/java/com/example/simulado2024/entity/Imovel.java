package com.example.simulado2024.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min = 10, max = 30, message = "O nome deve conter de 10 a 30 caracteres")
    private String endereco;

    private Tipos tipos;

    @Min(value = 1, message = "O número minimo é 1")
    @Max(value = 10, message = "O numero maximo é 10")
    private double tamanho;

    @Max(value = 10, message = "O numero maximo é 10")
   private int numeroQuartos;

    @Max(value = 5, message = "O numero maximo é 5")
   private int numeroBanheiros;

    @Max(value = 5, message = "O numero maximo é 5")
   private double valor;

   private LocalDate dataCadastro;

   @ManyToOne
   private Proprietario proprietario;

}
