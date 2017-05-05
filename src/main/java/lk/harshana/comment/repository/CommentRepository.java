package lk.harshana.comment.repository;

import javax.xml.stream.events.Comment;

import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Integer> {

}
