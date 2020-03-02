package ru.dias.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.dias.entities.Course;

@Repository
public interface CoursesRepository extends CrudRepository<Course, Long> {
}
