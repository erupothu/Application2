package com.nexteducation.app.model.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nexteducation.app.model.request.BinaryTree;
import com.nexteducation.app.model.request.Node;
import com.nexteducation.app.model.response.AbstractResponse;
import com.nexteducation.app.model.response.DataStructureResponse;
import com.nexteducation.app.model.service.core.DataStructureService;


@Service
public class DataStructureServiceImpl implements DataStructureService{

	@Override
	public AbstractResponse<DataStructureResponse> addTwoNumbers(Long first, Long second) {
		// TODO Auto-generated method stub
		AbstractResponse<DataStructureResponse> response = new AbstractResponse();
		List<DataStructureResponse> sumResponses = new ArrayList<>();
		Long sum = first + second;
		DataStructureResponse sumResponse = new DataStructureResponse();
		sumResponse.setSum(sum);
		response.setSuccess("successful");
		sumResponses.add(sumResponse);
		
		response.setResponses(sumResponses);
		return response;
	}

	@Override
	public AbstractResponse<DataStructureResponse> getleastCommonAnsistor(BinaryTree btree,int n1, int n2) {
		// TODO Auto-generated method stub
		AbstractResponse<DataStructureResponse> response = new AbstractResponse();
		List<DataStructureResponse> listResponses = new ArrayList<>();
		Node lca = findLCA(btree.getRoot(), n1,n2);
		btree.setRoot(lca);
		DataStructureResponse dsResponse = new DataStructureResponse();
		dsResponse.setBstree(btree);
		listResponses.add(dsResponse);
		response.setResponses(listResponses);
		return response;
	}
	
	public Node findLCA(Node node, int n1, int n2){
		
		if(node==null){
			return null;
		}
		
		if(node.getData() == n1 || node.getData() == n2){
			return node;
		}
		
		Node nodeLeftLCA = findLCA(node.getLeft(), n1, n2);
		Node nodeRightLCA = findLCA(node.getRight(), n1, n2);
		
		if(nodeLeftLCA!=null && nodeRightLCA!=null){
			return node;
		}
		
		return (nodeLeftLCA !=null) ? nodeLeftLCA:nodeRightLCA;
	}

}
