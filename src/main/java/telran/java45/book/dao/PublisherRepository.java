package telran.java45.book.dao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import telran.java45.book.model.Publisher;

public interface PublisherRepository {
	
	@Query("select p.publisherName from Book b join b.authors a join b.publisher p where a.name = ?1")
	List<String> findPublishersByAuthor(String authorName);
	
	Stream<Publisher> findDistinctByBookAuthorsName(String authorName);

	Publisher save(Publisher publisher);

	Optional<Publisher> findById(String publisher);
}
