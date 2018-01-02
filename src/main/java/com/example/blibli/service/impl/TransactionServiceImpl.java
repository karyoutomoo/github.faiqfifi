package com.example.blibli.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.blibli.model.entity.Transaction;
import com.example.blibli.model.request.TransactionRequest;
import com.example.blibli.model.response.TransactionResponse;
import com.example.blibli.model.response.base.PageMetaData;
import com.example.blibli.model.response.base.RestListResponse;
import com.example.blibli.repository.TransactionRepository;
import com.example.blibli.service.api.ModelConverterService;
import com.example.blibli.service.api.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService{

	@Autowired private TransactionRepository transactionRepository;
	@Autowired private ModelConverterService modelConverterService;
	
	@Override
	public List<TransactionResponse> findAll() {
		List<Transaction> transactions = this.transactionRepository.findAll();
		return this.modelConverterService.convertToTransactionListResponse(transactions);
	}

	@Override
	public RestListResponse<TransactionResponse> findPageable(TransactionRequest request) {
		
		BigDecimal totalRecords = BigDecimal.valueOf(this.transactionRepository.countTotalRecords());
        int size = request.getPageMetaData().getSize();
        int page = request.getPageMetaData().getPage();
        int offset = page * size;
        List<Transaction> transactions = this.transactionRepository.findPageable(size, offset);
        List<TransactionResponse> transactionResponses =
            this.modelConverterService.convertToTransactionListResponse(transactions);
        return new RestListResponse<>(null, null, true, transactionResponses,
            new PageMetaData(page, size, totalRecords));
	}

	@Override
	public TransactionResponse findbyId(String id) {
		Transaction transaction = this.transactionRepository.findById(id);
		return this.modelConverterService.convertToTransactionResponse(transaction);
	}
}
