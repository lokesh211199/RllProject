import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RestaurantShowComponent } from './restaurant-show/restaurant-show.component';
import { CustomerShowComponent } from './customer-show/customer-show.component';
import { VendorShowComponent } from './vendor-show/vendor-show.component';
import { CustomerDashBoardComponent } from './customer-dash-board/customer-dash-board.component';
import { VendorDashBoardComponent } from './vendor-dash-board/vendor-dash-board.component';
import { VendorLoginComponent } from './vendor-login/vendor-login.component';
import { CustomerLoginComponent } from './customer-login/customer-login.component';
import { RouterModule, Routes } from '@angular/router';
import { HomePageComponent } from './home-page/home-page.component';
import { FormsModule } from '@angular/forms';
import { CustomerOrdersComponent } from './customer-orders/customer-orders.component';
import { CustomerPendingOrdersComponent } from './customer-pending-orders/customer-pending-orders.component';
import { VendorOrdersComponent } from './vendor-orders/vendor-orders.component';
import { VendorPendingOrdersComponent } from './vendor-pending-orders/vendor-pending-orders.component';

const appRoutes : Routes = [
  {path:'',component:HomePageComponent},
 {path:'customerLogin',component:CustomerLoginComponent},
 {path:'vendorLogin',component:VendorLoginComponent},
 {path:'customerDashBoard',component:CustomerDashBoardComponent},
 {path:'vendorDashBoard',component:VendorDashBoardComponent},
 {path:'custDashBoard',component:CustomerDashBoardComponent, 
   children : [
     {path:'showRestaurant',component:RestaurantShowComponent,outlet:'mphasis'},
     {path:'showCOrders',component:CustomerOrdersComponent,outlet:'mphasis'},
     {path:'showCPOrders',component:CustomerPendingOrdersComponent,outlet:'mphasis'},
     {path:'showCustomer',component:CustomerShowComponent,outlet:'mphasis'}
   ]
 },
 {path:'vendDashBoard',component:VendorDashBoardComponent,
    children : [
      {path:'showRestaurant',component:RestaurantShowComponent,outlet:'mphasis'},
      {path:'showVOrders',component:VendorOrdersComponent,outlet:'mphasis'},
      {path:'showVPOrders',component:VendorPendingOrdersComponent,outlet:'mphasis'},
      {path:'showVendor',component:VendorShowComponent,outlet:'mphasis'}
    ]

 }
]

@NgModule({
  declarations: [
    AppComponent,
    RestaurantShowComponent,
    CustomerShowComponent,
    VendorShowComponent,
    CustomerDashBoardComponent,
    VendorDashBoardComponent,
    VendorLoginComponent,
    CustomerLoginComponent,
    HomePageComponent,
    CustomerOrdersComponent,
    CustomerPendingOrdersComponent,
    VendorOrdersComponent,
    VendorPendingOrdersComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes),
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }