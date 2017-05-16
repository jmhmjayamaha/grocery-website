package lk.harshana.controller.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lk.harshana.dto.CommentDto;
import lk.harshana.model.Comment;
import lk.harshana.service.comment.CommentService;

@RestController
@RequestMapping(value="/comment")
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.CREATED)
	public void createComment(@RequestBody @Validated CommentDto commentDto) {
		commentService.createComment(new Comment(commentDto.getComment()));
	}

}
