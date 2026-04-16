package ntu.cntt2.luyentap;

public class LandScape {
    String landImageFileName;
    String landCation;

    public LandScape(String landImageFileNames, String landCation) {
        this.landImageFileName = landImageFileNames;
        this.landCation = landCation;
    }

    public String getLandImageFileName() {
        return landImageFileName;
    }

    public void setLandImageFileName(String landImageFileNames) {
        this.landImageFileName = landImageFileNames;
    }

    public String getLandCation() {
        return landCation;
    }

    public void setLandCation(String landCation) {
        this.landCation = landCation;
    }
}
