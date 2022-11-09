package designerPatterns.structural.facade;

public interface DeliveryService {
    void deliveryProduct(Long productId, int amount, String customer);

}
