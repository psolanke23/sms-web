import { Component, OnDestroy } from '@angular/core';

@Component({
  selector: 'app-about-us',
  standalone: true,
  imports: [],
  templateUrl: './about-us.component.html',
  styleUrl: './about-us.component.scss'
})
export class AboutUsComponent implements OnDestroy {
  constructor() {
    console.log("about us component");
  }


  ngOnDestroy(): void {
    console.log("destroy about us component");
  }

}
