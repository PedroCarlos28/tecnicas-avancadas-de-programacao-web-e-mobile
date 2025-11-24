package br.edu.fatecou.projetoback.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    private int codigo;
    private String nome;
    private String cpf;
    private double altura;
    private double peso;
}
