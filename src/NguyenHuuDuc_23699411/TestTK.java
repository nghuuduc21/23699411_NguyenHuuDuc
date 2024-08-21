package NguyenHuuDuc_23699411;

public class TestTK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhHoc h1 = new HinhVuong("Hinh Vuong", 20.5);
		System.out.println("Dien tich Hinh vuong: " + h1.getDienTich());
		
		HinhHoc h2 = new HinhChuNhat("Hinh Chu Nhat", 30.5, 20.5);
		System.out.println("Dien tich Hinh Chu Nhat: " + h2.getDienTich());
	}

}
