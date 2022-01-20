import { Component, OnInit } from '@angular/core';
import { Vendor } from '../vendor';
import { VendorService } from '../vendor.service';

@Component({
  selector: 'app-vendor-dash-board',
  templateUrl: './vendor-dash-board.component.html',
  styleUrls: ['./vendor-dash-board.component.css']
})
export class VendorDashBoardComponent implements OnInit {

  vendorId : number;
  vendor : Vendor;

  constructor(private _vendorSerivice : VendorService) { 

    this.vendorId = parseInt(localStorage.getItem("vendId"));
    this._vendorSerivice.searchVendor(this.vendorId).subscribe(x => {
      this.vendor=x;
    })
  }

  ngOnInit(): void {
  }

}
