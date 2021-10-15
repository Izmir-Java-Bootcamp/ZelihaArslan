package com.kodluyoruz;

/**
 * Subclass representing a product to be purchased
 * (using the formula "buy 2 take 3")
 * It extends the Product class with one instance variable
 */

public class Buy2Take3Product extends Product {
    //original product
    private final Product original;

    /**
     * Construct a Buy2Take3 product
     * If the price of this product can not be reduced
     * you should print a message to the user and terminate the
     * program
     * @param original
     */
    public Buy2Take3Product(Product original) {
        super(original);
        // if the price can not be reduced you should print a message and
        // terminate the program. Use IllegalArgumentException to terminate.
        // code here
        if(!original.canBeReduced()){
            throw new IllegalArgumentException("No Discount");
        }
        else{
            this.original = original;
        }
    }

    /**
     * Return false if the product price can not be
     * reduced
     * @return
     */
    public boolean canBeReduced() {
        // You can not discount the price of Buy2Take3 product
        // code here
        if(original instanceof DiscountedProduct)
            return false;
      return true;
    }

    /**
     * Return the unit price of a product using the
     * formula "Buy2Take3"
     * @param cart shopping cart
     * @return unit price
     */
    public double getPrice(Cart cart) {
        // calculate unit price of this product purchased
        // as Buy2Take3
        // code here
       int count=0;
       double price=0; 
       for(Product item: cart.getProducts()){
           if(item instanceof Buy2Take3Product){
               count++;
               price+= item.getPrice();
           }
       }
       if(count>=3){
           double a=count/3;
           price-=a*30;
           price=price/count;
       }
       return price;

    }
}