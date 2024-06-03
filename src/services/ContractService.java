package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePayment;

	public ContractService(OnlinePaymentService onlinePayment) {
		this.onlinePayment = onlinePayment;
	}
	
	public void processContract(Contract contract, int months) {
		
		contract.getInstallments().add(new Installment(LocalDate.of(2018, 7, 25), 206.04));
		contract.getInstallments().add(new Installment(LocalDate.of(2018, 8, 25), 208.08));
	}
}
