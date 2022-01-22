import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Wallet } from './wallet';
import { catchError, tap, map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class WalletService {

  constructor(private _http: HttpClient) { }

  showCustomerWallet(customerid : number): Observable<Wallet []> {
    return this._http.get<Wallet[]>("http://localhost:8282/showAllWallets/"+customerid)
      .pipe(
        tap(data =>
        console.log('All: ' + JSON.stringify(data)))
      );
  }
  searchByWalletId(walletid : number): Observable<Wallet> {
    return this._http.get<Wallet>("http://localhost:8282/searchByWalletId/"+walletid)
      .pipe(
        tap(data =>
        console.log('All: ' + JSON.stringify(data)))
      );
  }
}
