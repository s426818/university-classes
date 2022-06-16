package pasjans;

public class Card {
    
    private String value = "";
    private Boolean visibility = false;
    private Boolean movable = false;
    private Boolean checked = false;
    private int position = Integer.MIN_VALUE;

    public Card(String value, Boolean visibility, int position, Boolean movable, Boolean checked){
        this.value = value;
        this.visibility = visibility;
        this.position = position;
        this.movable = movable;
        this. checked = checked;
    }

    String getValue() {
        return value;
    }

    void setValue(String value) {
        this.value = value;
    }

    Boolean getVisibility() {
        return visibility;
    }

    void setVisibility(Boolean visibility) {
        this.visibility = visibility;
    }

    int getPosition() {
        return position;
    }

    void setPosition(int position) {
        this.position = position;
    }

    Boolean getMovable() {
        return movable;
    }

    void setMovable(Boolean movable) {
        this.movable = movable;
    }

    Boolean getChecked() {
        return checked;
    }

    void setChecked(Boolean checked) {
        this.checked = checked;
    }

    

}
