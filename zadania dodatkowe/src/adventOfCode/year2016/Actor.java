package adventOfCode.year2016;

enum Orientation {
    NORTH,
    EAST,
    SOUTH,
    WEST;

    Orientation next(){
        if(this == NORTH){
            return EAST;
        }
        if(this == EAST){
            return SOUTH;
        }
        if(this == SOUTH){
            return WEST;
        }
        if(this == WEST){
            return NORTH;
        }
        return null;
    }

    Orientation prev(){
        if(this == NORTH){
            return WEST;
        }
        if(this == EAST){
            return NORTH;
        }
        if(this == SOUTH){
            return EAST;
        }
        if(this == WEST){
            return SOUTH;
        }
        return null;
    }
}

class Actor {
    int x = 0;
    int y = 0;
    Orientation orientation = Orientation.NORTH;
    int distanceFromXY = 0;

    Actor(){

    }

    Actor(int x, int y, Orientation orientation){
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    void turnClockwise(){
        orientation = orientation.next();
    }

    void turnCounterClockwise(){
        orientation = orientation.prev();
    }

    void go(String s){
        if(s.split("")[0].equals("R")){
            turnClockwise();
        } else{
            turnCounterClockwise();
        }
        switch (orientation){            
            case NORTH: x += Integer.parseInt(s.split("")[1]);
                        distanceFromXY += Integer.parseInt(s.split("")[1]);
                        break;
            case EAST:  y += Integer.parseInt(s.split("")[1]);
                        distanceFromXY += Integer.parseInt(s.split("")[1]);
                        break;
            case SOUTH: x -= Integer.parseInt(s.split("")[1]);
                        distanceFromXY -= Integer.parseInt(s.split("")[1]);
                        break;    
            case WEST:  y -= Integer.parseInt(s.split("")[1]);
                        distanceFromXY -= Integer.parseInt(s.split("")[1]);
                        break;        
        }
    }

}
