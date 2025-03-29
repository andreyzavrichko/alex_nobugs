package no.bugs.homework5.task1;

import static no.bugs.homework5.task1.CustomerType.*;

public class DiscountCalculator {

    public static double calculateDiscount(String customerType, double amount) {
        try {
            CustomerType type = CustomerType.fromString(customerType);
            return amount * type.getDiscount();
        } catch (IllegalArgumentException e) {
            return 0;
        }
    }


    public static void main(String[] args) {
        System.out.println(calculateDiscount(String.valueOf(VIP), 120));
        System.out.println(calculateDiscount(String.valueOf(EMPLOYEE), 120));
        System.out.println(calculateDiscount(String.valueOf(REGULAR), 120));
    }
}
