package lk.harshana.service.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.harshana.model.Comment;
import lk.harshana.model.Product;
import lk.harshana.repository.comment.CommentRepository;
import lk.harshana.repository.product.ProductRepository;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository commentRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void createComment(int id , Comment comment) {
		Product product = productRepository.findOne(id);
		
		comment.setProduct(product);
		commentRepository.save(comment);
	}

//	@Override
//	public List<Comment> getAllComment() {
//		List<Comment> list = (List<Comment>) commentRepository.findAll();
//		
//		if(list.isEmpty()) {
//			return null;
//		} else {
//			return list;
//		}
//	}

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
