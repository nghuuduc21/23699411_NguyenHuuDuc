package NguyenHuuDuc_23699411;

// xây dựng class mang tính trừu tượng abstract
public abstract class  HinhHoc {
	
	// cho phép lớp con truy cập trực tiếp
	protected String tenHinh;

	// phương thức đóng gói getter
	public String getTenHinh() {
		return tenHinh;
	}

	// phương thức đóng gói setter
	public void setTenHinh(String tenHinh) {
		this.tenHinh = tenHinh;
	}

	
	public HinhHoc(String tenHinh) {
		this.tenHinh = tenHinh;
	}

	public HinhHoc() {}
	
	// phương thức trừu tượng abstract ko có thân => các lớp con có thể ghi đè lên cung cấp thân cho nó
	// phương thức này sẽ trả về diện tích
	public abstract double getDienTich();
	
	@Override
	public String toString() {
		// trả về giá trị từ lớp cha
		// nó cũng phải tùy chỉnh và trả về giá trị cụ thể về đối tượng
		return super.toString();
	}
	
	
	
}
