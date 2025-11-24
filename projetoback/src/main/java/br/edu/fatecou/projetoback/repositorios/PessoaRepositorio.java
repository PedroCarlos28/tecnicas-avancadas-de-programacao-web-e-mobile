package br.edu.fatecou.projetoback.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecou.carro.entidades.Pessoa;

public interface CarroRepositorio extends JpaRepository<Pessoa, String> {
    
}