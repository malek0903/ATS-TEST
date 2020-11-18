import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Product } from '../entity/Product';
import { Review } from '../entity/Review';
import { ProductService } from '../service/product.service';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit {


  id: number;
  product: Product;
  review : any[]
  constructor(private route: ActivatedRoute,private router: Router,
    private productService: ProductService) { }

  ngOnInit(): void {
    this.product = new Product();
    this.id = this.route.snapshot.params['id'];
    console.log(this.id)
    this.productService.getProductById(this.id)
    .subscribe(data => {
      console.log(data)
      this.product = data;
      console.log(this.product)
    }, error => console.log(error));
  }

  liste(){
    this.router.navigate(['/products']);
  }



}
