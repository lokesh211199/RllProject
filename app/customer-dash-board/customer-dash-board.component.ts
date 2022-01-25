import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-customer-dash-board',
  templateUrl: './customer-dash-board.component.html',
  styleUrls: ['./customer-dash-board.component.css']
})
export class CustomerDashBoardComponent implements OnInit {

  customerid : number;
  customer : Customer;
  constructor(private _customerService : CustomerService) { 
    this.customerid = parseInt(localStorage.getItem("customerId"));
    this._customerService.searchCustomer(this.customerid).subscribe(x => {
      this.customer=x;
    })
//    this.customer = this._customerService.searchCustomer(this.cid);
  }

  ngOnInit(): void {
  }

}
