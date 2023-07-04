package com.example.orderfoodapi.dto;

import java.time.LocalDate;

public class UudaiDTO {
    private Integer id;
    private String noiDung;
    private Integer giaTri;
    private LocalDate ngayBatdau;
    private LocalDate ngayKetThuc;
    private String hinhAnh;
    private String loai;
    private Integer idNhaHangFood;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNoiDung() {
        return this.noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public Integer getGiaTri() {
        return this.giaTri;
    }

    public void setGiaTri(Integer giaTri) {
        this.giaTri = giaTri;
    }

    public LocalDate getNgayBatdau() {
        return this.ngayBatdau;
    }

    public void setNgayBatdau(LocalDate ngayBatdau) {
        this.ngayBatdau = ngayBatdau;
    }

    public LocalDate getNgayKetThuc() {
        return this.ngayKetThuc;
    }

    public void setNgayKetThuc(LocalDate ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getHinhAnh() {
        return this.hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getLoai() {
        return this.loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public Integer getIdNhaHangFood() {
        return this.idNhaHangFood;
    }

    public void setIdNhaHangFood(Integer idNhaHangFood) {
        this.idNhaHangFood = idNhaHangFood;
    }
}
