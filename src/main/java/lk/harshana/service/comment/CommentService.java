package lk.harshana.comment.service;

import java.util.List;

import javax.xml.stream.events.Comment;

public interface CommentService {

	void createComment(Comment comment);
	List<Comment> getAllComment();
	boolean deleteComment(int id);
	
}
