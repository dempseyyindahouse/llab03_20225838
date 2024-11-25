package store;

import java.util.ArrayList;
import java.util.Iterator;

import disc.DigitalVideoDisc;

public class Store {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<DigitalVideoDisc> itemsInStore;

    public Store() {
        itemsInStore = new ArrayList<>();
    }

    public void addDVD(DigitalVideoDisc disc) {
        if (itemsInStore.size() < MAX_NUMBERS_ORDERED) {
            itemsInStore.add(disc);
            System.out.println("Thêm thành công DVD vào giỏ hàng");
        } else {
            System.out.println("Giỏ hàng đã đầy");
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        Iterator<DigitalVideoDisc> iterator = itemsInStore.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            DigitalVideoDisc currentDisc = iterator.next();
            if (currentDisc.equals(disc)) {
                iterator.remove(); // Sử dụng iterator để xóa
                System.out.println("Đã xóa thành công DVD");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy DVD trong giỏ hàng");
        }
    }
}
