package NguyenHuuDuc_23699411;

public class HinhVuong extends HinhHoc {
	private double canh;

	public double getCanh() {
		return canh;
	}

	public void setCanh(double canh) {
		if(this.canh > 0) {
			this.canh = canh;
		}else {
			System.out.println("Loi");
		}
	}
	
	
	public HinhVuong(String tenHinh, double canh) {
		super(tenHinh);
		if(tenHinh != " ") {
			this.tenHinh = tenHinh;
		}else {
			System.out.println("Loi");
		}
		
		if(canh > 0) {
			this.canh = canh;
		}else {
			System.out.println("Loi");
		}
		
	}

	@Override
	public double getDienTich() {
		// TODO Auto-generated method stub
		return getCanh() * getCanh();
	}	
	
	

}
