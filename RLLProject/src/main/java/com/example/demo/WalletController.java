package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletController {
	@Autowired
	private WalletService walletService;
	
	@RequestMapping("/wallet")
	public Wallet[] show() {
		return walletService.showWallet();
		
	}
	@RequestMapping("/searchWallet/{walletid}")
	public Wallet searchWallet(@PathVariable int walletid) {
		return walletService.searchWallet(walletid);
	}
}
