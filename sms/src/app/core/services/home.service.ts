import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HomeService {

  private api: string = "http://localhost:8080";

  constructor(private http: HttpClient) { }

  getHello(): Observable<any> {
    return this.http.get<any>(`${this.api}/home/hello`);
  }

}
