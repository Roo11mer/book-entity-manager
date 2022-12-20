package telran.java45.book.model;

import java.io.Serializable;
import java.util.Optional;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = { "publisherName" })
@Entity
public class Publisher implements Serializable {

	private static final long serialVersionUID = -1440133235854221438L;
	@Id
	String publisherName;
	@OneToMany(mappedBy = "publisher")
	Set<Book> books;
	
	public Publisher(String publisherName) {
		this.publisherName = publisherName;
	}

	
	public String toString() {
		return publisherName;
	}


	public Publisher orElse(Optional<Publisher> save) {
		// TODO Auto-generated method stub
		return null;
	}


	public Publisher orElseThrow(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

}
