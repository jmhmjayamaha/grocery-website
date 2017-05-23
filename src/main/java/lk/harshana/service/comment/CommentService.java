package lk.harshana.service.comment;

import lk.harshana.model.Comment;

public interface CommentService {

	void createComment(int id,Comment comment);
//	List<Comment> getAllComment();
	boolean deleteComment(int id);
	
}
