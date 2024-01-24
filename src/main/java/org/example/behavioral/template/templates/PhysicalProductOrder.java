package org.example.behavioral.template.templates;

public class PhysicalProductOrder extends OrderProcessTemplate{
    @Override
    protected void requestFeedback() {

    }

    @Override
    protected void saveOrderData() {
        // productRepository.save();
        System.out.println("Fiziksel Ürün: Veritabanı kaydı yapıldı.");
    }

    @Override
    protected boolean makePayment() {
        // ..
        System.out.println("Fiziksel Ürün:  Ödeme alındı.");
        return true;
    }

    @Override
    protected void shippingProcess() {
        System.out.println("Fiziksel Ürün: kargoya verildi.");
    }
}
