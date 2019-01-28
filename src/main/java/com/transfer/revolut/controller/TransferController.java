package com.transfer.revolut.controller;

import com.transfer.revolut.dto.AccountDTO;
import com.transfer.revolut.service.TransferService;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/transfer")
public class TransferController {

	@Inject
	private TransferService transferService;

	@GET
	public String getHello() {
		return transferService.hello();
	}

	 @POST
	 @Produces(MediaType.APPLICATION_JSON)
	 public AccountDTO transfer(@Valid AccountDTO accountDTO) {

		 TransferService transferService = new TransferService();
	 	 transferService.hello();

	 	 AccountDTO accountDTOResponse = new AccountDTO();
		 accountDTOResponse .setBankName("teste");
		 accountDTOResponse .setBeneficiary("teste");
		 accountDTOResponse .setBic("teste");
		 accountDTOResponse .setIban("teste");
		 accountDTOResponse .setBeneficiary("teste");
		 accountDTOResponse .setCurrency(accountDTO.getCurrency());

	 	 return accountDTO;
	 }
}
 