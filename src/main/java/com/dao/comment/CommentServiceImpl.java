package com.dao.comment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.model.Comment;

public class CommentServiceImpl implements CommentService {

	private CommentDAOImpl comDAO = new CommentDAOImpl();
	
	
	public List<Comment> listComments(int page) {
		return comDAO.getPageComments(page);
	}

	public void addComment(Comment com) {
		comDAO.addComment(com);
		
	}

	public void deleteComment(int id) {
		comDAO.deleteComment(id);
		
	}

	public long getCount() {
		return comDAO.getCount();
	}

}
