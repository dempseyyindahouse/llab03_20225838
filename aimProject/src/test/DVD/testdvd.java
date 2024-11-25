package test.store;

import store.Store;
import cart.Cart;
import disc.DigitalVideoDisc;

public class StoreTest {
	public static void main(String[] args) {
	    Store store = new Store();

      DigitalVideoDisc dvd1 = new DigitalVideoDisc("Sasuke", "Anime", "Kishimoto", 20, 8.5f);
      DigitalVideoDisc dvd2 = new DigitalVideoDisc("Vegeta", "Action", "Toriyama", 22, 9.0f);
      DigitalVideoDisc dvd3 = new DigitalVideoDisc("One Piece", "Anime", "Oda", 20, 8.0f);
    
        store.addDVD(dvd1);
	    store.addDVD(dvd2);
	    store.addDVD(dvd3);
		store.removeDVD(dvd3);

		
	}
}
