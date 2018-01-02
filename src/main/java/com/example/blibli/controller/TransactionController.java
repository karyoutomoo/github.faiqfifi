package com.example.blibli.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.blibli.model.request.TransactionRequest;
import com.example.blibli.model.response.TransactionResponse;
import com.example.blibli.model.response.base.RestListResponse;
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
}
