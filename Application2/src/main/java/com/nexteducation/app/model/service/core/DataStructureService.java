package com.nexteducation.app.model.service.core;

import com.nexteducation.app.model.request.BinaryTree;
import com.nexteducation.app.model.response.AbstractResponse;
import com.nexteducation.app.model.response.DataStructureResponse;

public interface DataStructureService {
	
	AbstractResponse<DataStructureResponse> addTwoNumbers(Long first, Long second);
	
	AbstractResponse<DataStructureResponse> getleastCommonAnsistor(BinaryTree btree,int n1, int n2);
}
