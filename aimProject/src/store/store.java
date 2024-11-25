package store;

import java.util.ArrayList;
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
        int index = itemsInStore.indexOf(disc); // Tìm vị trí của DVD trong danh sách

        if (index != -1) { // Nếu DVD được tìm thấy
            itemsInStore.remove(index); // Xóa DVD theo chỉ số
            System.out.println("Đã xóa thành công DVD");
        } else {
            System.out.println("Không tìm thấy DVD trong giỏ hàng");
        }
    }
}
