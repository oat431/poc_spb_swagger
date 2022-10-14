package oat.poc.sbswag.config;

import lombok.RequiredArgsConstructor;
import oat.poc.sbswag.entity.Book;
import oat.poc.sbswag.repository.BookRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    final BookRepository bookRepository;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        bookRepository.save(Book.builder().title("The Lord of the Rings").author("J.R.R. Tolkien").isbn("978-0544003415").build());
        bookRepository.save(Book.builder().title("The Hobbit").author("J.R.R. Tolkien").isbn("978-0547928227").build());
        bookRepository.save(Book.builder().title("The Silmarillion").author("J.R.R. Tolkien").isbn("978-0547928227").build());
    }
}