public class Header {

    String heightMeasure;
    String weightMeasure;

    public Header(String heightMeasure, String weightMeasure) {
        this.heightMeasure = heightMeasure;
        this.weightMeasure = weightMeasure;
    }

    @Override
    public String toString() {
        String output = String.format("%-10s %10s %20s", "Name", "Height " + heightMeasure,
                "Weight " + weightMeasure);

        return output;
    }
}
