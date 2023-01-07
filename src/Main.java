public class Main {
    public static void main(String[] args) {
        public class Car {
            // Araç türü (SUV, Sedan, Hatchback)
            private String type;
            // Kiralama şekli (gunluk, aylik)
            private String rentalPeriod;
            // Vatandaş veya şirket
            private String customerType;

            // Ayrıca, araç özelliklerini tutan bir CarFeatures sınıfı oluşturun
            private CarFeatures features;

            // Sınıfın yapıcı metodu
            public Car(String type, String rentalPeriod, String customerType, CarFeatures features) {
                this.type = type;
                this.rentalPeriod = rentalPeriod;
                this.customerType = customerType;
                this.features = features;
            }

            // Diğer metodlar (getter ve setter gibi)
        }

        public class CarFeatures {
            // Bagaj kapasitesi
            private int trunkCapacity;
            // Rengi
            private String color;
            // Diğer özellikler

            // Sınıfın yapıcı metodu
            public CarFeatures(int trunkCapacity, String color, ...) {
                this.trunkCapacity = trunkCapacity;
                this.color = color;
                // Diğer özellikleri atayın
            }

            // Diğer metodlar (getter ve setter gibi)
        }

    }
}