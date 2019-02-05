package com.nexteducation.app.model.response;

import com.nexteducation.app.model.request.BinaryTree;

/**
 * @author harishe
 *
 */
public class DataStructureResponse {
	private int number;
	
	private Long first;
	
	private Long second;
	
	private Long sum;
	
	private BinaryTree bstree;
	
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Long getFirst() {
		return first;
	}

	public void setFirst(Long first) {
		this.first = first;
	}

	public Long getSecond() {
		return second;
	}

	public void setSecond(Long second) {
		this.second = second;
	}

	public Long getSum() {
		return sum;
	}

	public void setSum(Long sum) {
		this.sum = sum;
	}

	public BinaryTree getBstree() {
		return bstree;
	}

	public void setBstree(BinaryTree bstree) {
		this.bstree = bstree;
	}
	
	
	
	
}
