package com.example.blibli.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.blibli.model.request.TransactionRequest;
import com.example.blibli.model.response.TransactionResponse;
import com.example.blibli.model.response.base.RestListResponse;
import com.example.blibli.model.response.base.RestSingleResponse;
import com.example.blibli.service.api.TransactionService;

@RestController public class TransactionController {
	@Autowired private TransactionService transactionService;
	
	@PostMapping(path = "/api/transactions", produces = MediaType.APPLICATION_JSON_VALUE) @ResponseBody
    public RestListResponse<TransactionResponse> getTransactions(@RequestBody TransactionRequest request) {
        RestListResponse<TransactionResponse> response;
        try {
            response = this.transactionService.findPageable(request);
        } catch (Exception e) {
            response = new RestListResponse<>(null, e.getMessage(), false);
        }
        return response;
    }
	@PostMapping(path = "/api/transaction", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public RestSingleResponse<TransactionResponse> saveTransaction(@RequestBody TransactionRequest request) {
        RestSingleResponse<TransactionResponse> response;
        try {
            response = new RestSingleResponse<>(null, null, true,
                this.transactionService.saveTransaction(request));
        } catch (Exception e) {
            response = new RestSingleResponse<>(null, e.getMessage(), false);
        }
        return response;//clear
    }
	@PutMapping(path = "/api/transaction", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public RestSingleResponse<TransactionResponse> updateTransaction(@RequestBody TransactionRequest request) {
        RestSingleResponse<TransactionResponse> response;
        try {
            response = new RestSingleResponse<>(null, null, true,
                this.transactionService.updateTransaction(request));
        } catch (Exception e) {
            response = new RestSingleResponse<>(null, e.getMessage(), false);
        }
        return response;
	}
	
}
