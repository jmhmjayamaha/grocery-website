package lk.harshana.dto;

import javax.validation.constraints.NotNull;

public class CommentDto {

	@NotNull
	private String comment;
	
	public CommentDto() {
		
	}

	public CommentDto(String comment) {
		super();
		this.comment = comment;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
