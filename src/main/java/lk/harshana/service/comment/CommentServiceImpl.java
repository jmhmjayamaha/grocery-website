package lk.harshana.service.comment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import lk.harshana.model.Comment;
import lk.harshana.repository.comment.CommentRepository;

public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository commentRepository;
	@Override
	public void createComment(Comment comment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Comment> getAllComment() {
		List<Comment> list = (List<Comment>) commentRepository.findAll();
		
		if(list.isEmpty()) {
			return null;
		} else {
			return list;
		}
	}

	@Override
	public boolean deleteComment(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
