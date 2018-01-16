package com.tasks.service;

import com.tasks.domain.Task;

public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);
}
