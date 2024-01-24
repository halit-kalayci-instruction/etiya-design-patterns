package org.example.behavioral.template.templates;

public class DigitalProductOrder extends OrderProcessTemplate{
    @Override
    protected void requestFeedback() {

    }

    @Override
    protected void saveOrderData() {
        System.out.println("Dijital Ürün: Veritabanı kaydı yapıldı.");
    }

    @Override
    protected boolean makePayment() {
        System.out.println("Dijital Ürün: Ödeme başarısız.");
        return false;
    }

    @Override
    protected void shippingProcess() {
        System.out.println("Dijital Ürün: E-postaya gönderildi.");
    }
}
