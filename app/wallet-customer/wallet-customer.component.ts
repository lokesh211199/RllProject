import { Component, OnInit } from '@angular/core';
import { Wallet } from '../wallet';
import { WalletService } from '../wallet.service';

@Component({
  selector: 'app-wallet-customer',
  templateUrl: './wallet-customer.component.html',
  styleUrls: ['./wallet-customer.component.css']
})
export class WalletCustomerComponent implements OnInit {

  customerid : number;
  wallet: Wallet[];
  constructor(private _walletService : WalletService) { 
    this.customerid = parseInt(localStorage.getItem("customerId"));
    this._walletService.showCustomerWallet(this.customerid).subscribe(x => {
      this.wallet = x;
    });
  }
  ngOnInit(): void {
  }

}
