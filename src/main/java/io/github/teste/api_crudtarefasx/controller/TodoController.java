        package io.github.teste.api_crudtarefasx.controller;

    import io.github.teste.api_crudtarefasx.model.Todo;
    import io.github.teste.api_crudtarefasx.service.TodoService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    @RestController
    @RequestMapping("/todos")
    public class TodoController {
        private TodoService todoService;

        public TodoController(TodoService todoService) {
          this.todoService = todoService;
        }
        @PostMapping
        public ResponseEntity<Todo> create(@RequestBody Todo todo){
            Todo created = todoService.create(todo);
            return ResponseEntity.ok(created);
        }
        @GetMapping
        public List<Todo> list(){
            return todoService.list();
        }
        @PutMapping
        public ResponseEntity<Todo> update(@RequestBody Todo todo){
            Todo updated = todoService.update(todo);
            return ResponseEntity.ok(updated);

        }
        @DeleteMapping("{id}")
        public ResponseEntity<Void> delete(@PathVariable("id") Long id){
            boolean deleted = todoService.delete(id);
            if (deleted){
                return ResponseEntity.noContent().build();
            } else {
                return ResponseEntity.notFound().build();
            }

        }
    }
