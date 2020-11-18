import { Injectable } from '@angular/core';

import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class ProductService {

  
  constructor(private http : HttpClient) { }


  
  getAllProducts(){
    return this.http.get("http://localhost:8080/SpringMVC/api/products");
  }

  getProductById (id: number ): Observable<any> {
    return this.http.get("http://localhost:8080/SpringMVC/api/products/"+id);
  }

  getProductByCateg (id: string ): Observable<any> {
    return this.http.get("http://localhost:8080/SpringMVC/api/products/categ"+id);
  }
}
