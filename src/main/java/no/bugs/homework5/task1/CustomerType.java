package no.bugs.homework5.task1;

public enum CustomerType {
    REGULAR(0.05),
    VIP(0.10),
    EMPLOYEE(0.30);

    private final double discount;

    CustomerType(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public static CustomerType fromString(String customerType) {
        for (CustomerType type : values()) {
            if (type.name().equalsIgnoreCase(customerType)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Неизвестный тип: " + customerType);
    }
}
