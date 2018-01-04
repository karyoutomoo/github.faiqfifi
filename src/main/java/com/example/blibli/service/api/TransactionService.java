package com.example.blibli.service.api;

import java.util.List;

import com.example.blibli.model.request.TransactionRequest;
import com.example.blibli.model.response.TransactionResponse;
import com.example.blibli.model.response.base.RestListResponse;

public interface TransactionService {
	List<TransactionResponse> findAll();
	RestListResponse<TransactionResponse> findPageable(TransactionRequest request);
	TransactionResponse findbyId(String id);
	
	TransactionResponse saveTransaction(TransactionRequest request) throws Exception;
	
	TransactionResponse updateTransaction(TransactionRequest request) throws Exception;
	
	void deleteTransaction(String id) throws Exception;
}
