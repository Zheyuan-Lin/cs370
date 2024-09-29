package dao;

public class Transportation {
        private boolean rentalCar;
        private String preferredFlightClass;
        private int maxFlightDuration;

        // Constructor
        public Transportation(boolean rentalCar, String preferredFlightClass, int maxFlightDuration) {
            this.rentalCar = rentalCar;
            this.preferredFlightClass = preferredFlightClass;
            this.maxFlightDuration = maxFlightDuration;
        }

        // Getters and Setters
        public boolean isRentalCar() {
            return rentalCar;
        }

        public void setRentalCar(boolean rentalCar) {
            this.rentalCar = rentalCar;
        }

        public String getPreferredFlightClass() {
            return preferredFlightClass;
        }

        public void setPreferredFlightClass(String preferredFlightClass) {
            this.preferredFlightClass = preferredFlightClass;
        }

        public int getMaxFlightDuration() {
            return maxFlightDuration;
        }

        public void setMaxFlightDuration(int maxFlightDuration) {
            this.maxFlightDuration = maxFlightDuration;
        }

}

