package littleProjects;

public class Karta {
    
    public int getNumericValue() {
        return numericValue;
    }

    public void setNumericValue(int numericValue) {
        this.numericValue = numericValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    private String value = "2Kier";
    private int numericValue = 2;
    private String stringValue = "";
    private Boolean visible = false;
    private int position = Integer.MIN_VALUE;

    public Karta(String value, Boolean visibility){
        this.value = value;
        this.visible = visibility;
    }

    public Karta(String value, Boolean visibility, int position){
        this.value = value;
        this.visible = visibility;
        this.position = position;
    }

    public Karta(String value, Boolean visibility, int numericValue, String stringValue){
        this.value = value;
        this.visible = visibility;
        this.numericValue = numericValue;
        this.stringValue = stringValue;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        result = prime * result + ((visible == null) ? 0 : visible.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Karta other = (Karta) obj;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        if (visible == null) {
            if (other.visible != null)
                return false;
        } else if (!visible.equals(other.visible))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Karta [position=" + position + ", value=" + value + ", visible=" + visible + "]";
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

}
