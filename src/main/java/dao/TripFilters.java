package dao;

public class TripFilters {
        private Budget budget;
        private TravelDate travelDates;
        private Accommodation accommodation;
        private Transportation transportation;
        private int numberOfTravelers;

        // Constructor
        public TripFilters(Budget budget, TravelDate travelDates, Accommodation accommodation,
                           Transportation transportation, int numberOfTravelers) {
            this.budget = budget;
            this.travelDates = travelDates;
            this.accommodation = accommodation;
            this.transportation = transportation;
            this.numberOfTravelers = numberOfTravelers;
        }

        // Getters and Setters
        public Budget getBudget() {
            return budget;
        }

        public void setBudget(Budget budget) {
            this.budget = budget;
        }

        public TravelDate getTravelDates() {
            return travelDates;
        }

        public void setTravelDates(TravelDate travelDates) {
            this.travelDates = travelDates;
        }

        public Accommodation getAccommodation() {
            return accommodation;
        }

        public void setAccommodation(Accommodation accommodation) {
            this.accommodation = accommodation;
        }

        public Transportation getTransportation() {
            return transportation;
        }

        public void setTransportation(Transportation transportation) {
            this.transportation = transportation;
        }

        public int getNumberOfTravelers() {
            return numberOfTravelers;
        }

        public void setNumberOfTravelers(int numberOfTravelers) {
            this.numberOfTravelers = numberOfTravelers;
        }

    }

