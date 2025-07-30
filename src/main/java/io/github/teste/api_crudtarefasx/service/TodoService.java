package io.github.teste.api_crudtarefasx.service;

import io.github.teste.api_crudtarefasx.model.Todo;
import io.github.teste.api_crudtarefasx.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Todo create(Todo todo){
        return todoRepository.save(todo);
    }

    public List<Todo> list(){
        return todoRepository.findAll();
    }
    public Todo update(Todo todo){
        return todoRepository.save(todo);
    }
    public boolean delete(Long id){
        if (todoRepository.existsById(id)){
            todoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
