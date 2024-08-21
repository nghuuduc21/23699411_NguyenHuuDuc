package NguyenHuuDuc_23699411;

public class HinhChuNhat extends HinhHoc {
	private double chieuDai;
	private double chieuRong;
	public double getChieuDai() {
		return chieuDai;
	}
	
	public void setChieuDai(double d) {
		this.chieuDai = d;
	}
	
	public double getChieuRong() {
		return chieuRong;
	}
	
	public void setChieuRong(double r) {
		this.chieuRong = r;
	}

	public HinhChuNhat(String tenHinh, double d, double r) {
		super(tenHinh);
		if(tenHinh != " ") {
			this.tenHinh = tenHinh;
		}else {
			System.out.println("Loi");
		}
			
		if(d > 0) {
			this.chieuDai = d;
		}else {
			System.out.println("loi");
		}
		
		if(r > 0) {
			this.chieuRong = r;
		}else {
			System.out.println("loi");
		}
		
	}

	@Override
	public double getDienTich() {
		// TODO Auto-generated method stub
		return getChieuDai() * getChieuRong();
	}

	

	
}
