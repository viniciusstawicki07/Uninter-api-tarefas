package br.com.uninter.api_tarefas.repository;

import br.com.uninter.api_tarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}