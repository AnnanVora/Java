module Java {
    requires httpclient5;
    requires httpcore5;
    requires junit;
    requires java.xml;
    requires javafx.controls;
    requires java.desktop;

    opens com.annan.section18.Banking;
    opens com.annan.section18.DebuggerDemo;
    opens com.annan.section18.challenge1;
    opens com.annan.section18.challenge2;
    opens com.annan.section18.challenge3;
    opens com.annan.section18.challenge4;
    opens com.annan.section18.challenge5;
    opens com.annan.section18.challenge6;
    opens com.annan.section18.challenge7;
    opens com.annan.section18.challenge8;
    opens com.annan.section18.challenge9;
    opens com.annan.section18.challenge10;
}