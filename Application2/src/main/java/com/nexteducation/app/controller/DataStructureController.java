package com.nexteducation.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nexteducation.app.model.request.BinaryTree;
import com.nexteducation.app.model.request.Node;
import com.nexteducation.app.model.response.AbstractResponse;
import com.nexteducation.app.model.response.DataStructureResponse;
import com.nexteducation.app.model.service.core.DataStructureService;

@RestController
public class DataStructureController {
	
	@Autowired
	DataStructureService dataStructureService;
	
	@RequestMapping(value="/DataStructures/addTwoNumbers/{first}/{second}", method=RequestMethod.GET)
	public AbstractResponse<DataStructureResponse> addTwoNumbers(@PathVariable Long first, @PathVariable Long second){
		AbstractResponse<DataStructureResponse> response = new AbstractResponse();
		response = dataStructureService.addTwoNumbers(first, second);
		return response;
	}
	
	@RequestMapping(value="/DS/binaryTree", method = RequestMethod.GET)
	public AbstractResponse<DataStructureResponse> leastCommonAnsistor(){
		AbstractResponse<DataStructureResponse> response = new AbstractResponse();
		BinaryTree btree = new BinaryTree();
		Node node = new Node(1);
		btree.setRoot(node);
		btree.getRoot().setLeft(new Node(2));
		btree.getRoot().setRight(new Node(3));
		btree.getRoot().getLeft().setLeft(new Node(4));
		btree.getRoot().getLeft().setRight(new Node(5));
		btree.getRoot().getRight().setLeft(new Node(6));
		btree.getRoot().getRight().setRight(new Node(7));
		
		response = dataStructureService.getleastCommonAnsistor(btree, 4, 5);
		return response;
	}

}
