package aims;

import cart.Cart;
import disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {

        Cart myCart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Avatar", "Science Fiction", "James Cameron", 162, 1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Godfather", "Crime", "Francis Ford Coppola", 175, 2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 3);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Toy Story");
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Finding Nemo", "Animation", "Andrew Stanton", 100, 5);
	    
        myCart.addDVD(dvd1);
        myCart.addDVD(dvd2);
        myCart.addDVD(dvd3);
        myCart.removeDVD(dvd3);
        myCart.print();
        myCart.searchById(2);
        myCart.searchByTitle("Finding Nemo");
    }
}
