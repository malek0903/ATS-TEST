import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from '../entity/Product';
import { ProductService } from '../service/product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  listProduct: Product[];
  catego : string ;
  constructor(private productService: ProductService,private router: Router ) { }


  ngOnInit(): void {
    this.catego = ""
    this.productService.getAllProducts().subscribe(
      (data: Product[]) => { this.listProduct = data; });

      console.log(this.listProduct)
  }

 

  productDetails(id: number){
      console.log("sqkhdhkbqs"+id)
      this.router.navigate(['details', id]);
  }

  getAvg(product : Product){
    let nb = product.reviews.length;
    let rating = 0;
     product.reviews.forEach(element=>{
      rating += element.rating;
    });
    return rating/(nb *5);
  }

 
}
