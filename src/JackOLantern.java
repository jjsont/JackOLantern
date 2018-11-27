public class JackOLantern {

    private String[][] faceFeatures;

    public JackOLantern( String[][] faceFeatures) {
        this.faceFeatures = faceFeatures;
    }

    public void edit(String replace, int row, int column) {
        faceFeatures[row][column]= replace;

    }

    public void fill(String str) {
        for(int i=0;i< faceFeatures.length; i++) {
            for(int k =0; k<faceFeatures[i].length; k++) {
                faceFeatures[i][k] = str;
            }
        }

    }


    public String toString() {
        String pew= "";
        for(int i=0;i< faceFeatures.length; i++) {
            for(int k =0; k<faceFeatures[i].length; k++) {
                pew= pew + faceFeatures[i][k];
            }
            pew= pew + "\n";
        }
        return pew;
    }
}
