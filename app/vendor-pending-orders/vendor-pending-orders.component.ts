import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Orders } from '../orders';
import { OrdersService } from '../orders.service';

@Component({
  selector: 'app-vendor-pending-orders',
  templateUrl: './vendor-pending-orders.component.html',
  styleUrls: ['./vendor-pending-orders.component.css']
})
export class VendorPendingOrdersComponent implements OnInit {

  vendorID : number;
  orders : Orders[];

ordId : number;
venId : number;
acceptOrReject(oid : number, vid : number) {
   this.ordId=oid
   this.venId=vid;
   alert(this.ordId);
   alert(this.venId);
   localStorage.setItem("ordId",this.ordId.toString());
   localStorage.setItem("vid",vid.toString());
   this._router.navigate(['../accept-or-reject'], {relativeTo: this._route});
}

  constructor(private _orderService:OrdersService,private _route : ActivatedRoute,private _router : Router) { 
    this.vendorID = parseInt(localStorage.getItem("vendId"));
    this._orderService.showVPOrders(this.vendorID).subscribe(
      {
        "next": rs => {this.orders = rs;}
      }
    );
    
  }

  ngOnInit(): void {
  }

}
