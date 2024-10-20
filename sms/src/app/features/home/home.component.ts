import { Component, OnDestroy, OnInit } from '@angular/core';
import { HomeService } from '../../core/services/home.service';
import { HttpClient } from '@angular/common/http';
import { error } from 'console';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [],
  providers: [HomeService],
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent implements OnInit, OnDestroy {
  public msg: string = "";

  constructor(private homeService: HomeService) {
    console.log("home component");
  }

  ngOnInit(): void {
    // this.fetchHello();
  }

  fetchHello() {
    this.homeService.getHello().subscribe({
      next: (data: { message: string }) => {
        this.msg = data.message;
      },
      error: (err) => {
        console.log("error found : ", err);
      }
    })
  }


  ngOnDestroy(): void {
    console.log("destroy home component");
  }
}
