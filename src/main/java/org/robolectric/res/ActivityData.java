package org.robolectric.res;

public class ActivityData {
  private final String name;
  private final String themeRef;
  private final String parentName;

  public ActivityData(String name, String themeRef, String parentName) {
    this.name = name;
    this.themeRef = themeRef;
    this.parentName = parentName;
  }

  public String getName() {
    return name;
  }

  public String getThemeRef() {
    return themeRef;
  }

    public String getParentName() {
        return parentName;
    }
}
