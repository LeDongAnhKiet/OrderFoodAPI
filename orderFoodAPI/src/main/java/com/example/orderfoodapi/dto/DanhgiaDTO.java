package com.example.orderfoodapi.dto;

public class DanhgiaDTO {
    private Integer id;
    private String noiDung;
    private Double giaTien;
    private Integer rate;
    private Integer idUser;
    private Integer idDonHang;
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

    public Double getGiaTien() {
        return this.giaTien;
    }

    public void setGiaTien(Double giaTien) {
        this.giaTien = giaTien;
    }

    public Integer getRate() {
        return this.rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Integer getIdUser() {
        return this.idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdDonHang() {
        return this.idDonHang;
    }

    public void setIdDonHang(Integer idDonHang) {
        this.idDonHang = idDonHang;
    }

    public Integer getIdNhaHangFood() {
        return this.idNhaHangFood;
    }

    public void setIdNhaHangFood(Integer idNhaHangFood) {
        this.idNhaHangFood = idNhaHangFood;
    }
}
