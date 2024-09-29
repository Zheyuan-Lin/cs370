package dao;

public class Accommodation {
        private String type;
        private int minRating;
        private double maxPricePerNight;

        public Accommodation(String type, int minRating, double maxPricePerNight) {
            this.type = type;
            this.minRating = minRating;
            this.maxPricePerNight = maxPricePerNight;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getMinRating() {
            return minRating;
        }

        public void setMinRating(int minRating) {
            this.minRating = minRating;
        }

        public double getMaxPricePerNight() {
            return maxPricePerNight;
        }

        public void setMaxPricePerNight(double maxPricePerNight) {
            this.maxPricePerNight = maxPricePerNight;
        }
    }

