package lk.harshana.service.comment;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.harshana.model.Comment;
import lk.harshana.repository.comment.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository commentRepository;
	
	@Override
	public void createComment(Comment comment) {
//		Set<String> messWord = new HashSet<String>();
//		messWord.add("fuck");
//		
//		for(String word : messWord) {
//			
//		}
		commentRepository.save(comment);
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
		Comment comment = commentRepository.findOne(id);
		if(comment != null) {
			commentRepository.delete(comment);
			return true;
		}
		return false;
	}

}
