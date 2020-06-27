package com.annan.section9.InterfacesChallenge;

import java.util.List;

public interface ISavable {

    List<String> write();

    void read(List<String> savedValues);
}
