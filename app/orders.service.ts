import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError, tap, map } from 'rxjs/operators';
import { Orders } from './orders';

@Injectable({
  providedIn: 'root'
})
export class OrdersService {

   constructor(private _http: HttpClient){ }
   showCOrders(customerid : number): Observable<Orders []> {
    return this._http.get<Orders []>("http://localhost:8282/co/"+customerid)
      .pipe(
        tap(data =>
        console.log('All: ' + JSON.stringify(data)))
      );
  }
   showCPOrders(customerid : number): Observable<Orders []> {
    return this._http.get<Orders []>("http://localhost:8282/showCPOrders/"+customerid)
      .pipe(
        tap(data =>
        console.log('All: ' + JSON.stringify(data)))
      );
  }
  showVOrders(vendorid : number): Observable<Orders []> {
    return this._http.get<Orders []>("http://localhost:8282/showVOrders/"+vendorid)
      .pipe(
        tap(data =>
        console.log('All: ' + JSON.stringify(data)))
      );
  }
  showVPOrders(vendorid : number): Observable<Orders []> {
    return this._http.get<Orders []>("http://localhost:8282/showVPOrders/"+vendorid)
      .pipe(
        tap(data =>
        console.log('All: ' + JSON.stringify(data)))
      );
  }
}