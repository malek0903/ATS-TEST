import { Review } from './Review'

export class Product{

    id :number
    color :string
    category :string
    productName:string
    price:string
    description:string
    tag:string
    productMaterial:string
    imageUrl:string
    createdAt:string
    reviews : Review[]

     
}