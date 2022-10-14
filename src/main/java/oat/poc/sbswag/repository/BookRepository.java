package oat.poc.sbswag.repository;

import oat.poc.sbswag.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
