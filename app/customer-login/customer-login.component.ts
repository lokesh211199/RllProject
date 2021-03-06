import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-customer-login',
  templateUrl: './customer-login.component.html',
  styleUrls: ['./customer-login.component.css']
})
export class CustomerLoginComponent implements OnInit {

  customerId : number;
  passCode : string;
  customers : Customer[];
  logMe() {
  alert(this.customerId)
    localStorage.setItem('customerId',this.customerId.toString());
    if (this.passCode=="Mphasis") {
      this._router.navigate(['/customerDashBoard']);

    }
  }
  constructor(private _router : Router, private _customerService :CustomerService) {
    this._customerService.showCustomer().subscribe({
      next: rs =>{
        this.customers = rs;
      }
    })
   }
  ngOnInit(): void {
  }

}
