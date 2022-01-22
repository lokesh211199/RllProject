import { Component, OnInit } from '@angular/core';
import { Orders } from '../orders';
import { OrdersService } from '../orders.service';

@Component({
  selector: 'app-vendor-pending-orders',
  templateUrl: './vendor-pending-orders.component.html',
  styleUrls: ['./vendor-pending-orders.component.css']
})
export class VendorPendingOrdersComponent implements OnInit {

  vendorId : number;
  orders : Orders [];
  constructor(private _ordersService : OrdersService) { 
    this.vendorId = parseInt(localStorage.getItem("vendId"));
    this._ordersService.showVOrders(this.vendorId).subscribe(x => {
      this.orders=x;
    })
//    this.orders = this._ordersService.showCOrders(this.customerid);
  }

  ngOnInit(): void {
  }

}
