package org.example.behavioral.template.templates;

public abstract class OrderProcessTemplate
{
    public final void process() {
        saveOrderData();

        if(makePayment()) {
            shippingProcess();
            requestFeedback();
        }
    }
    protected abstract void requestFeedback();
    protected abstract void saveOrderData();
    protected abstract boolean makePayment();
    protected abstract void shippingProcess();
}
