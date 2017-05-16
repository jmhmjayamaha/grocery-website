package lk.harshana.controller.comment;

import java.util.AbstractMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lk.harshana.dto.CommentDto;
import lk.harshana.model.Comment;
import lk.harshana.service.comment.CommentService;

@RestController
@RequestMapping(value="/grocery-website/comment")
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseStatus(value=HttpStatus.CREATED)
	public void createComment(@RequestBody @Validated CommentDto commentDto) {
		commentService.createComment(new Comment(commentDto.getComment()));
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.OK)
	public AbstractMap.SimpleEntry<String, String> deleteComment(@PathVariable("id") int id) {
		if(commentService.deleteComment(id)) {
			return new AbstractMap.SimpleEntry<String, String>("status", "true");
		}
		return new AbstractMap.SimpleEntry<String, String>("status", "flase");
	}
	
	
}
