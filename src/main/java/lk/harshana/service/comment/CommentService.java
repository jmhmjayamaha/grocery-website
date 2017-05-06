package lk.harshana.service.comment;

import java.util.List;

import lk.harshana.model.Comment;

public interface CommentService {

	void createComment(Comment comment);
	List<Comment> getAllComment();
	boolean deleteComment(int id);
	
}
