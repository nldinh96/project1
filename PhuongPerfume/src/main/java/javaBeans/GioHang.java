package javaBeans;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import businessLogics.SanPhamBL;

public class GioHang {
	private Hashtable< Integer, Integer> dsh;
	public GioHang() {
		dsh = new Hashtable<Integer, Integer>();
	}
	public void them(int idsp, int slm) {
		if(dsh.containsKey(idsp))
			dsh.replace(idsp, dsh.get(idsp) + slm);
		else
			dsh.put(idsp, slm);
	}
	public int soMatHang() {
		return dsh.size();
	}
	public double tongTien() {
		double tt = 0;
		for(int idsp : dsh.keySet()) {
			SanPham sp = SanPhamBL.docTheoID(idsp);
			tt = tt + sp.getDonGiaKM() *  dsh.get(idsp);
		}
		return tt;
	}
	public List<SanPhamMua> dsSPMua(){
		List<SanPhamMua> ds = new ArrayList<SanPhamMua>();
		for(int idsp : dsh.keySet()) {
			SanPham sp = SanPhamBL.docTheoID(idsp);
			SanPhamMua spm = new SanPhamMua();
			
			spm.setId(sp.getId());
			spm.setTenSanPham(sp.getTenSanPham());
			spm.setMoTa(sp.getMoTa());
			spm.setDonGia(sp.getDonGia());
			spm.setDonGiaKM(sp.getDonGiaKM());
			spm.setSoLuong(sp.getSoLuong());
			spm.setId_loai(sp.getId_loai());
			spm.setHinhAnh(sp.getHinhAnh());
			spm.setHienThi(sp.getHienThi());
			spm.setNgayTao(sp.getNgayTao());
			
			spm.setSoLuongMua(dsh.get(idsp));
			
			ds.add(spm);
		}
		return ds;
	}
	
}
