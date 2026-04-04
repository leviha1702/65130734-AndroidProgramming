package ntu.cntt2.usingrecyclerview;

public class LandScape {
    String landImageFileNames;
    String landCation;

    public LandScape(String landImageFileNames, String landCation) {
        this.landImageFileNames = landImageFileNames;
        this.landCation = landCation;
    }

    public String getLandImageFileNames() {
        return landImageFileNames;
    }

    public void setLandImageFileNames(String landImageFileNames) {
        this.landImageFileNames = landImageFileNames;
    }

    public String getLandCation() {
        return landCation;
    }

    public void setLandCation(String landCation) {
        this.landCation = landCation;
    }
}
