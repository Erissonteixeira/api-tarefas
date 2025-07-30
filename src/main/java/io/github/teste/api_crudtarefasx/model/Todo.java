package io.github.teste.api_crudtarefasx.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nome;
    private String descricao;
    private boolean realizado;
    private int prioridade;
}
