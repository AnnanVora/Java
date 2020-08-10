package com.annan.section11.PackageDemo;

import java.util.List;

public interface ISavable {

    List<String> write();

    void read(List<String> savedValues);
}
