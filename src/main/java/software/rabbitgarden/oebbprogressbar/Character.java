package software.rabbitgarden.oebbprogressbar;

import javax.swing.*;

public enum Character {

    LOK0( Icons.LOK0 ),
    LOK1( Icons.LOK1 ),
    LOK2( Icons.LOK2 ),
    LOK3( Icons.LOK3 ),
    LOK4( Icons.LOK4 ),
    LOK5( Icons.LOK5 ),
    LOK6( Icons.LOK6 ),
    LOK7( Icons.LOK7 ),
    LOK8( Icons.LOK8 ),
    LOK9( Icons.LOK9 )    ;

    private final ImageIcon icon;

    Character(ImageIcon icon) {
        this.icon = icon;
    }

    public ImageIcon getIcon() {
        return icon;
    }

}