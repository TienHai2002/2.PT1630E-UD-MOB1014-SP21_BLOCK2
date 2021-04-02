/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI5_OOP_LapTrinhHuongDoiTuong;

/**
 *
 * @author Dungna29
 */
public class SinhVien {//Tạo ra 1 Class đối tượng là SinhVien bắt buộc viết hoa chữ cái đầu tiên của từ
    //Phần 1: Khai báo tất cả các thuộc tính mà đối được tượng phải có
  private String name; 
  private String msv; 
  private int tuoi; 
  private String nganhHoc;
  private String truong = "FPOLY";
   
   
    /*
    Phần 2: Hàm tạo || Contructor
    + Contructor giống với tên class 
    + Để tạo sử dụng phím ALT + INSERT chọn CONTRUCTOR
    + Chuột phải vào file chọn Insert Code
    */
  
    //Tạo Contructor không tham số
    public SinhVien() {//Contructor không tham số
        System.out.println("Đây là text in ra từ COntructor");
    }
    
    //Contructor có tham số
    public SinhVien(String namE, String msv, int tuoi, String nganhHoc) {
        name = namE;
        this.msv = msv;
        this.tuoi = tuoi;
        this.nganhHoc = nganhHoc;      
        //this dùng để tham chiếu đến thuộc tính hoặc phương thức của lớp hiện tại
    }
  
    
    //Phần 3: Vì các thuộc tính bị Private nên sẽ phải sử dụng Getter và Setter
    //Khi private các thuộc tính nhằm che dấu (Encapsulation) trong hướng đối tượng là 1 trong 4 tính chất của OOP
    //Alt + Insert hoặc chuột phải chọn Insert Code chọn Getter và Setter ->Select All

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public String getTruong() {
        return truong;
    }

//    public void setTruong(String truong) {
//        this.truong = truong;
//    }
  
    
   
   //Phần 4: Các phương thức của đối tượng
   void inThongTinSV(){
       System.out.printf("Tên: %s Mã: %s Tuổi: %d Ngành Học: %s Trường: %s\n",name,msv,tuoi,nganhHoc,truong);
   }
}
