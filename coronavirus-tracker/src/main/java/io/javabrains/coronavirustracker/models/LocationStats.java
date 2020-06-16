package io.javabrains.coronavirustracker.models;

public class LocationStats {

    private String state;
    private String country;
    private int latestTotalCases;
    private int diffFromPrevDay;

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public int getDiffFromPrevDay() {
        return diffFromPrevDay;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String county) {
        this.country = county;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    public void setDiffFromPrevDay(int diffFromPrevDay) {
        this.diffFromPrevDay = diffFromPrevDay;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", county='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }
}
