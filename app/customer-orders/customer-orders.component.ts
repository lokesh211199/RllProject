import { Component, OnInit } from '@angular/core';
import { Orders } from '../orders';
import { OrdersService } from '../orders.service';

@Component({
  selector: 'app-customer-orders',
  templateUrl: './customer-orders.component.html',
  styleUrls: ['./customer-orders.component.css']
})
export class CustomerOrdersComponent implements OnInit {

  customerId : number;
  orders : Orders [];
  
  constructor(private _ordersService : OrdersService) { 
    this.customerId = parseInt(localStorage.getItem("customerId"));
    this._ordersService.showCOrders(this.customerId).subscribe(x => {
      this.orders=x;
    })
//    this.orders = this._ordersService.showCOrders(this.customerid);
  }

  ngOnInit(): void {
  }

}