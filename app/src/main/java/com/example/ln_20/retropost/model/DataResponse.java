package com.example.ln_20.retropost.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import okhttp3.MediaType;

/**
 * Created by ln-20 on 7/2/17.
 */

public class DataResponse {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("data")
    @Expose
    private Data data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }


    public class Data {

        @SerializedName("checkIn")
        @Expose
        private String checkIn;
        @SerializedName("checkOut")
        @Expose
        private String checkOut;
        @SerializedName("smart_lot")
        @Expose
        private String smartLot;
        @SerializedName("smart_valid")
        @Expose
        private Integer smartValid;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("is_postpaid")
        @Expose
        private String isPostpaid;
        @SerializedName("confirmation_id")
        @Expose
        private String confirmationId;
        @SerializedName("place_by")
        @Expose
        private String placeBy;
        @SerializedName("Park_Name")
        @Expose
        private String parkName;
        @SerializedName("Park_Phone")
        @Expose
        private String parkPhone;
        @SerializedName("Park_Address")
        @Expose
        private String parkAddress;
        @SerializedName("PlacedOn")
        @Expose
        private String placedOn;
        @SerializedName("order_type")
        @Expose
        private String orderType;
        @SerializedName("logo")
        @Expose
        private String logo;
        @SerializedName("Amount")
        @Expose
        private String amount;
        @SerializedName("charges")
        @Expose
        private String charges;
        @SerializedName("Discount")
        @Expose
        private String discount;
        @SerializedName("TotalAmount")
        @Expose
        private String totalAmount;
        @SerializedName("PaymentSource")
        @Expose
        private String paymentSource;
        @SerializedName("orderStatus")
        @Expose
        private String orderStatus;
        @SerializedName("code")
        @Expose
        private String code;
        @SerializedName("Card_Address")
        @Expose
        private String cardAddress;
        @SerializedName("Card_State")
        @Expose
        private String cardState;
        @SerializedName("Card_City")
        @Expose
        private String cardCity;
        @SerializedName("Card_Type")
        @Expose
        private String cardType;
        @SerializedName("Card_Name")
        @Expose
        private String cardName;
        @SerializedName("Card_Number")
        @Expose
        private String cardNumber;
        @SerializedName("beacons")
        @Expose
        private List<Object> beacons = null;

        public String getCheckIn() {
            return checkIn;
        }

        public void setCheckIn(String checkIn) {
            this.checkIn = checkIn;
        }

        public String getCheckOut() {
            return checkOut;
        }

        public void setCheckOut(String checkOut) {
            this.checkOut = checkOut;
        }

        public String getSmartLot() {
            return smartLot;
        }

        public void setSmartLot(String smartLot) {
            this.smartLot = smartLot;
        }

        public Integer getSmartValid() {
            return smartValid;
        }

        public void setSmartValid(Integer smartValid) {
            this.smartValid = smartValid;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIsPostpaid() {
            return isPostpaid;
        }

        public void setIsPostpaid(String isPostpaid) {
            this.isPostpaid = isPostpaid;
        }

        public String getConfirmationId() {
            return confirmationId;
        }

        public void setConfirmationId(String confirmationId) {
            this.confirmationId = confirmationId;
        }

        public String getPlaceBy() {
            return placeBy;
        }

        public void setPlaceBy(String placeBy) {
            this.placeBy = placeBy;
        }

        public String getParkName() {
            return parkName;
        }

        public void setParkName(String parkName) {
            this.parkName = parkName;
        }

        public String getParkPhone() {
            return parkPhone;
        }

        public void setParkPhone(String parkPhone) {
            this.parkPhone = parkPhone;
        }

        public String getParkAddress() {
            return parkAddress;
        }

        public void setParkAddress(String parkAddress) {
            this.parkAddress = parkAddress;
        }

        public String getPlacedOn() {
            return placedOn;
        }

        public void setPlacedOn(String placedOn) {
            this.placedOn = placedOn;
        }

        public String getOrderType() {
            return orderType;
        }

        public void setOrderType(String orderType) {
            this.orderType = orderType;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getCharges() {
            return charges;
        }

        public void setCharges(String charges) {
            this.charges = charges;
        }

        public String getDiscount() {
            return discount;
        }

        public void setDiscount(String discount) {
            this.discount = discount;
        }

        public String getTotalAmount() {
            return totalAmount;
        }

        public void setTotalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
        }

        public String getPaymentSource() {
            return paymentSource;
        }

        public void setPaymentSource(String paymentSource) {
            this.paymentSource = paymentSource;
        }

        public String getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getCardAddress() {
            return cardAddress;
        }

        public void setCardAddress(String cardAddress) {
            this.cardAddress = cardAddress;
        }

        public String getCardState() {
            return cardState;
        }

        public void setCardState(String cardState) {
            this.cardState = cardState;
        }

        public String getCardCity() {
            return cardCity;
        }

        public void setCardCity(String cardCity) {
            this.cardCity = cardCity;
        }

        public String getCardType() {
            return cardType;
        }

        public void setCardType(String cardType) {
            this.cardType = cardType;
        }

        public String getCardName() {
            return cardName;
        }

        public void setCardName(String cardName) {
            this.cardName = cardName;
        }

        public String getCardNumber() {
            return cardNumber;
        }

        public void setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
        }

        public List<Object> getBeacons() {
            return beacons;
        }

        public void setBeacons(List<Object> beacons) {
            this.beacons = beacons;
        }

    }
}
