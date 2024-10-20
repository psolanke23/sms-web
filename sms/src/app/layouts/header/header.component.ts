import { AfterViewInit, Component } from '@angular/core';
import { RouterOutlet, RouterModule } from '@angular/router';
import { FooterComponent } from "../footer/footer.component";
import { CommonModule } from '@angular/common';
import * as AOS from "aos";

@Component({
  selector: 'app-header',
  standalone: true,
  imports: [RouterOutlet, RouterModule, FooterComponent, CommonModule],
  templateUrl: './header.component.html',
  styleUrl: './header.component.scss'
})
export class HeaderComponent implements AfterViewInit {
  ngAfterViewInit() {
    if (typeof document !== 'undefined') {
      AOS.init();
    }
  }

}
