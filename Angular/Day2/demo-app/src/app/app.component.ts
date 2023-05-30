import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'demo-app';

  //injects the router dependency
  constructor(private router:Router){}

  notBookClicked(){
    this.router.navigate(["notbook"])
  }
}
