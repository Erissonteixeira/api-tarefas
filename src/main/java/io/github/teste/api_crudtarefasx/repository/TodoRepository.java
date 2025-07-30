package io.github.teste.api_crudtarefasx.repository;

import io.github.teste.api_crudtarefasx.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
